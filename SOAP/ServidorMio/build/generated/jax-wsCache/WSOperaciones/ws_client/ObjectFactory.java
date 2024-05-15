
package ws_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws_client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActualizarEstudiante_QNAME = new QName("http://ws/", "ActualizarEstudiante");
    private final static QName _ActualizarEstudianteResponse_QNAME = new QName("http://ws/", "ActualizarEstudianteResponse");
    private final static QName _CrearEstudiante_QNAME = new QName("http://ws/", "CrearEstudiante");
    private final static QName _CrearEstudianteResponse_QNAME = new QName("http://ws/", "CrearEstudianteResponse");
    private final static QName _EliminarEstudiante_QNAME = new QName("http://ws/", "EliminarEstudiante");
    private final static QName _EliminarEstudianteResponse_QNAME = new QName("http://ws/", "EliminarEstudianteResponse");
    private final static QName _ObtenerEstudiantes_QNAME = new QName("http://ws/", "ObtenerEstudiantes");
    private final static QName _ObtenerEstudiantesResponse_QNAME = new QName("http://ws/", "ObtenerEstudiantesResponse");
    private final static QName _CrearEstudianteFoto_QNAME = new QName("", "foto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarEstudiante }
     * 
     */
    public ActualizarEstudiante createActualizarEstudiante() {
        return new ActualizarEstudiante();
    }

    /**
     * Create an instance of {@link ActualizarEstudianteResponse }
     * 
     */
    public ActualizarEstudianteResponse createActualizarEstudianteResponse() {
        return new ActualizarEstudianteResponse();
    }

    /**
     * Create an instance of {@link CrearEstudiante }
     * 
     */
    public CrearEstudiante createCrearEstudiante() {
        return new CrearEstudiante();
    }

    /**
     * Create an instance of {@link CrearEstudianteResponse }
     * 
     */
    public CrearEstudianteResponse createCrearEstudianteResponse() {
        return new CrearEstudianteResponse();
    }

    /**
     * Create an instance of {@link EliminarEstudiante }
     * 
     */
    public EliminarEstudiante createEliminarEstudiante() {
        return new EliminarEstudiante();
    }

    /**
     * Create an instance of {@link EliminarEstudianteResponse }
     * 
     */
    public EliminarEstudianteResponse createEliminarEstudianteResponse() {
        return new EliminarEstudianteResponse();
    }

    /**
     * Create an instance of {@link ObtenerEstudiantes }
     * 
     */
    public ObtenerEstudiantes createObtenerEstudiantes() {
        return new ObtenerEstudiantes();
    }

    /**
     * Create an instance of {@link ObtenerEstudiantesResponse }
     * 
     */
    public ObtenerEstudiantesResponse createObtenerEstudiantesResponse() {
        return new ObtenerEstudiantesResponse();
    }

    /**
     * Create an instance of {@link Estudiante }
     * 
     */
    public Estudiante createEstudiante() {
        return new Estudiante();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarEstudiante }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarEstudiante }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ActualizarEstudiante")
    public JAXBElement<ActualizarEstudiante> createActualizarEstudiante(ActualizarEstudiante value) {
        return new JAXBElement<ActualizarEstudiante>(_ActualizarEstudiante_QNAME, ActualizarEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarEstudianteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarEstudianteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ActualizarEstudianteResponse")
    public JAXBElement<ActualizarEstudianteResponse> createActualizarEstudianteResponse(ActualizarEstudianteResponse value) {
        return new JAXBElement<ActualizarEstudianteResponse>(_ActualizarEstudianteResponse_QNAME, ActualizarEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearEstudiante }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearEstudiante }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "CrearEstudiante")
    public JAXBElement<CrearEstudiante> createCrearEstudiante(CrearEstudiante value) {
        return new JAXBElement<CrearEstudiante>(_CrearEstudiante_QNAME, CrearEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearEstudianteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearEstudianteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "CrearEstudianteResponse")
    public JAXBElement<CrearEstudianteResponse> createCrearEstudianteResponse(CrearEstudianteResponse value) {
        return new JAXBElement<CrearEstudianteResponse>(_CrearEstudianteResponse_QNAME, CrearEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarEstudiante }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarEstudiante }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "EliminarEstudiante")
    public JAXBElement<EliminarEstudiante> createEliminarEstudiante(EliminarEstudiante value) {
        return new JAXBElement<EliminarEstudiante>(_EliminarEstudiante_QNAME, EliminarEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarEstudianteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarEstudianteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "EliminarEstudianteResponse")
    public JAXBElement<EliminarEstudianteResponse> createEliminarEstudianteResponse(EliminarEstudianteResponse value) {
        return new JAXBElement<EliminarEstudianteResponse>(_EliminarEstudianteResponse_QNAME, EliminarEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEstudiantes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerEstudiantes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ObtenerEstudiantes")
    public JAXBElement<ObtenerEstudiantes> createObtenerEstudiantes(ObtenerEstudiantes value) {
        return new JAXBElement<ObtenerEstudiantes>(_ObtenerEstudiantes_QNAME, ObtenerEstudiantes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEstudiantesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerEstudiantesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ObtenerEstudiantesResponse")
    public JAXBElement<ObtenerEstudiantesResponse> createObtenerEstudiantesResponse(ObtenerEstudiantesResponse value) {
        return new JAXBElement<ObtenerEstudiantesResponse>(_ObtenerEstudiantesResponse_QNAME, ObtenerEstudiantesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "", name = "foto", scope = CrearEstudiante.class)
    public JAXBElement<byte[]> createCrearEstudianteFoto(byte[] value) {
        return new JAXBElement<byte[]>(_CrearEstudianteFoto_QNAME, byte[].class, CrearEstudiante.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "", name = "foto", scope = ActualizarEstudiante.class)
    public JAXBElement<byte[]> createActualizarEstudianteFoto(byte[] value) {
        return new JAXBElement<byte[]>(_CrearEstudianteFoto_QNAME, byte[].class, ActualizarEstudiante.class, ((byte[]) value));
    }

}
