package com.example.projetaback.Entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "promotion", schema = "evae", catalog = "")
public class PromotionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ANNEE_PRO")
    private String anneePro;
    @Basic
    @Column(name = "CODE_FORMATION")
    private String codeFormation;
    @Basic
    @Column(name = "NO_ENSEIGNANT")
    private Integer noEnseignant;
    @Basic
    @Column(name = "SIGLE_PRO")
    private String siglePro;
    @Basic
    @Column(name = "NB_ETU_SOUHAITE")
    private int nbEtuSouhaite;
    @Basic
    @Column(name = "ETAT_PRESELECTION")
    private String etatPreselection;
    @Basic
    @Column(name = "DATE_RENTREE")
    private Date dateRentree;
    @Basic
    @Column(name = "LIEU_RENTREE")
    private String lieuRentree;
    @Basic
    @Column(name = "DATE_REPONSE_LP")
    private Date dateReponseLp;
    @Basic
    @Column(name = "COMMENTAIRE")
    private String commentaire;
    @Basic
    @Column(name = "DATE_REPONSE_LALP")
    private Date dateReponseLalp;
    @Basic
    @Column(name = "PROCESSUS_STAGE")
    private String processusStage;
    @Basic
    @Column(name = "NO_EVALUATION")
    private Integer noEvaluation;
    @Basic
    @Column(name = "NO_BAREME")
    private Integer noBareme;

    public String getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(String anneePro) {
        this.anneePro = anneePro;
    }

    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    public Integer getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(Integer noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    public String getSiglePro() {
        return siglePro;
    }

    public void setSiglePro(String siglePro) {
        this.siglePro = siglePro;
    }

    public int getNbEtuSouhaite() {
        return nbEtuSouhaite;
    }

    public void setNbEtuSouhaite(int nbEtuSouhaite) {
        this.nbEtuSouhaite = nbEtuSouhaite;
    }

    public String getEtatPreselection() {
        return etatPreselection;
    }

    public void setEtatPreselection(String etatPreselection) {
        this.etatPreselection = etatPreselection;
    }

    public Date getDateRentree() {
        return dateRentree;
    }

    public void setDateRentree(Date dateRentree) {
        this.dateRentree = dateRentree;
    }

    public String getLieuRentree() {
        return lieuRentree;
    }

    public void setLieuRentree(String lieuRentree) {
        this.lieuRentree = lieuRentree;
    }

    public Date getDateReponseLp() {
        return dateReponseLp;
    }

    public void setDateReponseLp(Date dateReponseLp) {
        this.dateReponseLp = dateReponseLp;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDateReponseLalp() {
        return dateReponseLalp;
    }

    public void setDateReponseLalp(Date dateReponseLalp) {
        this.dateReponseLalp = dateReponseLalp;
    }

    public String getProcessusStage() {
        return processusStage;
    }

    public void setProcessusStage(String processusStage) {
        this.processusStage = processusStage;
    }

    public Integer getNoEvaluation() {
        return noEvaluation;
    }

    public void setNoEvaluation(Integer noEvaluation) {
        this.noEvaluation = noEvaluation;
    }

    public Integer getNoBareme() {
        return noBareme;
    }

    public void setNoBareme(Integer noBareme) {
        this.noBareme = noBareme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PromotionEntity that = (PromotionEntity) o;

        if (nbEtuSouhaite != that.nbEtuSouhaite) return false;
        if (anneePro != null ? !anneePro.equals(that.anneePro) : that.anneePro != null) return false;
        if (codeFormation != null ? !codeFormation.equals(that.codeFormation) : that.codeFormation != null)
            return false;
        if (noEnseignant != null ? !noEnseignant.equals(that.noEnseignant) : that.noEnseignant != null) return false;
        if (siglePro != null ? !siglePro.equals(that.siglePro) : that.siglePro != null) return false;
        if (etatPreselection != null ? !etatPreselection.equals(that.etatPreselection) : that.etatPreselection != null)
            return false;
        if (dateRentree != null ? !dateRentree.equals(that.dateRentree) : that.dateRentree != null) return false;
        if (lieuRentree != null ? !lieuRentree.equals(that.lieuRentree) : that.lieuRentree != null) return false;
        if (dateReponseLp != null ? !dateReponseLp.equals(that.dateReponseLp) : that.dateReponseLp != null)
            return false;
        if (commentaire != null ? !commentaire.equals(that.commentaire) : that.commentaire != null) return false;
        if (dateReponseLalp != null ? !dateReponseLalp.equals(that.dateReponseLalp) : that.dateReponseLalp != null)
            return false;
        if (processusStage != null ? !processusStage.equals(that.processusStage) : that.processusStage != null)
            return false;
        if (noEvaluation != null ? !noEvaluation.equals(that.noEvaluation) : that.noEvaluation != null) return false;
        if (noBareme != null ? !noBareme.equals(that.noBareme) : that.noBareme != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = anneePro != null ? anneePro.hashCode() : 0;
        result = 31 * result + (codeFormation != null ? codeFormation.hashCode() : 0);
        result = 31 * result + (noEnseignant != null ? noEnseignant.hashCode() : 0);
        result = 31 * result + (siglePro != null ? siglePro.hashCode() : 0);
        result = 31 * result + nbEtuSouhaite;
        result = 31 * result + (etatPreselection != null ? etatPreselection.hashCode() : 0);
        result = 31 * result + (dateRentree != null ? dateRentree.hashCode() : 0);
        result = 31 * result + (lieuRentree != null ? lieuRentree.hashCode() : 0);
        result = 31 * result + (dateReponseLp != null ? dateReponseLp.hashCode() : 0);
        result = 31 * result + (commentaire != null ? commentaire.hashCode() : 0);
        result = 31 * result + (dateReponseLalp != null ? dateReponseLalp.hashCode() : 0);
        result = 31 * result + (processusStage != null ? processusStage.hashCode() : 0);
        result = 31 * result + (noEvaluation != null ? noEvaluation.hashCode() : 0);
        result = 31 * result + (noBareme != null ? noBareme.hashCode() : 0);
        return result;
    }
}
