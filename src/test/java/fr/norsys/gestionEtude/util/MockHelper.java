package fr.norsys.gestionEtude.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.springframework.aop.framework.Advised;
import org.springframework.aop.support.AopUtils;
import org.springframework.test.util.ReflectionTestUtils;

public class MockHelper {

    /**
     * Fonction utilitaire permettant de remplacer la valeur d'un champ d'une
     * instance.<br>
     * Cette fonction se base sur la classe utilitaire
     * {@link ReflectionTestUtils} mais y ajoute le support des Proxy.
     * 
     * @param target l'intance cible.
     * @param name le nom du champ dont la valeur est à remplacer.
     * @param value la valeur du champ.
     * @throws Exception Si l'injection échoue.
     */
    public static void mockField(Object target, String fieldName, Object value) throws Exception {

        Object targetTmp = target;

        if (AopUtils.isJdkDynamicProxy(target)) {
            targetTmp = ((Advised) target).getTargetSource().getTarget();
        }

        ReflectionTestUtils.setField(targetTmp, fieldName, value);
    }

    /**
     * Fonction utilitaire permettant de remplacer la valeur d'un champ static
     * d'une instance.<br>
     * Cette fonction se base sur la classe utilitaire
     * {@link ReflectionTestUtils} mais y ajoute le support des Proxy.
     * 
     * @param target l'intance cible.
     * @param name le nom du champ dont la valeur est à remplacer.
     * @param value la valeur du champ.
     * @throws Exception Si l'injection échoue.
     */
    public static void mockStaticField(Object target, String fieldName, Object value) throws Exception {

        Object targetTmp = target;

        if (AopUtils.isJdkDynamicProxy(target)) {
            targetTmp = ((Advised) target).getTargetSource().getTarget();
        }

        Field field = targetTmp.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, value);
    }
}
