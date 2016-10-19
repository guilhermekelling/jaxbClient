
package jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxb package. 
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

    private final static QName _GeraNumeroResponse_QNAME = new QName("http://jaxb/", "geraNumeroResponse");
    private final static QName _GeraNumero_QNAME = new QName("http://jaxb/", "geraNumero");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeraNumero }
     * 
     */
    public GeraNumero createGeraNumero() {
        return new GeraNumero();
    }

    /**
     * Create an instance of {@link GeraNumeroResponse }
     * 
     */
    public GeraNumeroResponse createGeraNumeroResponse() {
        return new GeraNumeroResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeraNumeroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxb/", name = "geraNumeroResponse")
    public JAXBElement<GeraNumeroResponse> createGeraNumeroResponse(GeraNumeroResponse value) {
        return new JAXBElement<GeraNumeroResponse>(_GeraNumeroResponse_QNAME, GeraNumeroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeraNumero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxb/", name = "geraNumero")
    public JAXBElement<GeraNumero> createGeraNumero(GeraNumero value) {
        return new JAXBElement<GeraNumero>(_GeraNumero_QNAME, GeraNumero.class, null, value);
    }

}
