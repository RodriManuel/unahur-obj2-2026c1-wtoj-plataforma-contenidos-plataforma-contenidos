package ar.edu.unahur.obj2.w2j.planes;

public class PlanBasicoStrategy implements PlanStrategy {
    private Integer limiteDeContenido;
    private Double costoMensualBase;

    public PlanBasicoStrategy(Integer limiteDeContenido, Double costoMensualBase) {
        this.limiteDeContenido = limiteDeContenido;
        this.costoMensualBase = costoMensualBase;
    }

//********************************************
    
//********************************************

    @Override
    public Double costoMensualTotal(Usuario usuario) {
        return 0.0;
    }
}
