package modelo;

import java.time.LocalDate;

public final class Recepcionista extends Persona{
    private String turno;
    public Recepcionista(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String turno) {
        super(dni, nombre, apellido, fechaNacimiento);
        this.turno = turno;
    }

    @Override
    public String getRol(){
        return "Recepcionista";
    }

    /*public Cita registrarPaciente(Paciente paciente,Medico medico,Consultorio consultorio, LocalDate fecha){}*/

}
