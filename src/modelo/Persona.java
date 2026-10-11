package modelo;

import java.time.LocalDate;
import java.time.Period;

public abstract sealed class Persona permits Paciente , Recepcionista , Medico {
    protected  String dni;
    protected  String nombre;
    protected  String apellido;
    protected LocalDate fechaNacimiento;
    protected  String direccion;
    protected  String telefono;
    protected  String email;

    public Persona(String dni, String nombre, String apellido,LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
    public int getCalcularEdad() {
        if (this.fechaNacimiento == null) {
            return 0; // O manejar el error según tu lógica
        }

        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    public abstract String getRol();

    /// public abstract String getRol();  --Revisar

    /*
    protected  int edad;
    protected  String email;
    protected  String telefono;
    protected  String direccion;
    protected String genero;  // Evaluar si el dominio de este atributo , pueden presentarse en un ENUM
    protected String estadoCivil; // Evaluar si el dominio de este atributo , pueden presentarse en un ENUM

    //Constructor
    public Persona(String nombre, String apellido, String dni, int edad, String email, String telefono, String direccion, LocalDate fechaNacimiento, String genero, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
    }*/
}
