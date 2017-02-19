package fr.norsys.gestionEtude.dao.typehandler;

import org.apache.ibatis.type.EnumTypeHandler;
import org.apache.ibatis.type.MappedTypes;

import fr.norsys.gestionEtude.enums.ContextePsychologique;

@MappedTypes(ContextePsychologique.class)
public class ContextPsychologiqueTypeHandler extends EnumTypeHandler<ContextePsychologique> {

    public ContextPsychologiqueTypeHandler(Class<ContextePsychologique> type) {

        super(type);
    }

}
