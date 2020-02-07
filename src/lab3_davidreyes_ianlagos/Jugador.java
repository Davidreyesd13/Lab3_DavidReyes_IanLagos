/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_davidreyes_ianlagos;

public class Jugador {

    private int numero_camisa;
    private int tiro_de_3;
    private int defensa;
    private int tiro_media;
    private int rebote;
    private int Bandeja;
    private int Pases;
    private int Posteo;
    private int altura;
    
    public Jugador() {
    }

    public Jugador(int numero_camisa, int tiro_de_3, int defensa, int tiro_media, int rebote, int Bandeja, int Pases, int Posteo, int altura) {
        this.numero_camisa = numero_camisa;
        this.tiro_de_3 = tiro_de_3;
        this.defensa = defensa;
        this.tiro_media = tiro_media;
        this.rebote = rebote;
        this.Bandeja = Bandeja;
        this.Pases = Pases;
        this.Posteo = Posteo;
        this.altura = altura;
    }

    public int getNumero_camisa() {
        return numero_camisa;
    }

    public void setNumero_camisa(int numero_camisa) {
        this.numero_camisa = numero_camisa;
    }

    public int getTiro_de_3() {
        return tiro_de_3;
    }

    public void setTiro_de_3(int tiro_de_3) {
        this.tiro_de_3 = tiro_de_3;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getTiro_media() {
        return tiro_media;
    }

    public void setTiro_media(int tiro_media) {
        this.tiro_media = tiro_media;
    }

    public int getRebote() {
        return rebote;
    }

    public void setRebote(int rebote) {
        this.rebote = rebote;
    }

    public int getBandeja() {
        return Bandeja;
    }

    public void setBandeja(int Bandeja) {
        this.Bandeja = Bandeja;
    }

    public int getPases() {
        return Pases;
    }

    public void setPases(int Pases) {
        this.Pases = Pases;
    }

    public int getPosteo() {
        return Posteo;
    }

    public void setPosteo(int Posteo) {
        this.Posteo = Posteo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
