package fr.norsys.gestionEtude.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.norsys.gestionEtude.model.Etude;
import fr.norsys.gestionEtude.service.etude.EtudeService;

@Controller
@RequestMapping("/etude")
public class EtudeController {
	private EtudeService etudeService;
	
    // TODO ajouter une méthode afin de récupérer toutes les études et les
    // afficher dans la page etude.html.

	
	@RequestMapping(value = "/listetudes", method = RequestMethod.GET)
	public List<Etude> getEtudes() {       
		
		      List<Etude> etudes =etudeService.getListEtudes(); 
		
		   return etudes;  }

	
    // TODO ajouter une méthode pour consulter une étude choisie avec ses fiches
    // personnes et les afficher dans la page etudeConsultation.html.
	/* @RequestMapping(value = "/etude", method = RequestMethod.GET)
		public Etude getEtude( @RequestParam Long id) {       
			
			    //  Etude etude = etudeService.consulter(id);
			   return etude;  }*/
}
