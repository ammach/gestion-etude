package fr.norsys.gestionEtude.dao.etude;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import fr.norsys.gestionEtude.dao.ADAOTest;
import fr.norsys.gestionEtude.dao.mapper.EtudeMapper;
import fr.norsys.gestionEtude.util.MockHelper;

/**
 * @author Imane
 */
public abstract class AEtudeDAOTest extends ADAOTest {

    @Autowired
    protected EtudeDAO etudeDAO;

    protected EtudeDAO etudeDAOWithMocks;

    @Mock
    protected EtudeMapper mockEtudeMapper;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

        this.etudeDAOWithMocks = new EtudeDAOImpl();

        MockHelper.mockField(this.etudeDAOWithMocks, "etudeMapper", this.mockEtudeMapper);

    }

}
