package org.alexys.rest.recursos;

import java.util.List;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import org.alexys.rest.modelo.Articulo;
import org.alexys.rest.servicio.ArticuloServicio;

@Path("/articulos")
public class ArticuloRecurso {

    ArticuloServicio servicio = new ArticuloServicio();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Articulo> getArticulos() {
        return servicio.getArticulos();
    }

    @GET
    @Path("/{articuloId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Articulo getArticulo(@PathParam("articuloId") int id) {
        return servicio.getArticulo(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Articulo addArticulo(Articulo articulo) {
        return servicio.addArticulo(articulo);
    }
}
