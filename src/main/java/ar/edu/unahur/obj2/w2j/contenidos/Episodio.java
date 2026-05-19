package ar.edu.unahur.obj2.w2j.contenidos;

public class Episodio {
    private final Integer NUMERO_DE_EPISODIO;
    private final String TITULO_DE_EPISODIO;
    private Double costoDeEpisodio;
    
    public Episodio(Integer nUMERO_DE_EPISODIO, String tITULO_DE_EPISODIO, Double costoDeEpisodio) {
        NUMERO_DE_EPISODIO = nUMERO_DE_EPISODIO;
        TITULO_DE_EPISODIO = tITULO_DE_EPISODIO;
        this.costoDeEpisodio = costoDeEpisodio;
    }

//********************************************

    public Integer getNUMERO_DE_EPISODIO() {
        return NUMERO_DE_EPISODIO;
    }

    public String getTITULO_DE_EPISODIO() {
        return TITULO_DE_EPISODIO;
    }

    public Double getCostoDeEpisodio() {
        return costoDeEpisodio;
    }
    
//********************************************
}
