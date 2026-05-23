package ar.edu.unahur.obj2.w2j.usuarios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.planes.PlanStrategy;

public class Usuario {
    private PlanStrategy planContratado;
    private List<Contenido> contenidosConsumidos = new ArrayList<>();

    public Usuario(PlanStrategy planContratado) {
        this.planContratado = planContratado;
    }

//********************************************
    
    public PlanStrategy getPlanContratado() {
        return planContratado;
    }

    public List<Contenido> getContenidosConsumidos() {
        return new ArrayList<>(contenidosConsumidos);
    }

    public void cambiarPlanContratado(PlanStrategy nuevoPlan) {
        this.planContratado = nuevoPlan;
    }
    
//********************************************

    public Double calcularCostoMensual() {
        Double costoDePlanContratado = planContratado.costoMensualTotal(this);

        return costoDePlanContratado;
    }

    public void limpiarListaDeContenidosConsumidos() {
        this.contenidosConsumidos.clear();
    }
}
