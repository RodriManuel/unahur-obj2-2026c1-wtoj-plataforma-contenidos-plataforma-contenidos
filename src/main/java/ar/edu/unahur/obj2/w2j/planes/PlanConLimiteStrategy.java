package ar.edu.unahur.obj2.w2j.planes;

import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;

public abstract class PlanConLimiteStrategy implements PlanStrategy {
    protected Integer limiteDeContenidos;
    protected Double costoMensualBase = 5.0;

    public PlanConLimiteStrategy(Integer limiteDeContenidos) {
        this.limiteDeContenidos = limiteDeContenidos;
    }

//********************************************
    
//********************************************

    // Template Method
    @Override
    public Double costoMensualTotal(Usuario usuario) {
        List<Contenido> contenidos = usuario.getContenidosConsumidos();
        
        Double costoDeContenidosExcedentes = contenidos.stream()
                                                       .skip(limiteDeContenidos)
                                                       .mapToDouble(Contenido::getCostoBase)
                                                       .sum();

        Double total = this.costoMensualBase + costoDeContenidosExcedentes;        
        
        return aplicarAjuste(total);
    }

    // Hook del Template Method
    protected abstract Double aplicarAjuste(Double total);
}
