package Modele;

public class Entreprise {
	private String Numero_TVA;
	private String Nom_societe;
	private String Adresse_siege;

	public String getNumero_TVA() {
		return Numero_TVA;
	}

	public void setNumero_TVA(String numero_TVA) {
		Numero_TVA = numero_TVA;
	}

	public String getNom_societe() {
		return Nom_societe;
	}

	public void setNom_societe(String nom_societe) {
		Nom_societe = nom_societe;
	}

	public String getAdresse_siege() {
		return Adresse_siege;
	}

	public void setAdresse_siege(String adresse_siege) {
		Adresse_siege = adresse_siege;
	}

}
