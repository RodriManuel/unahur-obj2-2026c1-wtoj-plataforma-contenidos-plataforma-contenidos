package ar.edu.unahur.obj2.w2j.plataforma;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

public class Plataforma {
    private Plataforma instance = new Plataforma();
    private List<Usuario> usuarios = new ArrayList<>();

    private Plataforma() {
    }

//********************************************

    public Plataforma getInstance() {
        return instance;
    }

    public List<Usuario> getUsuarios() {
        return new ArrayList<>(usuarios);
    }

//********************************************

    public Double calcularFacturacionTotal() {
        Double facturacionTotal = this.usuarios.stream()
                                          .mapToDouble(Usuario::calcularCostoMensual)
                                          .sum();
        return facturacionTotal;
    }

    public void reiniciarContenidosConsumidosPorUsuarios() {
        this.usuarios.stream()
                     .forEach(Usuario::limpiarListaDeContenidosConsumidos);
    }
}
