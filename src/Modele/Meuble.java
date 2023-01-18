package Modele;

public class Meuble {

	private int Id_meuble;
	private float Prix;
	private float Longueur;
	private float Largeur;
	private float Hauteur;
	private String Fournisseur;

	public int getId_meuble() {
		return Id_meuble;
	}

	public void setId_meuble(int id_meuble) {
		Id_meuble = id_meuble;
	}

	public float getPrix() {
		return Prix;
	}

	public void setPrix(float prix) {
		Prix = prix;
	}

	public float getLongueur() {
		return Longueur;
	}

	public void setLongueur(float longueur) {
		Longueur = longueur;
	}

	public float getLargeur() {
		return Largeur;
	}

	public void setLargeur(float largeur) {
		Largeur = largeur;
	}

	public float getHauteur() {
		return Hauteur;
	}

	public void setHauteur(float hauteur) {
		Hauteur = hauteur;
	}

	public String getFournisseur() {
		return Fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		Fournisseur = fournisseur;
	}

}
