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
public class Asistente_Entrenador extends Entrenador{
    private double salario =1000000;
    public Asistente_Entrenador(String exjugador_sn, Jugadas jugadas_fav, String nombre, String apellido, String Años_profecionales, double salario) {
        super(exjugador_sn, jugadas_fav, nombre, apellido, Años_profecionales);
        this.salario = salario;
        
    }

    @Override
    public String toString() {
        return "Asistente_Entrenador{" + "salario=" + salario + '}';
    }
    
    
    
}
