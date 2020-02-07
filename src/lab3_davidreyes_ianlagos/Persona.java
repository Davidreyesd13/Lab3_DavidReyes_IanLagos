/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_davidreyes_ianlagos;

public class Persona {
    private String nombre;
    private String apellido;
    private String Años_profecionales;
    private double salario;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String Años_profecionales, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Años_profecionales = Años_profecionales;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAños_profecionales() {
        return Años_profecionales;
    }

    public void setAños_profecionales(String Años_profecionales) {
        this.Años_profecionales = Años_profecionales;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
