
package wsdesk2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsdesk2 package. 
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

    private final static QName _ThresholdMethod_QNAME = new QName("http://image.jhlabs.com/", "thresholdMethod");
    private final static QName _RasterImageTransferResponse_QNAME = new QName("http://image.jhlabs.com/", "RasterImageTransferResponse");
    private final static QName _VectorIc\u0131nWHResponse_QNAME = new QName("http://image.jhlabs.com/", "VectorIc\u0131nWHResponse");
    private final static QName _VectorIc\u0131nWH_QNAME = new QName("http://image.jhlabs.com/", "VectorIc\u0131nWH");
    private final static QName _ThresholdMethodResponse_QNAME = new QName("http://image.jhlabs.com/", "thresholdMethodResponse");
    private final static QName _VektorIslemler_QNAME = new QName("http://image.jhlabs.com/", "VektorIslemler");
    private final static QName _VectorImageTransfer_QNAME = new QName("http://image.jhlabs.com/", "VectorImageTransfer");
    private final static QName _VectorImageTransferResponse_QNAME = new QName("http://image.jhlabs.com/", "VectorImageTransferResponse");
    private final static QName _RasterImageTransfer_QNAME = new QName("http://image.jhlabs.com/", "RasterImageTransfer");
    private final static QName _VektorIslemlerResponse_QNAME = new QName("http://image.jhlabs.com/", "VektorIslemlerResponse");
    private final static QName _RasterImageTransferResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdesk2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VektorIslemlerResponse }
     * 
     */
    public VektorIslemlerResponse createVektorIslemlerResponse() {
        return new VektorIslemlerResponse();
    }

    /**
     * Create an instance of {@link VectorImageTransferResponse }
     * 
     */
    public VectorImageTransferResponse createVectorImageTransferResponse() {
        return new VectorImageTransferResponse();
    }

    /**
     * Create an instance of {@link VectorIc\u0131nWHResponse }
     * 
     */
    public VectorIc\u0131nWHResponse createVectorIc\u0131nWHResponse() {
        return new VectorIc\u0131nWHResponse();
    }

    /**
     * Create an instance of {@link ThresholdMethod }
     * 
     */
    public ThresholdMethod createThresholdMethod() {
        return new ThresholdMethod();
    }

    /**
     * Create an instance of {@link ThresholdMethodResponse }
     * 
     */
    public ThresholdMethodResponse createThresholdMethodResponse() {
        return new ThresholdMethodResponse();
    }

    /**
     * Create an instance of {@link RasterImageTransferResponse }
     * 
     */
    public RasterImageTransferResponse createRasterImageTransferResponse() {
        return new RasterImageTransferResponse();
    }

    /**
     * Create an instance of {@link VektorIslemler }
     * 
     */
    public VektorIslemler createVektorIslemler() {
        return new VektorIslemler();
    }

    /**
     * Create an instance of {@link VectorImageTransfer }
     * 
     */
    public VectorImageTransfer createVectorImageTransfer() {
        return new VectorImageTransfer();
    }

    /**
     * Create an instance of {@link RasterImageTransfer }
     * 
     */
    public RasterImageTransfer createRasterImageTransfer() {
        return new RasterImageTransfer();
    }

    /**
     * Create an instance of {@link VectorIc\u0131nWH }
     * 
     */
    public VectorIc\u0131nWH createVectorIc\u0131nWH() {
        return new VectorIc\u0131nWH();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.jhlabs.com/", name = "thresholdMethod")
    public JAXBElement<ThresholdMethod> createThresholdMethod(ThresholdMethod value) {
        return new JAXBElement<ThresholdMethod>(_ThresholdMethod_QNAME, ThresholdMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RasterImageTransferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.jhlabs.com/", name = "RasterImageTransferResponse")
    public JAXBElement<RasterImageTransferResponse> createRasterImageTransferResponse(RasterImageTransferResponse value) {
        return new JAXBElement<RasterImageTransferResponse>(_RasterImageTransferResponse_QNAME, RasterImageTransferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VectorIc\u0131nWHResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.jhlabs.com/", name = "VectorIc\u0131nWHResponse")
    public JAXBElement<VectorIc\u0131nWHResponse> createVectorIc\u0131nWHResponse(VectorIc\u0131nWHResponse value) {
        return new JAXBElement<VectorIc\u0131nWHResponse>(_VectorIc\u0131nWHResponse_QNAME, VectorIc\u0131nWHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VectorIc\u0131nWH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.jhlabs.com/", name = "VectorIc\u0131nWH")
    public JAXBElement<VectorIc\u0131nWH> createVectorIc\u0131nWH(VectorIc\u0131nWH value) {
        return new JAXBElement<VectorIc\u0131nWH>(_VectorIc\u0131nWH_QNAME, VectorIc\u0131nWH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.jhlabs.com/", name = "thresholdMethodResponse")
    public JAXBElement<ThresholdMethodResponse> createThresholdMethodResponse(ThresholdMethodResponse value) {
        return new JAXBElement<ThresholdMethodResponse>(_ThresholdMethodResponse_QNAME, ThresholdMethodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VektorIslemler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.jhlabs.com/", name = "VektorIslemler")
    public JAXBElement<VektorIslemler> createVektorIslemler(VektorIslemler value) {
        return new JAXBElement<VektorIslemler>(_VektorIslemler_QNAME, VektorIslemler.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VectorImageTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.jhlabs.com/", name = "VectorImageTransfer")
    public JAXBElement<VectorImageTransfer> createVectorImageTransfer(VectorImageTransfer value) {
        return new JAXBElement<VectorImageTransfer>(_VectorImageTransfer_QNAME, VectorImageTransfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VectorImageTransferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.jhlabs.com/", name = "VectorImageTransferResponse")
    public JAXBElement<VectorImageTransferResponse> createVectorImageTransferResponse(VectorImageTransferResponse value) {
        return new JAXBElement<VectorImageTransferResponse>(_VectorImageTransferResponse_QNAME, VectorImageTransferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RasterImageTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.jhlabs.com/", name = "RasterImageTransfer")
    public JAXBElement<RasterImageTransfer> createRasterImageTransfer(RasterImageTransfer value) {
        return new JAXBElement<RasterImageTransfer>(_RasterImageTransfer_QNAME, RasterImageTransfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VektorIslemlerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.jhlabs.com/", name = "VektorIslemlerResponse")
    public JAXBElement<VektorIslemlerResponse> createVektorIslemlerResponse(VektorIslemlerResponse value) {
        return new JAXBElement<VektorIslemlerResponse>(_VektorIslemlerResponse_QNAME, VektorIslemlerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = RasterImageTransferResponse.class)
    public JAXBElement<byte[]> createRasterImageTransferResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_RasterImageTransferResponseReturn_QNAME, byte[].class, RasterImageTransferResponse.class, ((byte[]) value));
    }

}
