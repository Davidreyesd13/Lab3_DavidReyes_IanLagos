/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_davidreyes_ianlagos;

/**
 *
 * @author ian
 */
public class Entrenador {

    private String exjugador_sn;
    private Jugadas jugadas_fav;
    protected String tipo_entrenador;

    public Entrenador() {
    }

    public Entrenador(String exjugador_sn, Jugadas jugadas_fav, String tipo_entrenador) {
        this.exjugador_sn = exjugador_sn;
        this.jugadas_fav = jugadas_fav;
        this.tipo_entrenador = tipo_entrenador;
    }

    public String getExjugador_sn() {
        return exjugador_sn;
    }

    public void setExjugador_sn(String exjugador_sn) {
        this.exjugador_sn = exjugador_sn;
    }

    public Jugadas getJugadas_fav() {
        return jugadas_fav;
    }

    public void setJugadas_fav(Jugadas jugadas_fav) {
        this.jugadas_fav = jugadas_fav;
    }

    public String getTipo_entrenador() {
        return tipo_entrenador;
    }

    public void setTipo_entrenador(String tipo_entrenador) {
        this.tipo_entrenador = tipo_entrenador;
    }
    
}
