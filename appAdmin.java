package voxi.fr.admin;

public class appAdmin {
	public static void main(String[] args) {
		Lecteur lecteur1 = new Lecteur (101 , "SANTERRE","Jean",20);
		System.out.println (lecteur1.toString());
		System.out.println ("Nom du lecteur numéro "+lecteur1.getNumero()+" : "+lecteur1.getNom());
		
		Lecteur lecteur2= new Lecteur (102 , "NANATO","Isabelle",0);
		System.out.println ("Nom du lecteur numéro "+lecteur2.getNumero()+" : "+lecteur2.getNom());
		System.out.println (lecteur2.toString());
		lecteur2.setNom("SANTERRE") ;
		System.out.println ("La lectrice numéro "+lecteur2.getNumero()+" vient de se marier et se nomme maintenant "+lecteur1.getNom());
		System.out.println ("Nom du lecteur numéro "+lecteur2.getNumero()+" : "+lecteur2.getNom());
		
		if(lecteur1.estActif()==true) {
			System.out.println("Le lecteur "+lecteur1.getNumero()+" est actif");
			}
		else {
			System.out.println("Le lecteur "+lecteur1.getNumero()+" n'est pas actif");
		}
		if(lecteur2.estActif()==true) {
			System.out.println("Le lecteur "+lecteur2.getNumero()+" est actif");
			}
		else {
			System.out.println("Le lecteur "+lecteur2.getNumero()+" n'est pas actif");
		}
		System.out.println("Nombre d'audiobooks produits par le lecteur "+lecteur1.getNumero()+" : "+lecteur1.getNbAudiobooks());
		lecteur1.produitUnAudioBooks(1);
		System.out.println("Nombre d'audiobooks produits par le lecteur "+lecteur1.getNumero()+" : "+lecteur1.getNbAudiobooks());
		
		
		
	}
}