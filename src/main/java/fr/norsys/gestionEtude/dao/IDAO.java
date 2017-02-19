package fr.norsys.gestionEtude.dao;

import java.util.Optional;

import fr.norsys.gestionEtude.exception.TechniqueException;

/**
 * Dao générique qui fournit les méthodes CRUD
 *
 * @author Imane
 * @param <T>
 */
public interface IDAO<T> {

    /**
     * Crée un objet modele
     *
     * @param model
     * @return model created
     */
    T create(T model) throws TechniqueException;

    /**
     * Met à jour l'objet model
     *
     * @param model
     */
    void update(T model) throws TechniqueException;

    /**
     * récupère l'objet modèle grâce à son identifiant
     *
     * @param id
     * @return l'objet model recherché
     */
    Optional<T> getById(Long id) throws TechniqueException;

    /**
     * Supprimer l'objet model
     *
     * @param model
     */
    void delete(T model) throws TechniqueException;

}
