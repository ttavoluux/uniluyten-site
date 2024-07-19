
package com.becas.uniluyten;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.becas.uniluyten package. 
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

    private final static QName _SolicitarBeca_QNAME = new QName("http://uniluyten.becas.com/", "solicitarBeca");
    private final static QName _SolicitarBecaResponse_QNAME = new QName("http://uniluyten.becas.com/", "solicitarBecaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.becas.uniluyten
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SolicitarBecaResponse }
     * 
     */
    public SolicitarBecaResponse createSolicitarBecaResponse() {
        return new SolicitarBecaResponse();
    }

    /**
     * Create an instance of {@link SolicitarBeca }
     * 
     */
    public SolicitarBeca createSolicitarBeca() {
        return new SolicitarBeca();
    }

    /**
     * Create an instance of {@link Solicitud }
     * 
     */
    public Solicitud createSolicitud() {
        return new Solicitud();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarBeca }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniluyten.becas.com/", name = "solicitarBeca")
    public JAXBElement<SolicitarBeca> createSolicitarBeca(SolicitarBeca value) {
        return new JAXBElement<SolicitarBeca>(_SolicitarBeca_QNAME, SolicitarBeca.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarBecaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniluyten.becas.com/", name = "solicitarBecaResponse")
    public JAXBElement<SolicitarBecaResponse> createSolicitarBecaResponse(SolicitarBecaResponse value) {
        return new JAXBElement<SolicitarBecaResponse>(_SolicitarBecaResponse_QNAME, SolicitarBecaResponse.class, null, value);
    }

}
