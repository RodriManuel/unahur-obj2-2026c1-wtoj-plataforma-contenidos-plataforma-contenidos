package ar.edu.unahur.obj2.w2j.contenidos;

public abstract class Contenido {
    protected String titulo;
    protected Double costoBase;
   
    public Contenido(String titulo, Double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

//********************************************

    public String getTitulo() {
        return titulo;
    }

    public Double getCostoBase() {
        return costoBase;
    }

//********************************************

    // Template Method
    public Double calcularCostoDeLicencia() {
        return this.costoBase + doCostoExtra();
    }

    public abstract Double doCostoExtra();
}
