package ar.edu.unahur.obj2.w2j.planes;

public class PlanBasicoStrategy extends PlanConLimiteStrategy {

    public PlanBasicoStrategy(Integer limiteDeContenidos) {
        super(limiteDeContenidos);
    }

//********************************************
    
//********************************************

    @Override
    protected Double aplicarAjuste(Double total) {
        return total;
    }
}
