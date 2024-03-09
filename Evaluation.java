package fr.voxi.admin;

public class Evaluation {
	private int numéro;
	private int note ;
	private String commentaire ;
	private int nombreDeJAime;
	private String validée ;
	
	public Evaluation(int numéro, int note, String commentaire, int nombreDeJAime, String validée) {
		super();
		this.numéro=numéro;
		this.note=note;
		this.commentaire=commentaire;
		this.nombreDeJAime=nombreDeJAime;
		this.validée=validée;
		
	}
	
	public Evaluation(int numéro, int note, String commentaire) {
		super();
		this.numéro=numéro;
		this.note=note;
		this.commentaire=commentaire;
		
	}

	public int getNuméro() {
		return numéro;
	}

	public void setNuméro(int numéro) {
		this.numéro = numéro;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public int getNombreDeJAime() {
		return nombreDeJAime;
	}

	public void setNombreDeJAime(int nombreDeJAime) {
		this.nombreDeJAime = nombreDeJAime;
	}

	public String getValidée() {
		return validée;
	}

	public void setValidée(String validée) {
		this.validée = validée;
	}

	@Override
	public String toString() {
		return "Evaluation [" + numéro + ", " + note + ", " + commentaire + ", "
				+ nombreDeJAime + ", " + validée + "]";
	}

	public void AjoutDunJaime(int nbJaime) {
		nombreDeJAime=nombreDeJAime+nbJaime;
		 }

	
	
}
