package fr.norsys.gestionEtude.service.echantillon;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import fr.norsys.gestionEtude.dao.personne.PersonneDAO;
import fr.norsys.gestionEtude.model.Echantillon;
import fr.norsys.gestionEtude.model.Etude;
import fr.norsys.gestionEtude.model.FichePersonne;
import fr.norsys.gestionEtude.util.MockHelper;

public class CalculerEchantillonTest {

    @Autowired
    private EchantillonService echantillonService;

    @Mock
    public PersonneDAO mockPersonneDAO;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

        this.echantillonService = new EchantillonServiceImpl();

        MockHelper.mockField(this.echantillonService, "personneDAO", this.mockPersonneDAO);
    }

    @Test
    public void shouldCalculerEchantillon() throws Exception {

        when(this.mockPersonneDAO.getByEtudeId(1L)).thenReturn(new ArrayList<FichePersonne>(this.creeFP()));
        Echantillon echantillonEntree = new Echantillon();
        echantillonEntree.setId(1L);
        echantillonEntree.setNombreMinimum(10);
        echantillonEntree.setTauxSondage(5);
        Etude etude = new Etude();
        etude.setId(1L);
        etude.setFichePersonnes(this.creeFP());

        Echantillon echantillon = this.echantillonService.calculerEchantillon(1L, echantillonEntree);

        assertEquals(10, echantillon.getFichePersonnes().size());

    }

    @Test
    public void shouldCalculerEchantillonByTauxSondage() throws Exception {

        when(this.mockPersonneDAO.getByEtudeId(1L)).thenReturn(new ArrayList<FichePersonne>(this.creeFP()));
        Echantillon echantillonEntree = new Echantillon();
        echantillonEntree.setId(1L);
        echantillonEntree.setNombreMinimum(5);
        echantillonEntree.setTauxSondage(30);
        Etude etude = new Etude();
        etude.setId(1L);
        etude.setFichePersonnes(this.creeFP());

        Echantillon echantillon = this.echantillonService.calculerEchantillon(1L, echantillonEntree);

        assertEquals(6, echantillon.getFichePersonnes().size());

    }

    private Set<FichePersonne> creeFP() {

        Set<FichePersonne> fichePersonnes = new HashSet<FichePersonne>();

        for (int i = 0; i < 20; i++) {

            FichePersonne fichePersonne = new FichePersonne();
            fichePersonne.setId(i);
            fichePersonne.setAge(i * 10);
            fichePersonnes.add(fichePersonne);

        }

        return fichePersonnes;

    }

}
