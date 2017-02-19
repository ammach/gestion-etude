package fr.norsys.gestionEtude.dao.etude;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.springframework.jdbc.BadSqlGrammarException;

import fr.norsys.gestionEtude.exception.TechniqueException;
import fr.norsys.gestionEtude.model.Etude;

/**
 * classe de teste de la methode getById du dao Etude
 * 
 * @author Imane
 */
public class GetByIdTest extends AEtudeDAOTest {

    @Test
    public void shouldGetByID() throws Exception {

        Optional<Etude> optional = this.etudeDAO.getById(100L);
        assertTrue(optional.isPresent());

        Etude etude = optional.get();
        assertThat(etude.getId()).isEqualTo(100L);

    }

    @Test
    public void shouldNotGetByID_inexistant() throws Exception {

        Optional<Etude> optional = this.etudeDAO.getById(395L);
        assertFalse(optional.isPresent());

    }

    @Test(expected = TechniqueException.class)
    public void shouldNotGetByID_ThrowException() throws Exception {

        when(this.mockEtudeMapper.getById(1L)).thenThrow(new BadSqlGrammarException("", "", null));

        try {
            this.etudeDAOWithMocks.getById(1L);
        } catch (TechniqueException e) {
            assertThat(e.getMessage()).isEqualTo(
                    "Une erreur est survenue lors de la récupération de l'objet Etude d'id : 1 .");
            verify(this.mockEtudeMapper, times(1)).getById(1L);
            throw e;
        }

    }
}
