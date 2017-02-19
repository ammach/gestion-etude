package fr.norsys.gestionEtude.service.etude;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import fr.norsys.gestionEtude.exception.TechniqueException;
import fr.norsys.gestionEtude.model.Etude;

/**
 * Classe d'implémentation du service métier sur les études
 *
 * @author Imane
 */
@Service
public class EtudeServiceImpl implements EtudeService {

    public List<Etude> getListEtudes() {

        // TODO appel de la DAO
        return null;
    }

    public Optional<Etude> consulter(Long id) throws TechniqueException {

        // TODO appel de la DAO
        return null;
    }

}
