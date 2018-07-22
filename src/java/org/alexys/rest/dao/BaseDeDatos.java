
package org.alexys.rest.dao;

import java.util.List;
import java.util.ArrayList;
import org.alexys.rest.modelo.Articulo;

public final class BaseDeDatos {
    private final static BaseDeDatos baseDeDatos = new BaseDeDatos();
    private final List<Articulo> listado = new ArrayList<>();
    
    private BaseDeDatos(){
        Articulo art1 = new Articulo(1, "Primer articulo", "Primer contenido", "Andres");
        Articulo art2 = new Articulo(2, "Segundo articulo", "Segundo contenido", "Andres");
        Articulo art3 = new Articulo(3, "Tercer articulo", "Tercer contenido", "Andres");
        Articulo art4 = new Articulo(4, "Cuarto articulo", "Cuarto contenido", "Andres");
        Articulo art5 = new Articulo(5, "Quinto articulo", "Quinto contenido", "Andres");
        listado.add(art1);
        listado.add(art2);
        listado.add(art3);
        listado.add(art4);
        listado.add(art5);
    }
    
    public static BaseDeDatos getInstancia(){
        return baseDeDatos;
    }
    
    public List<Articulo> getListado(){
        return listado;
    }
}
