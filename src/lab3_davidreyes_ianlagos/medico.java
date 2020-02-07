/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_davidreyes_ianlagos;


public class medico extends Persona{
    protected String colegio;

    public medico(String colegio, String nombre, String apellido, String Años_profecionales, double salario) {
        super(nombre, apellido, Años_profecionales, salario);
        this.colegio = colegio;
    }

    

    
    
    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    @Override
    public String toString() {
        return "medico{" + "colegio=" + colegio + '}';
    }
    
}
