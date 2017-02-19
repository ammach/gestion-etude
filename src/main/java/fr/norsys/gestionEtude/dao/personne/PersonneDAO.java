package fr.norsys.gestionEtude.dao.personne;

import java.util.List;

import fr.norsys.gestionEtude.dao.IDAO;
import fr.norsys.gestionEtude.model.FichePersonne;

/**
 * @author Imane
 */
public interface PersonneDAO extends IDAO<FichePersonne> {

    /**
     * @param etude_id
     * @return
     */
    List<FichePersonne> getByEtudeId(Long etude_id);

}
