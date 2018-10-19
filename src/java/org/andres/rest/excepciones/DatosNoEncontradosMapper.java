package org.andres.rest.excepciones;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.andres.rest.modelo.MensajeError;

@Provider
public class DatosNoEncontradosMapper 
       implements ExceptionMapper<DatosNoEncontradosExcepcion>
{
    @Override
    public Response toResponse(DatosNoEncontradosExcepcion exception) 
    {
        MensajeError mensaje = new MensajeError("Datos no encontrados", 
                                                 404, "Esta información no se encuentra");
        return Response.status(Response.Status.NOT_FOUND)
                       .entity(mensaje)
                       .build();
    }
}
