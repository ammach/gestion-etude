package fr.norsys.gestionEtude.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.apache.ibatis.type.Alias;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Alias("Echantillon")
public class Echantillon implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private int nombreMinimum;
    private int tauxSondage;
    private Etude etude;

    private Set<FichePersonne> fichePersonnes = new HashSet<FichePersonne>();

}
