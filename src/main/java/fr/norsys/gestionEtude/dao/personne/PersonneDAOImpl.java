package fr.norsys.gestionEtude.dao.personne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.norsys.gestionEtude.dao.ADAO;
import fr.norsys.gestionEtude.dao.mapper.Mapper;
import fr.norsys.gestionEtude.dao.mapper.PersonneMapper;
import fr.norsys.gestionEtude.model.FichePersonne;

/**
 * Implémentation des services DAO relatifs au model {@link FichePersonne}
 *
 * @author Imane
 */
@Repository
public class PersonneDAOImpl extends ADAO<FichePersonne> implements PersonneDAO {

    @Autowired
    private PersonneMapper personneMapper;

    @Override
    protected Mapper<FichePersonne> getMapper() {

        return personneMapper;
    }

    public List<FichePersonne> getByEtudeId(Long etude_id) {

        return personneMapper.getByEtudeId(etude_id);
    }

}
