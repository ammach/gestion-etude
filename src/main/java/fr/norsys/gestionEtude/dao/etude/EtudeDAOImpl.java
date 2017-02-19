package fr.norsys.gestionEtude.dao.etude;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.norsys.gestionEtude.dao.ADAO;
import fr.norsys.gestionEtude.dao.mapper.EtudeMapper;
import fr.norsys.gestionEtude.dao.mapper.Mapper;
import fr.norsys.gestionEtude.model.Etude;

/**
 * Implémentation des services DAO relatifs au model {@link Etude}
 * 
 * @author Imane
 */
@Repository
public class EtudeDAOImpl extends ADAO<Etude> implements EtudeDAO {

    @Autowired
    private EtudeMapper etudeMapper;

    protected EtudeDAOImpl() {

        super(Etude.class);
    }

    @Override
    protected Mapper<Etude> getMapper() {

        return this.etudeMapper;
    }

    public List<Etude> getAll() {

        // les requêtes sont gérées côté xml "etudeMapper.xml "
        return etudeMapper.listeEtudes();
    }

}
