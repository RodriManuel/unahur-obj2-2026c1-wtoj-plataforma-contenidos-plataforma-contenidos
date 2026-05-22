package ar.edu.unahur.obj2.w2j.usuarios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.planes.PlanStrategy;

public class Usuario {
    private PlanStrategy planContratado;
    private List<Contenido> listaDeContenidosConsumidos = new ArrayList<>();

    public Usuario(PlanStrategy planContratado) {
        this.planContratado = planContratado;
    }

//********************************************
    
    public PlanStrategy getPlanContratado() {
        return planContratado;
    }

    public List<Contenido> getListaDeContenidosConsumidos() {
        return listaDeContenidosConsumidos;
    }
    
//********************************************

}
