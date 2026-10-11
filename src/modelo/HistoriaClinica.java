package modelo;

import java.util.List;
import java.util.SequencedCollection;

public class HistoriaClinica {
    private int numero;
    //private List<Cita> atenciones;
    private List<Receta> recetas;

    /*public void agregarAtencion(Cita){

    }*/
    public void agregarReceta(Receta receta) {
       recetas.add(receta);
    }
    /*public SequencedCollection<Cita> ultimasAtenciones{

    }*/
}
