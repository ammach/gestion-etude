package fr.norsys.gestionEtude.service.echantillon;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.norsys.gestionEtude.dao.personne.PersonneDAO;
import fr.norsys.gestionEtude.model.Echantillon;
import fr.norsys.gestionEtude.model.FichePersonne;

/**
 * @author Imane
 */
@Service
public class EchantillonServiceImpl implements EchantillonService {

    @Autowired
    public PersonneDAO personneDAO;

    public Echantillon calculerEchantillon(Long idEtude, Echantillon echantillon) {

        Set<FichePersonne> fichePersonnes = new HashSet<FichePersonne>();
        List<FichePersonne> personnes = personneDAO.getByEtudeId(idEtude);

        int nbrEchantillon = Math.max((personnes.size() * echantillon.getTauxSondage()) / 100,
                echantillon.getNombreMinimum());

        // Collections.shuffle(personnes);
        //
        // for (int i = 0; i < nbrEchantillon; i++) {
        //
        // fichePersonnes.add(personnes.get(i));
        //
        // }

        while (fichePersonnes.size() < nbrEchantillon) {

            int nombreAleatoir = (int) (Math.random() * (personnes.size()));
            fichePersonnes.add(personnes.get(nombreAleatoir));

        }

        echantillon.setFichePersonnes(fichePersonnes);

        return echantillon;

    }
}
