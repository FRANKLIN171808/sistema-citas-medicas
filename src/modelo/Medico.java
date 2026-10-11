package modelo;

import java.time.LocalDate;
import java.util.List;

public final class Medico extends Persona{
    private String cmp;
    //private Especialidad especialidad;
    //private List<Cita> agenda;

    public Medico(String dni, String nombre, String apellido, LocalDate fechaNacimiento,String cmp/*,Especialidad especialidad*/) {
        super(dni, nombre, apellido, fechaNacimiento);
        this.cmp = cmp;
        //this.especialidad = especialidad;
    }

    public String getRol() {
        return "Medico"; //+ this.especialidad;
    }

    public boolean estaDisponible(){

        return true;
    }

    public void agendarCita(/*Cita*/){

    }
}
