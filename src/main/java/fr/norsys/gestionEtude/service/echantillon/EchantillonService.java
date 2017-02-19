package fr.norsys.gestionEtude.service.echantillon;

import fr.norsys.gestionEtude.model.Echantillon;

/**
 * @author Imane
 */
public interface EchantillonService {

    Echantillon calculerEchantillon(Long idEtude, Echantillon echantillon);

}
