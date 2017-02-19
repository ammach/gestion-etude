package fr.norsys.gestionEtude.dao;

import java.util.Optional;

import lombok.extern.slf4j.Slf4j;

import org.springframework.dao.DataAccessException;

import fr.norsys.gestionEtude.dao.mapper.Mapper;
import fr.norsys.gestionEtude.exception.TechniqueException;

/**
 * Implémentation Dao générique qui fournit les méthodes CRUD
 *
 * @author Imane
 * @param <T>
 */
@Slf4j
public abstract class ADAO<T> implements IDAO<T> {

    private String modelName;

    protected abstract Mapper<T> getMapper();

    /**
     * constructeur par defaut
     */
    public ADAO() {

        super();
    }

    /**
     * contructeur
     *
     * @param clazz
     */
    protected ADAO(Class<T> clazz) {

        this.modelName = clazz.getSimpleName();
    }

    public T create(T model) throws TechniqueException {

        try {
            this.getMapper().create(model);
            return model;
        } catch (DataAccessException dae) {
            String message = "Une erreur est survenue lors de la création de l'objet " + this.modelName + " .";
            log.error(message, dae);

            throw new TechniqueException(message, dae);
        }

    }

    public void update(T model) throws TechniqueException {

        // TODO Auto-generated method stub

    }

    public Optional<T> getById(Long id) throws TechniqueException {

        try {

            T model = this.getMapper().getById(id);
            return Optional.ofNullable(model);
        } catch (DataAccessException dae) {
            throw new TechniqueException("Une erreur est survenue lors de la récupération de l'objet Etude d'id : "
                    + id + " .", dae);
        }
    }

    public void delete(T model) throws TechniqueException {

        // TODO Auto-generated method stub

    }

}
