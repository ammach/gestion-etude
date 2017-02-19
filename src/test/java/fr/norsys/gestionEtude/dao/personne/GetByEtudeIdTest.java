package fr.norsys.gestionEtude.dao.personne;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import fr.norsys.gestionEtude.model.FichePersonne;

/**
 * classe de teste de la methode du DAO getByEtudeId
 * 
 * @author Imane
 */
public class GetByEtudeIdTest extends APersonneDAOTest {

    @Test
    public void shouldGetByEtudeId() throws Exception {

        List<FichePersonne> personnes = this.personneDAO.getByEtudeId(100L);
        assertNotNull(personnes);
        assertEquals(2, personnes.size());
    }

    @Test
    public void shouldNotGetByEtudeId_notExist() throws Exception {

        List<FichePersonne> personnes = this.personneDAO.getByEtudeId(1L);
        assertNotNull(personnes);
        assertTrue(personnes.isEmpty());
    }

}
