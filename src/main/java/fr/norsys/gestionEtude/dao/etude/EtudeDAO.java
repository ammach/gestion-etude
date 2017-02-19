package fr.norsys.gestionEtude.dao.etude;

import java.util.List;

import fr.norsys.gestionEtude.dao.IDAO;
import fr.norsys.gestionEtude.model.Etude;

/**
 * Interface des services DAO relatif au model {@link Etude} étends de
 * l'interface IDAO. IDAO contient les méthodes CRUD commun de l'appli.
 * 
 * @author Imane
 */
public interface EtudeDAO extends IDAO<Etude> {

    /**
     * récupére toutes les études
     * 
     * @return List<Etude>
     */
    List<Etude> getAll();

}
