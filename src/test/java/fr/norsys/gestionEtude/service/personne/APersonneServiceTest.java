package fr.norsys.gestionEtude.service.personne;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import fr.norsys.gestionEtude.dao.personne.PersonneDAO;
import fr.norsys.gestionEtude.util.MockHelper;

public abstract class APersonneServiceTest {

    @Autowired
    protected PersonneService personneService;

    @Mock
    protected PersonneDAO mockPersonneDAO;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

        this.personneService = new personneServiceImpl();

        MockHelper.mockField(this.personneService, "personneDAO", this.mockPersonneDAO);
    }

}
