
package org.alexys.rest.recursos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.alexys.rest.modelo.Articulo;

@Path("/articulos")
public class ArticuloRecurso {
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Articulo getArticulos(){
        Articulo articulo = new Articulo(1, "Mi primer articulo", "Este es el contenido", "Andres");
        return articulo;
    }
}
