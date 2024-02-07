package com.example.projetaback.Entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "formation", schema = "evae", catalog = "")
public class FormationEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_FORMATION")
    private String codeFormation;
    @Basic
    @Column(name = "DIPLOME")
    private String diplome;
    @Basic
    @Column(name = "N0_ANNEE")
    private int n0Annee;
    @Basic
    @Column(name = "NOM_FORMATION")
    private String nomFormation;
    @Basic
    @Column(name = "DOUBLE_DIPLOME")
    private String doubleDiplome;
    @Basic
    @Column(name = "DEBUT_HABILITATION")
    private Date debutHabilitation;
    @Basic
    @Column(name = "FIN_HABILITATION")
    private Date finHabilitation;

    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public int getN0Annee() {
        return n0Annee;
    }

    public void setN0Annee(int n0Annee) {
        this.n0Annee = n0Annee;
    }

    public String getNomFormation() {
        return nomFormation;
    }

    public void setNomFormation(String nomFormation) {
        this.nomFormation = nomFormation;
    }

    public String getDoubleDiplome() {
        return doubleDiplome;
    }

    public void setDoubleDiplome(String doubleDiplome) {
        this.doubleDiplome = doubleDiplome;
    }

    public Date getDebutHabilitation() {
        return debutHabilitation;
    }

    public void setDebutHabilitation(Date debutHabilitation) {
        this.debutHabilitation = debutHabilitation;
    }

    public Date getFinHabilitation() {
        return finHabilitation;
    }

    public void setFinHabilitation(Date finHabilitation) {
        this.finHabilitation = finHabilitation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FormationEntity that = (FormationEntity) o;

        if (n0Annee != that.n0Annee) return false;
        if (codeFormation != null ? !codeFormation.equals(that.codeFormation) : that.codeFormation != null)
            return false;
        if (diplome != null ? !diplome.equals(that.diplome) : that.diplome != null) return false;
        if (nomFormation != null ? !nomFormation.equals(that.nomFormation) : that.nomFormation != null) return false;
        if (doubleDiplome != null ? !doubleDiplome.equals(that.doubleDiplome) : that.doubleDiplome != null)
            return false;
        if (debutHabilitation != null ? !debutHabilitation.equals(that.debutHabilitation) : that.debutHabilitation != null)
            return false;
        if (finHabilitation != null ? !finHabilitation.equals(that.finHabilitation) : that.finHabilitation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codeFormation != null ? codeFormation.hashCode() : 0;
        result = 31 * result + (diplome != null ? diplome.hashCode() : 0);
        result = 31 * result + n0Annee;
        result = 31 * result + (nomFormation != null ? nomFormation.hashCode() : 0);
        result = 31 * result + (doubleDiplome != null ? doubleDiplome.hashCode() : 0);
        result = 31 * result + (debutHabilitation != null ? debutHabilitation.hashCode() : 0);
        result = 31 * result + (finHabilitation != null ? finHabilitation.hashCode() : 0);
        return result;
    }
}
