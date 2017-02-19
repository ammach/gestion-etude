package fr.norsys.gestionEtude.service.personne;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.norsys.gestionEtude.model.Etude;
import fr.norsys.gestionEtude.model.FichePersonne;

public class GetByEtudeIdTest extends APersonneServiceTest {

    @Test
    public void shouldGetByEtudeId() throws Exception {

        List<FichePersonne> personnes = new ArrayList<FichePersonne>();
        FichePersonne fichePersonne = new FichePersonne();
        fichePersonne.setId(1L);
        fichePersonne.setAge(90);
        Etude etude = new Etude();
        etude.setId(1L);
        fichePersonne.setEtude(etude);
        personnes.add(fichePersonne);
        when(this.mockPersonneDAO.getByEtudeId(1L)).thenReturn(personnes);

        List<FichePersonne> listPersonnes = this.personneService.getByEtudeId(1L);

        assertNotNull(listPersonnes);
        assertEquals(1, listPersonnes.size());

    }

}
