package modelo;

import java.time.LocalDate;

public final class  Paciente extends Persona{
    private String grupoSanguineo;
    private String seguro;
    // HistoriaClinica historia;

    public Paciente(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String seguro) {
        super(dni, nombre, apellido, fechaNacimiento);
        this.seguro = seguro;
    }

    @Override
    public String getRol(){
        return "Paciente";
    }

    /*public HistoriaClinica getHistoria(){
        return this.historia;
    }*/
}
