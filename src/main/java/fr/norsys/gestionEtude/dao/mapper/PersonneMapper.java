package fr.norsys.gestionEtude.dao.mapper;

import java.util.List;

import fr.norsys.gestionEtude.model.FichePersonne;

/**
 * @author Imane
 */
public interface PersonneMapper extends Mapper<FichePersonne> {

    List<FichePersonne> getByEtudeId(Long etude_id);

}
