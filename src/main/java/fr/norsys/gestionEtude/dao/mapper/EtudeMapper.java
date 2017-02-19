package fr.norsys.gestionEtude.dao.mapper;

import java.util.List;

import fr.norsys.gestionEtude.model.Etude;

/**
 * Mapper maybatis de l'etude Etude
 * 
 * @author Imane
 */
public interface EtudeMapper extends Mapper<Etude> {

    List<Etude> listeEtudes();

}
