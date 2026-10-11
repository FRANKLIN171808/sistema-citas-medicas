package modelo;

import java.time.LocalDateTime;

public class Cita {
    private int id;
    private LocalDateTime fechaHora;
    private String motivo;
    private double costo;
    //private EstadoCita estado;
    private boolean pagada;
    private String metodoPago;

    public Cita(Paciente paciente,Medico medico,LocalDateTime fechaHora) {

    }
    /*public Cita(Paciente paciente,Medico medico,Consultorio consultorio, LocalDateTime fechaHora,String motivo){

    }
    public static Cita recostruir(){

    }*/
    public void confirmar(){

    }
    public void cancelar(){

    }
    public void atender(){

    }
    public boolean pagar(String metodoPago){
        return false;
    }


}
