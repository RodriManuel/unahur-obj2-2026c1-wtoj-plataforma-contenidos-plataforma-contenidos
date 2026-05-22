package ar.edu.unahur.obj2.w2j.planes;

import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;

public class PlanFamiliarStrategy extends PlanConLimiteStrategy {
    private Double descuento = 15.0;

    public PlanFamiliarStrategy(Integer limiteDeContenidos) {
        super(limiteDeContenidos);
    }

//********************************************

//********************************************
    @Override
    protected Double aplicarAjuste(Double total) {
        return total - (total / 100 * descuento);
    }
}
