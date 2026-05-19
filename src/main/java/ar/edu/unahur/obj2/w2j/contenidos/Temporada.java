package ar.edu.unahur.obj2.w2j.contenidos;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private final Integer NUMERO_DE_TEMPORADA;
    private List<Episodio> episodios = new ArrayList<>();

    public Temporada(Integer nUMERO_DE_TEMPORADA) {
        NUMERO_DE_TEMPORADA = nUMERO_DE_TEMPORADA;
    }

//********************************************
    
    public Integer getNUMERO_DE_TEMPORADA() {
        return NUMERO_DE_TEMPORADA;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void agregarEpisodio(Episodio episodio) {
        this.episodios.add(episodio);
    }

//********************************************
    public Double calcularCostoDeTemporada() {
        return this.episodios.stream()
                    .mapToDouble(Episodio::getCostoDeEpisodio)
                    .sum();
    }
}
