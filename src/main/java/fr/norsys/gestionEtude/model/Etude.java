package fr.norsys.gestionEtude.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.apache.ibatis.type.Alias;

import fr.norsys.gestionEtude.enums.EtatEtude;
import fr.norsys.gestionEtude.enums.StatutEtude;

/**
 * Model représentant une Etude.
 * 
 * @author Imane
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Alias("Etude")
public class Etude implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private boolean active;
    private StatutEtude statutEtude;
    private EtatEtude etatEtude;
    private String commentaire;
    private LocalDate dateEvaluation;
    private LocalDate dateValidation;
    private LocalDate dateFinalisation;
    private Set<FichePersonne> fichePersonnes = new HashSet<FichePersonne>(0);

}
