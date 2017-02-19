package fr.norsys.gestionEtude.dao.personne;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import fr.norsys.gestionEtude.dao.ADAOTest;
import fr.norsys.gestionEtude.dao.mapper.PersonneMapper;
import fr.norsys.gestionEtude.util.MockHelper;

public abstract class APersonneDAOTest extends ADAOTest {

    @Autowired
    protected PersonneDAO personneDAO;

    protected PersonneDAO personneDAOWithMocks;

    @Mock
    protected PersonneMapper mockPersonneMapper;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

        this.personneDAOWithMocks = new PersonneDAOImpl();

        MockHelper.mockField(this.personneDAOWithMocks, "personneMapper", this.mockPersonneMapper);

    }

}
