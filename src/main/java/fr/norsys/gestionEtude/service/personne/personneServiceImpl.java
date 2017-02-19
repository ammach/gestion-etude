package fr.norsys.gestionEtude.service.personne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.norsys.gestionEtude.dao.personne.PersonneDAO;
import fr.norsys.gestionEtude.model.FichePersonne;

/**
 * Classe d'implémentation du service métier sur les études
 *
 * @author Imane
 */
@Service
public class personneServiceImpl implements PersonneService {

    @Autowired
    private PersonneDAO personneDAO;

    public List<FichePersonne> getByEtudeId(Long etudeId) {

        return personneDAO.getByEtudeId(etudeId);
    }

}
