package com.portfolio.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Persona {

    @Id
    private int id = 1;
    private String nombreCompleto;
    private String fotoPerfil;
    private String acercaDe1;
    private String acercaDe2;
    private String acercaDe3;
    private String puesto;
    private String mail;
    private String linkedin;
    private String github;
    private String facebook;
    private String twitter;
    private String footer1;
    private String footer2;

    public Persona() {
    }

    public Persona(String nombreCompleto, String fotoPerfil, String acercaDe1, String acercaDe2, String acercaDe3, String puesto, String mail, String linkedin, String github, String facebook, String twitter, String footer1, String footer2) {
        this.nombreCompleto = nombreCompleto;
        this.fotoPerfil = fotoPerfil;
        this.acercaDe1 = acercaDe1;
        this.acercaDe2 = acercaDe2;
        this.acercaDe3 = acercaDe3;
        this.puesto = puesto;
        this.mail = mail;
        this.linkedin = linkedin;
        this.github = github;
        this.facebook = facebook;
        this.twitter = twitter;
        this.footer1 = footer1;
        this.footer2 = footer2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getAcercaDe1() {
        return acercaDe1;
    }

    public void setAcercaDe1(String acercaDe1) {
        this.acercaDe1 = acercaDe1;
    }

    public String getAcercaDe2() {
        return acercaDe2;
    }

    public void setAcercaDe2(String acercaDe2) {
        this.acercaDe2 = acercaDe2;
    }

    public String getAcercaDe3() {
        return acercaDe3;
    }

    public void setAcercaDe3(String acercaDe3) {
        this.acercaDe3 = acercaDe3;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFooter1() {
        return footer1;
    }

    public void setFooter1(String footer1) {
        this.footer1 = footer1;
    }

    public String getFooter2() {
        return footer2;
    }

    public void setFooter2(String footer2) {
        this.footer2 = footer2;
    }

}
