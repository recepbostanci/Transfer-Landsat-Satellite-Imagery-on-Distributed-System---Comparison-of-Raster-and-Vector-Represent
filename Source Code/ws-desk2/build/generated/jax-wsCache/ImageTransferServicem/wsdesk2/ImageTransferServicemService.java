
package wsdesk2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ImageTransferServicemService", targetNamespace = "http://image.jhlabs.com/", wsdlLocation = "http://192.168.1.1:8080/ws-server/ImageTransferServicem?wsdl")
public class ImageTransferServicemService
    extends Service
{

    private final static URL IMAGETRANSFERSERVICEMSERVICE_WSDL_LOCATION;
    private final static WebServiceException IMAGETRANSFERSERVICEMSERVICE_EXCEPTION;
    private final static QName IMAGETRANSFERSERVICEMSERVICE_QNAME = new QName("http://image.jhlabs.com/", "ImageTransferServicemService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.1.1:8080/ws-server/ImageTransferServicem?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IMAGETRANSFERSERVICEMSERVICE_WSDL_LOCATION = url;
        IMAGETRANSFERSERVICEMSERVICE_EXCEPTION = e;
    }

    public ImageTransferServicemService() {
        super(__getWsdlLocation(), IMAGETRANSFERSERVICEMSERVICE_QNAME);
    }

    public ImageTransferServicemService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IMAGETRANSFERSERVICEMSERVICE_QNAME, features);
    }

    public ImageTransferServicemService(URL wsdlLocation) {
        super(wsdlLocation, IMAGETRANSFERSERVICEMSERVICE_QNAME);
    }

    public ImageTransferServicemService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IMAGETRANSFERSERVICEMSERVICE_QNAME, features);
    }

    public ImageTransferServicemService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImageTransferServicemService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ImageTransferServicem
     */
    @WebEndpoint(name = "ImageTransferServicemPort")
    public ImageTransferServicem getImageTransferServicemPort() {
        return super.getPort(new QName("http://image.jhlabs.com/", "ImageTransferServicemPort"), ImageTransferServicem.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImageTransferServicem
     */
    @WebEndpoint(name = "ImageTransferServicemPort")
    public ImageTransferServicem getImageTransferServicemPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://image.jhlabs.com/", "ImageTransferServicemPort"), ImageTransferServicem.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IMAGETRANSFERSERVICEMSERVICE_EXCEPTION!= null) {
            throw IMAGETRANSFERSERVICEMSERVICE_EXCEPTION;
        }
        return IMAGETRANSFERSERVICEMSERVICE_WSDL_LOCATION;
    }

}
