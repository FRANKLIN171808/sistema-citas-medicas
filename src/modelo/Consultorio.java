package modelo;

public class Consultorio {
    private int numero;
    private int piso;
    private boolean ocupado;

    public Consultorio(int numero, int piso) {
        this.numero = numero;
        this.piso = piso;
    }

    public boolean isOcupado(){
        return ocupado;
    }
    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }

}
