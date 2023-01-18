package Modele;

import java.sql.Date;

import javax.persistence.*;

//test
@Entity
public class Contrat {
	@Id
	private int Id_contrat;
	private Date Date_conclusion;
	private String Adresse;
	private String Description;
	private String test;
	
	@Column(name = "prix_total")
	private float Prix_total;
	@OneToOne
	private int Id_livraison;
	@OneToMany
	@JoinColumn(name = "id_employee")
	private int Id_employee;
	@OneToMany
	private int Id_particulier;
	@OneToMany
	private String Numero_TVA;

	public Contrat() {
	}

	public Contrat(int id_contrat, Date date_conclusion, String adresse, String description, float prix_total, int id_livraison, int id_employee, int id_particulier, String numero_TVA) {
	    this.Id_contrat = id_contrat;
	    this.Date_conclusion = date_conclusion;
	    this.Adresse = adresse;
	    this.Description = description;
	    this.Prix_total = prix_total;
	    this.Id_livraison = id_livraison;
	    this.Id_employee = id_employee;
	    this.Id_particulier = id_particulier;
	    this.Numero_TVA = numero_TVA;
	}
	
	public int getId_livraison() {
		return Id_livraison;
	}

	public void setId_livraison(int id_livraison) {
		Id_livraison = id_livraison;
	}

	public int getId_employee() {
		return Id_employee;
	}

	public void setId_employee(int id_employee) {
		Id_employee = id_employee;
	}

	public int getId_particulier() {
		return Id_particulier;
	}

	public void setId_particulier(int id_particulier) {
		Id_particulier = id_particulier;
	}

	public String getNumero_TVA() {
		return Numero_TVA;
	}

	public void setNumero_TVA(String numero_TVA) {
		Numero_TVA = numero_TVA;
	}

	public int getId_contrat() {
		return Id_contrat;
	}

	public void setId_contrat(int id_contrat) {
		Id_contrat = id_contrat;
	}

	public Date getDate_conclusion() {
		return Date_conclusion;
	}

	public void setDate_conclusion(Date date_conclusion) {
		Date_conclusion = date_conclusion;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public float getPrix_total() {
		return Prix_total;
	}

	public void setPrix_total(float prix_total) {
		Prix_total = prix_total;
	}
}
