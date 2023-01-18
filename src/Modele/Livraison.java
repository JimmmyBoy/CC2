package Modele;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

@Entity
@Table(name = "livraison")
public class Livraison {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_livraison")
	private int Id_livraison;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_livraison")
	private Date Date_livraison;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "heure_livraison")
	private Time Heure_livraison;
	
	@OneToOne
	@JoinColumn(name = "id_contrat", referencedColumnName = "id_contrat")
	private int Id_contrat;

	public Livraison(int id_livraison, Date date_livraison, Time heure_livraison, int id_contrat) {
		super();
		Id_livraison = id_livraison;
		Date_livraison = date_livraison;
		Heure_livraison = heure_livraison;
		Id_contrat = id_contrat;
	}

	public Livraison() {
		 
	}
	
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

	public int getContrat() {
		return Id_contrat;
	}

	public void setContrat(int id_contrat) {
		Id_contrat = id_contrat;
	}
}
