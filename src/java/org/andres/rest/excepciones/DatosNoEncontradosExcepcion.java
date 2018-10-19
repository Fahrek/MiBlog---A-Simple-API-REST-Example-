package org.andres.rest.excepciones;

import javax.ws.rs.WebApplicationException;

public class DatosNoEncontradosExcepcion extends WebApplicationException
{
    public DatosNoEncontradosExcepcion(String mensaje) 
    {
        super(mensaje);
    }  
}
