package fr.norsys.gestionEtude.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.norsys.gestionEtude.exception.TechniqueException;
import fr.norsys.gestionEtude.model.Echantillon;
import fr.norsys.gestionEtude.model.Etude;
import fr.norsys.gestionEtude.model.FichePersonne;
import fr.norsys.gestionEtude.service.echantillon.EchantillonService;
import fr.norsys.gestionEtude.service.etude.EtudeService;
import fr.norsys.gestionEtude.service.personne.PersonneService;

@Controller
@RequestMapping("/echantillon")
public class EchantillonController {

    @Autowired
    private EtudeService etudeService;

    @Autowired
    private PersonneService personneService;

    @Autowired
    private EchantillonService echantillonService;

    @RequestMapping(value = "/initialiser", method = RequestMethod.GET)
    public String initialiser(@ModelAttribute("echantillon") Echantillon echantillon, @RequestParam Long id, Model model)
            throws TechniqueException {

        Optional<Etude> etude = this.etudeService.consulter(id);
        List<FichePersonne> personnes = this.personneService.getByEtudeId(id);
        model.addAttribute("etude", etude.get());
        model.addAttribute("effectifEtude", personnes.size());

        return "echantillon";

    }

    @RequestMapping(value = "/calculer", method = RequestMethod.POST)
    public String calculer(@ModelAttribute("echantillon") Echantillon echantillon, @RequestParam Long id, Model model)
            throws TechniqueException {

        Optional<Etude> etude = this.etudeService.consulter(id);

        Echantillon echantillonCalculer = this.echantillonService.calculerEchantillon(id, echantillon);
        List<FichePersonne> personnes = this.personneService.getByEtudeId(id);
        model.addAttribute("etude", etude.get());
        model.addAttribute("effectifEtude", personnes.size());
        model.addAttribute("echantillon", echantillonCalculer);

        return "echantillon";

    }
}
