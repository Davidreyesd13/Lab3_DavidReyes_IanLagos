package lab3_davidreyes_ianlagos;

public class Terapeuta extends medico {

    private int num_terap;
    protected String colegio;

    public Terapeuta(int num_terap, String colegio) {
        super(colegio);
        this.num_terap = num_terap;
    }

    public int getNum_terap() {
        return num_terap;
    }

    public void setNum_terap(int num_terap) {
        this.num_terap = num_terap;
    }

}
