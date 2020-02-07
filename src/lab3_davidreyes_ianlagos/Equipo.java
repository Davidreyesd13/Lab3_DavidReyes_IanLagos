package lab3_davidreyes_ianlagos;

import java.util.ArrayList;

public class Equipo{
    private String nombre;
    private String año_fund;
    private int numero_camp;
    private ArrayList<Persona> personal = new ArrayList();

    public Equipo(String nombre, String año_fund, int numero_camp,ArrayList personal) {
        this.nombre = nombre;
        this.año_fund = año_fund;
        this.numero_camp = numero_camp;
        this.personal = personal;
    }

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAño_fund() {
        return año_fund;
    }

    public void setAño_fund(String año_fund) {
        this.año_fund = año_fund;
    }

    public int getNumero_camp() {
        return numero_camp;
    }

    public void setNumero_camp(int numero_camp) {
        this.numero_camp = numero_camp;
    }

    public ArrayList getPersonal() {
        return personal;
    }

    public void setPersonal(ArrayList personal) {
        this.personal = personal;
    }
    
            
}
