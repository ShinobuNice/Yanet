/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * REST Web Service
 *
 * @author becka
 */
@Path("wsoperacionesport")
public class WSOperacionesPort {

    private ws_client.WSOperaciones port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of WSOperacionesPort
     */
    public WSOperacionesPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method CrearEstudiante
     * @param nombre resource URI parameter
     * @param edad resource URI parameter
     * @param carrera resource URI parameter
     * @param semestre resource URI parameter
     * @param foto resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("crearestudiante/")
    public String getCrearEstudiante(@QueryParam("nombre") String nombre, @QueryParam("edad")
            @DefaultValue("0") int edad, @QueryParam("carrera") String carrera, @QueryParam("semestre")
            @DefaultValue("0") int semestre, @QueryParam("foto") byte[] foto) {
        try {
            // Call Web Service Operation
            if (port != null) {
                boolean result = port.crearEstudiante(nombre, edad, carrera, semestre, foto);
                return new java.lang.Boolean(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method ActualizarEstudiante
     * @param id resource URI parameter
     * @param nombre resource URI parameter
     * @param edad resource URI parameter
     * @param carrera resource URI parameter
     * @param semestre resource URI parameter
     * @param foto resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("actualizarestudiante/")
    public String getActualizarEstudiante(@QueryParam("id")
            @DefaultValue("0") int id, @QueryParam("nombre") String nombre, @QueryParam("edad")
            @DefaultValue("0") int edad, @QueryParam("carrera") String carrera, @QueryParam("semestre")
            @DefaultValue("0") int semestre, @QueryParam("foto") byte[] foto) {
        try {
            // Call Web Service Operation
            if (port != null) {
                boolean result = port.actualizarEstudiante(id, nombre, edad, carrera, semestre, foto);
                return new java.lang.Boolean(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method ObtenerEstudiantes
     * @return an instance of javax.xml.bind.JAXBElement<ws_client.ObtenerEstudiantesResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("obtenerestudiantes/")
    public JAXBElement<ws_client.ObtenerEstudiantesResponse> getObtenerEstudiantes() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<ws_client.Estudiante> result = port.obtenerEstudiantes();

                class ObtenerEstudiantesResponse_1 extends ws_client.ObtenerEstudiantesResponse {

                    ObtenerEstudiantesResponse_1(java.util.List<ws_client.Estudiante> _return) {
                        this._return = _return;
                    }
                }
                ws_client.ObtenerEstudiantesResponse response = new ObtenerEstudiantesResponse_1(result);
                return new ws_client.ObjectFactory().createObtenerEstudiantesResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method EliminarEstudiante
     * @param id resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("eliminarestudiante/")
    public String getEliminarEstudiante(@QueryParam("id")
            @DefaultValue("0") int id) {
        try {
            // Call Web Service Operation
            if (port != null) {
                boolean result = port.eliminarEstudiante(id);
                return new java.lang.Boolean(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private ws_client.WSOperaciones getPort() {
        try {
            // Call Web Service Operation
            ws_client.WSOperaciones_Service service = new ws_client.WSOperaciones_Service();
            ws_client.WSOperaciones p = service.getWSOperacionesPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
