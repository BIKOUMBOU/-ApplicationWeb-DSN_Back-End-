package fr.difftech.suivi_installation_dsn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="site")
public class Site {

    @Id
    @GeneratedValue

    private int id;
    private String priorite;
    private String nom;
    private int    siren;
    private String statusinstal;
    private String hebergement;
    private String acces;
    private String resprojet;
    private String consuldsn;
    private String versagirh;
    private String versprodige;
    private String ifp;
    private String mirth;
    private String webserpH7;
    private String configagirh;
    private String configprodige;
    private String nomencdesabsences;
    private String nomencdesemplois;
    private String nomencdestatuts;





}
