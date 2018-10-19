
package org.andres.rest.dao;

import java.util.List;
import java.util.ArrayList;
import org.andres.rest.modelo.Articulo;
import org.andres.rest.modelo.Comentario;

public final class BaseDeDatos {
    private final static BaseDeDatos baseDeDatos = new BaseDeDatos();
    private final List<Articulo> listado = new ArrayList<>();
    
    private BaseDeDatos(){
        Articulo art1 = new Articulo(1, "Primer articulo", "Primer contenido", "Andres");
        Articulo art2 = new Articulo(2, "Segundo articulo", "Segundo contenido", "Andres");
        Articulo art3 = new Articulo(3, "Tercer articulo", "Tercer contenido", "Andres");
        Articulo art4 = new Articulo(4, "Cuarto articulo", "Cuarto contenido", "Andres");
        Articulo art5 = new Articulo(5, "Quinto articulo", "Quinto contenido", "Andres");
        
        art1.getComentarios().add(new Comentario(1, "Muy buen articulo", "Daniel"));
        art2.getComentarios().add(new Comentario(2, "Muy buen articulo", "Pedro"));
        art3.getComentarios().add(new Comentario(3, "Muy buen articulo", "Marta"));
        art4.getComentarios().add(new Comentario(4, "Muy buen articulo", "Maria"));
        art5.getComentarios().add(new Comentario(5, "Muy buen articulo", "Manuel"));
        
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
