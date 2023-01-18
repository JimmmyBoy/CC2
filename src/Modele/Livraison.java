package Modele;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livraison")
public class Livraison {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_livraison")
	private int Id_livraison;
	private Date Date_livraison;
	private Time Heure_livraison;
	private int Id_contrat;

	public int getId_livraison() {
		return Id_livraison;
	}

	public void setId_livraison(int id_livraison) {
		Id_livraison = id_livraison;
	}

	public Date getDate_livraison() {
		return Date_livraison;
	}

	public void setDate_livraison(Date date_livraison) {
		Date_livraison = date_livraison;
	}

	public Time getHeure_livraison() {
		return Heure_livraison;
	}

	public void setHeure_livraison(Time heure_livraison) {
		Heure_livraison = heure_livraison;
	}

	public int getId_contrat() {
		return Id_contrat;
	}

	public void setId_contrat(int id_contrat) {
		Id_contrat = id_contrat;
	}

}
