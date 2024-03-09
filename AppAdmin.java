package fr.voxi.admin;

public class AppAdmin {

	public static void main(String[] args) {
		Evaluation eval1 = new Evaluation(1,5,"Excellent!!!",23,"validée");
		System.out.println (eval1.toString());
		System.out.println ("Un lecteur vient d'indiquer qu'il aime l'évaluation référencée numéro"+eval1.getNuméro());
		eval1.AjoutDunJaime(1);
		System.out.println ("Nombre de J'aime de l'évaluation numéro 1 :"+eval1.getNombreDeJAime());
		
		Evaluation eval2 = eval1 ;
		System.out.println (eval2.toString());
		System.out.println (eval1.toString());
		System.out.println ("Un lecteur vient d'indiquer qu'il aime l'évaluation référencée numéro"+eval2.getNuméro());
		eval2.AjoutDunJaime(1);
		System.out.println ("Nombre de J'aime de l'évaluation numéro 1 :"+eval2.getNombreDeJAime());
		System.out.println (eval1.toString());
		System.out.println( "Réf. Éval. n° 1 : " + eval1.hashCode() ) ;
		System.out.println( "Réf. Éval. n° 2 : " + eval2.hashCode() ) ;
	}

}

