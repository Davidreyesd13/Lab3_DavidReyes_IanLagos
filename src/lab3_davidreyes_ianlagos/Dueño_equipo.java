/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_davidreyes_ianlagos;


public class Dueño_equipo {
    private double net_worth;
    private String nacimiento;

    public Dueño_equipo() {
    }
    
    public Dueño_equipo(double net_worth, String nacimiento) {
        this.net_worth = net_worth;
        this.nacimiento = nacimiento;
    }

    public double getNet_worth() {
        return net_worth;
    }

    public void setNet_worth(double net_worth) {
        this.net_worth = net_worth;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
    
}
