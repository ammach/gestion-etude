package fr.norsys.gestionEtude.service.etude;

import java.util.List;
import java.util.Optional;

import fr.norsys.gestionEtude.exception.TechniqueException;
import fr.norsys.gestionEtude.model.Etude;

/**
 * Interface de service métier sur les études
 *
 * @author Imane
 */
public interface EtudeService {

    /**
     * recupére tout les etudes
     * 
     * @return
     */
    List<Etude> getListEtudes();

    /**
     * consulter une etude
     * 
     * @param id l'id de l'etude
     * @return
     * @throws TechniqueException
     */
    Optional<Etude> consulter(Long id) throws TechniqueException;

}
