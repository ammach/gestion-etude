package fr.norsys.gestionEtude.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import fr.norsys.gestionEtude.enums.ContextePsychologique;

/**
 * @author Imane
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FichePersonne implements Serializable {

	/**
	 * Serial Verion UID.
	 */

	private static final long serialVersionUID = 1L;

	private long id;
	private String nom;
	private String prenom;
	private boolean active;
	private Long numero;
	private int age;
	private char sexe;
	private ContextePsychologique contextePsychologique;
	private Etude etude;
	private Echantillon echantillon;

}
