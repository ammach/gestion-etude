insert into etude (ACTIVE,STATUT_ETUDE,ETAT_ETUDE,COMMENTAIRE,DATE_EVALUATION,DATE_VALIDATION,DATE_FINALISATION) 
			values(true,'ACTIVE','INITIALISEE','etude initisier par le gestionnaire','2016-06-06','2016-06-06','2016-06-06');
            
insert into etude (ACTIVE,STATUT_ETUDE,ETAT_ETUDE,COMMENTAIRE,DATE_EVALUATION,DATE_VALIDATION,DATE_FINALISATION) 
			values(true,'ACTIVE','EN_SAISIE','etude initisier par le gestionnaire','2016-07-06','2016-07-06','2016-06-06');

insert into fiche_personne(ACTIVE,NOM,PRENOM,NUMERO,AGE,SEXE,CONTEXTE_PSYCHOLOGIQUE,ETUDE_ID) values
						  (1,'nassif','sanaa',1,90,'H','DEMISSIONNAIRE',1);

insert into fiche_personne(ACTIVE,NOM,PRENOM,NUMERO,AGE,SEXE,CONTEXTE_PSYCHOLOGIQUE,ETUDE_ID) values
						  (1,'rharissa','imane',4,80,'F','COOPERANT',1);
