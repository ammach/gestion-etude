$(function() {
   Etude.init();
});
Etude ={
		init : function() {
			Etude.form = $("#form");
			Etude.inputStatut = $("#statut");
			Etude.inputEtat =$("#etat");
		},
		rechercheEtude : function(){
			Etude.form.submit();
	      }
}