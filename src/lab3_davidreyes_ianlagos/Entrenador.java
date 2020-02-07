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
public class Entrenador extends Persona{

    private String exjugador_sn;
    private Jugadas jugadas_fav;
    

    public Entrenador() {
    }

    public Entrenador(String exjugador_sn, Jugadas jugadas_fav, String nombre, String apellido, String Años_profecionales, double salario) {
        super(nombre, apellido, Años_profecionales, salario);
        this.exjugador_sn = exjugador_sn;
        this.jugadas_fav = jugadas_fav;
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

    
}
