package ar.edu.unahur.obj2.w2j.contenidos;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {
    private List<Temporada> temporadas = new ArrayList<>();;

    public Serie(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }

//********************************************

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

//********************************************

    @Override
    public Double doCostoExtra() {
        return this.temporadas.stream()
                              .mapToDouble(Temporada::calcularCostoDeTemporada)
                              .average()
                              .orElse(0.0);    
    }
}
