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
public class Medico_general extends medico{
    protected int enfermedades_curadas;
    protected String colegio;

    public Medico_general(int enfermedades_curadas, String colegio, String nombre, String apellido, String Años_profecionales, double salario) {
        super(colegio, nombre, apellido, Años_profecionales, salario);
        this.enfermedades_curadas = enfermedades_curadas;
    }

    public int getEnfermedades_curadas() {
        return enfermedades_curadas;
    }

    public void setEnfermedades_curadas(int enfermedades_curadas) {
        this.enfermedades_curadas = enfermedades_curadas;
    }
    
}
