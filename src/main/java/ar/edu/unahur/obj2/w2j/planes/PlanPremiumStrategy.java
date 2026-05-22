package ar.edu.unahur.obj2.w2j.planes;

public class PlanPremiumStrategy implements PlanStrategy {
    private Double costoMensualBase = 12.0;

    public PlanPremiumStrategy(Double costoMensualBase) {
        this.costoMensualBase = costoMensualBase;
    }

//********************************************

//********************************************
    @Override
    public Double costoMensualTotal(Usuario usuario) {
        return this.costoMensualBase;
    }
}
