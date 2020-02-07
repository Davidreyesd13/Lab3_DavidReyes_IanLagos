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
public class Cirujano extends medico{
    protected int numero_ciru;
    protected String colegio;

    public Cirujano(int numero_ciru, String colegio) {
        super(colegio);
        this.numero_ciru = numero_ciru;
    }
    
    public int getNumero_ciru() {
        return numero_ciru;
    }

    public void setNumero_ciru(int numero_ciru) {
        this.numero_ciru = numero_ciru;
    }
    
}
