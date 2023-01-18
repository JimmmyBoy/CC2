package Modele;

public class Particulier {
	private int Id_particulier;
	private String Nom;
	private String Prenom;
	private String Num_telephone;

	
	public int getId_particulier() {
		return Id_particulier;
	}

	public void setId_particulier(int id_particulier) {
		Id_particulier = id_particulier;
	}

	public String getNum_telephone() {
		return Num_telephone;
	}

	public void setNum_telephone(String num_telephone) {
		Num_telephone = num_telephone;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
}
