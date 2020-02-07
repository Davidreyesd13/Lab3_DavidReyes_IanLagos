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
public class Entrenador_principal extends Entrenador{
    private double salario = 2000000;

    public Entrenador_principal(String exjugador_sn, Jugadas jugadas_fav, String nombre, String apellido, String Años_profecionales,double salario) {
        super(exjugador_sn, jugadas_fav, nombre, apellido, Años_profecionales);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Entrenador_principal{" + "salario=" + salario + '}';
    }

    
}
