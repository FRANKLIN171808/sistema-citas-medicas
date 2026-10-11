package modelo;

import java.time.LocalDate;
import java.util.List;

public class Receta {
    private LocalDate fecha;
    private String diagnostico;
    private List<Medicamento> medicamentos;

    public void agregarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }


}
