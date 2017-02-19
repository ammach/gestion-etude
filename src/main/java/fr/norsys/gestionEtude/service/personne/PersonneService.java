package fr.norsys.gestionEtude.service.personne;

import java.util.List;

import fr.norsys.gestionEtude.model.FichePersonne;

/**
 * Interface de service métier sur les personnes
 *
 * @author Imane
 */
public interface PersonneService {

    /**
     * @param etudeId
     * @return
     */
    List<FichePersonne> getByEtudeId(Long etudeId);

}
