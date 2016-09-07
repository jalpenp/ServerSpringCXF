
package com.isg.de.ws.server.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.isg.de.ws.server.soap package. 
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

    private final static QName _GetAllNativeEventsJSONResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getAllNativeEventsJSONResponse");
    private final static QName _GetNativeEventsByTypeResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeEventsByTypeResponse");
    private final static QName _GetNativeScheduleEventsJSON_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeScheduleEventsJSON");
    private final static QName _GetGeoNativeEventsByType_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getGeoNativeEventsByType");
    private final static QName _GetNativeEventsByState_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeEventsByState");
    private final static QName _GetGeoNativeActiveEvents_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getGeoNativeActiveEvents");
    private final static QName _GetNativeEventsByTypeJSON_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeEventsByTypeJSON");
    private final static QName _GetGeoNativeScheduleEventsResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getGeoNativeScheduleEventsResponse");
    private final static QName _GetGeoNativeEventsByTypeResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getGeoNativeEventsByTypeResponse");
    private final static QName _GetNativeScheduleEventsJSONResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeScheduleEventsJSONResponse");
    private final static QName _GetNativeActiveEventsResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeActiveEventsResponse");
    private final static QName _GetUpdatedNativeEventsJSONResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getUpdatedNativeEventsJSONResponse");
    private final static QName _GetNativeScheduleEventsResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeScheduleEventsResponse");
    private final static QName _GetNativeScheduleEvents_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeScheduleEvents");
    private final static QName _GetAllNativeEvents_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getAllNativeEvents");
    private final static QName _GetUpdatedNativeEventsJSON_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getUpdatedNativeEventsJSON");
    private final static QName _GetGeoNativeActiveEventsResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getGeoNativeActiveEventsResponse");
    private final static QName _GetNativeEventsByTypeJSONResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeEventsByTypeJSONResponse");
    private final static QName _GetGeoNativeScheduleEvents_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getGeoNativeScheduleEvents");
    private final static QName _GetNativeEventsByType_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeEventsByType");
    private final static QName _GetGeoNativeEventsByState_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getGeoNativeEventsByState");
    private final static QName _GetNativeEventsByStateJSON_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeEventsByStateJSON");
    private final static QName _GetAllNativeEventsJSON_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getAllNativeEventsJSON");
    private final static QName _GetNativeActiveEventsJSON_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeActiveEventsJSON");
    private final static QName _GetGeoAllNativeEventsResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getGeoAllNativeEventsResponse");
    private final static QName _GetUpdatedNativeEventsResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getUpdatedNativeEventsResponse");
    private final static QName _GetNativeEventsByStateJSONResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeEventsByStateJSONResponse");
    private final static QName _GetUpdatedNativeEvents_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getUpdatedNativeEvents");
    private final static QName _GetGeoAllNativeEvents_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getGeoAllNativeEvents");
    private final static QName _GetNativeActiveEventsJSONResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeActiveEventsJSONResponse");
    private final static QName _GetNativeEventsByStateResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeEventsByStateResponse");
    private final static QName _GetGeoNativeEventsByStateResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getGeoNativeEventsByStateResponse");
    private final static QName _GetAllNativeEventsResponse_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getAllNativeEventsResponse");
    private final static QName _GetNativeActiveEvents_QNAME = new QName("http://soap.server.ws.de.isg.com/", "getNativeActiveEvents");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.isg.de.ws.server.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNativeEventsByTypeJSON }
     * 
     */
    public GetNativeEventsByTypeJSON createGetNativeEventsByTypeJSON() {
        return new GetNativeEventsByTypeJSON();
    }

    /**
     * Create an instance of {@link GetGeoNativeScheduleEventsResponse }
     * 
     */
    public GetGeoNativeScheduleEventsResponse createGetGeoNativeScheduleEventsResponse() {
        return new GetGeoNativeScheduleEventsResponse();
    }

    /**
     * Create an instance of {@link GetGeoNativeActiveEvents }
     * 
     */
    public GetGeoNativeActiveEvents createGetGeoNativeActiveEvents() {
        return new GetGeoNativeActiveEvents();
    }

    /**
     * Create an instance of {@link GetNativeScheduleEventsJSON }
     * 
     */
    public GetNativeScheduleEventsJSON createGetNativeScheduleEventsJSON() {
        return new GetNativeScheduleEventsJSON();
    }

    /**
     * Create an instance of {@link GetGeoNativeEventsByType }
     * 
     */
    public GetGeoNativeEventsByType createGetGeoNativeEventsByType() {
        return new GetGeoNativeEventsByType();
    }

    /**
     * Create an instance of {@link GetNativeEventsByState }
     * 
     */
    public GetNativeEventsByState createGetNativeEventsByState() {
        return new GetNativeEventsByState();
    }

    /**
     * Create an instance of {@link GetAllNativeEventsJSONResponse }
     * 
     */
    public GetAllNativeEventsJSONResponse createGetAllNativeEventsJSONResponse() {
        return new GetAllNativeEventsJSONResponse();
    }

    /**
     * Create an instance of {@link GetNativeEventsByTypeResponse }
     * 
     */
    public GetNativeEventsByTypeResponse createGetNativeEventsByTypeResponse() {
        return new GetNativeEventsByTypeResponse();
    }

    /**
     * Create an instance of {@link GetAllNativeEvents }
     * 
     */
    public GetAllNativeEvents createGetAllNativeEvents() {
        return new GetAllNativeEvents();
    }

    /**
     * Create an instance of {@link GetUpdatedNativeEventsJSON }
     * 
     */
    public GetUpdatedNativeEventsJSON createGetUpdatedNativeEventsJSON() {
        return new GetUpdatedNativeEventsJSON();
    }

    /**
     * Create an instance of {@link GetNativeScheduleEvents }
     * 
     */
    public GetNativeScheduleEvents createGetNativeScheduleEvents() {
        return new GetNativeScheduleEvents();
    }

    /**
     * Create an instance of {@link GetUpdatedNativeEventsJSONResponse }
     * 
     */
    public GetUpdatedNativeEventsJSONResponse createGetUpdatedNativeEventsJSONResponse() {
        return new GetUpdatedNativeEventsJSONResponse();
    }

    /**
     * Create an instance of {@link GetNativeScheduleEventsResponse }
     * 
     */
    public GetNativeScheduleEventsResponse createGetNativeScheduleEventsResponse() {
        return new GetNativeScheduleEventsResponse();
    }

    /**
     * Create an instance of {@link GetGeoNativeEventsByTypeResponse }
     * 
     */
    public GetGeoNativeEventsByTypeResponse createGetGeoNativeEventsByTypeResponse() {
        return new GetGeoNativeEventsByTypeResponse();
    }

    /**
     * Create an instance of {@link GetNativeScheduleEventsJSONResponse }
     * 
     */
    public GetNativeScheduleEventsJSONResponse createGetNativeScheduleEventsJSONResponse() {
        return new GetNativeScheduleEventsJSONResponse();
    }

    /**
     * Create an instance of {@link GetNativeActiveEventsResponse }
     * 
     */
    public GetNativeActiveEventsResponse createGetNativeActiveEventsResponse() {
        return new GetNativeActiveEventsResponse();
    }

    /**
     * Create an instance of {@link GetNativeActiveEventsJSON }
     * 
     */
    public GetNativeActiveEventsJSON createGetNativeActiveEventsJSON() {
        return new GetNativeActiveEventsJSON();
    }

    /**
     * Create an instance of {@link GetGeoAllNativeEventsResponse }
     * 
     */
    public GetGeoAllNativeEventsResponse createGetGeoAllNativeEventsResponse() {
        return new GetGeoAllNativeEventsResponse();
    }

    /**
     * Create an instance of {@link GetUpdatedNativeEventsResponse }
     * 
     */
    public GetUpdatedNativeEventsResponse createGetUpdatedNativeEventsResponse() {
        return new GetUpdatedNativeEventsResponse();
    }

    /**
     * Create an instance of {@link GetAllNativeEventsJSON }
     * 
     */
    public GetAllNativeEventsJSON createGetAllNativeEventsJSON() {
        return new GetAllNativeEventsJSON();
    }

    /**
     * Create an instance of {@link GetNativeEventsByType }
     * 
     */
    public GetNativeEventsByType createGetNativeEventsByType() {
        return new GetNativeEventsByType();
    }

    /**
     * Create an instance of {@link GetGeoNativeEventsByState }
     * 
     */
    public GetGeoNativeEventsByState createGetGeoNativeEventsByState() {
        return new GetGeoNativeEventsByState();
    }

    /**
     * Create an instance of {@link GetNativeEventsByStateJSON }
     * 
     */
    public GetNativeEventsByStateJSON createGetNativeEventsByStateJSON() {
        return new GetNativeEventsByStateJSON();
    }

    /**
     * Create an instance of {@link GetGeoNativeActiveEventsResponse }
     * 
     */
    public GetGeoNativeActiveEventsResponse createGetGeoNativeActiveEventsResponse() {
        return new GetGeoNativeActiveEventsResponse();
    }

    /**
     * Create an instance of {@link GetNativeEventsByTypeJSONResponse }
     * 
     */
    public GetNativeEventsByTypeJSONResponse createGetNativeEventsByTypeJSONResponse() {
        return new GetNativeEventsByTypeJSONResponse();
    }

    /**
     * Create an instance of {@link GetGeoNativeScheduleEvents }
     * 
     */
    public GetGeoNativeScheduleEvents createGetGeoNativeScheduleEvents() {
        return new GetGeoNativeScheduleEvents();
    }

    /**
     * Create an instance of {@link GetAllNativeEventsResponse }
     * 
     */
    public GetAllNativeEventsResponse createGetAllNativeEventsResponse() {
        return new GetAllNativeEventsResponse();
    }

    /**
     * Create an instance of {@link GetNativeActiveEvents }
     * 
     */
    public GetNativeActiveEvents createGetNativeActiveEvents() {
        return new GetNativeActiveEvents();
    }

    /**
     * Create an instance of {@link GetNativeActiveEventsJSONResponse }
     * 
     */
    public GetNativeActiveEventsJSONResponse createGetNativeActiveEventsJSONResponse() {
        return new GetNativeActiveEventsJSONResponse();
    }

    /**
     * Create an instance of {@link GetNativeEventsByStateResponse }
     * 
     */
    public GetNativeEventsByStateResponse createGetNativeEventsByStateResponse() {
        return new GetNativeEventsByStateResponse();
    }

    /**
     * Create an instance of {@link GetGeoNativeEventsByStateResponse }
     * 
     */
    public GetGeoNativeEventsByStateResponse createGetGeoNativeEventsByStateResponse() {
        return new GetGeoNativeEventsByStateResponse();
    }

    /**
     * Create an instance of {@link GetGeoAllNativeEvents }
     * 
     */
    public GetGeoAllNativeEvents createGetGeoAllNativeEvents() {
        return new GetGeoAllNativeEvents();
    }

    /**
     * Create an instance of {@link GetNativeEventsByStateJSONResponse }
     * 
     */
    public GetNativeEventsByStateJSONResponse createGetNativeEventsByStateJSONResponse() {
        return new GetNativeEventsByStateJSONResponse();
    }

    /**
     * Create an instance of {@link GetUpdatedNativeEvents }
     * 
     */
    public GetUpdatedNativeEvents createGetUpdatedNativeEvents() {
        return new GetUpdatedNativeEvents();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNativeEventsJSONResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getAllNativeEventsJSONResponse")
    public JAXBElement<GetAllNativeEventsJSONResponse> createGetAllNativeEventsJSONResponse(GetAllNativeEventsJSONResponse value) {
        return new JAXBElement<GetAllNativeEventsJSONResponse>(_GetAllNativeEventsJSONResponse_QNAME, GetAllNativeEventsJSONResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeEventsByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeEventsByTypeResponse")
    public JAXBElement<GetNativeEventsByTypeResponse> createGetNativeEventsByTypeResponse(GetNativeEventsByTypeResponse value) {
        return new JAXBElement<GetNativeEventsByTypeResponse>(_GetNativeEventsByTypeResponse_QNAME, GetNativeEventsByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeScheduleEventsJSON }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeScheduleEventsJSON")
    public JAXBElement<GetNativeScheduleEventsJSON> createGetNativeScheduleEventsJSON(GetNativeScheduleEventsJSON value) {
        return new JAXBElement<GetNativeScheduleEventsJSON>(_GetNativeScheduleEventsJSON_QNAME, GetNativeScheduleEventsJSON.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoNativeEventsByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getGeoNativeEventsByType")
    public JAXBElement<GetGeoNativeEventsByType> createGetGeoNativeEventsByType(GetGeoNativeEventsByType value) {
        return new JAXBElement<GetGeoNativeEventsByType>(_GetGeoNativeEventsByType_QNAME, GetGeoNativeEventsByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeEventsByState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeEventsByState")
    public JAXBElement<GetNativeEventsByState> createGetNativeEventsByState(GetNativeEventsByState value) {
        return new JAXBElement<GetNativeEventsByState>(_GetNativeEventsByState_QNAME, GetNativeEventsByState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoNativeActiveEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getGeoNativeActiveEvents")
    public JAXBElement<GetGeoNativeActiveEvents> createGetGeoNativeActiveEvents(GetGeoNativeActiveEvents value) {
        return new JAXBElement<GetGeoNativeActiveEvents>(_GetGeoNativeActiveEvents_QNAME, GetGeoNativeActiveEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeEventsByTypeJSON }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeEventsByTypeJSON")
    public JAXBElement<GetNativeEventsByTypeJSON> createGetNativeEventsByTypeJSON(GetNativeEventsByTypeJSON value) {
        return new JAXBElement<GetNativeEventsByTypeJSON>(_GetNativeEventsByTypeJSON_QNAME, GetNativeEventsByTypeJSON.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoNativeScheduleEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getGeoNativeScheduleEventsResponse")
    public JAXBElement<GetGeoNativeScheduleEventsResponse> createGetGeoNativeScheduleEventsResponse(GetGeoNativeScheduleEventsResponse value) {
        return new JAXBElement<GetGeoNativeScheduleEventsResponse>(_GetGeoNativeScheduleEventsResponse_QNAME, GetGeoNativeScheduleEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoNativeEventsByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getGeoNativeEventsByTypeResponse")
    public JAXBElement<GetGeoNativeEventsByTypeResponse> createGetGeoNativeEventsByTypeResponse(GetGeoNativeEventsByTypeResponse value) {
        return new JAXBElement<GetGeoNativeEventsByTypeResponse>(_GetGeoNativeEventsByTypeResponse_QNAME, GetGeoNativeEventsByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeScheduleEventsJSONResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeScheduleEventsJSONResponse")
    public JAXBElement<GetNativeScheduleEventsJSONResponse> createGetNativeScheduleEventsJSONResponse(GetNativeScheduleEventsJSONResponse value) {
        return new JAXBElement<GetNativeScheduleEventsJSONResponse>(_GetNativeScheduleEventsJSONResponse_QNAME, GetNativeScheduleEventsJSONResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeActiveEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeActiveEventsResponse")
    public JAXBElement<GetNativeActiveEventsResponse> createGetNativeActiveEventsResponse(GetNativeActiveEventsResponse value) {
        return new JAXBElement<GetNativeActiveEventsResponse>(_GetNativeActiveEventsResponse_QNAME, GetNativeActiveEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUpdatedNativeEventsJSONResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getUpdatedNativeEventsJSONResponse")
    public JAXBElement<GetUpdatedNativeEventsJSONResponse> createGetUpdatedNativeEventsJSONResponse(GetUpdatedNativeEventsJSONResponse value) {
        return new JAXBElement<GetUpdatedNativeEventsJSONResponse>(_GetUpdatedNativeEventsJSONResponse_QNAME, GetUpdatedNativeEventsJSONResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeScheduleEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeScheduleEventsResponse")
    public JAXBElement<GetNativeScheduleEventsResponse> createGetNativeScheduleEventsResponse(GetNativeScheduleEventsResponse value) {
        return new JAXBElement<GetNativeScheduleEventsResponse>(_GetNativeScheduleEventsResponse_QNAME, GetNativeScheduleEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeScheduleEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeScheduleEvents")
    public JAXBElement<GetNativeScheduleEvents> createGetNativeScheduleEvents(GetNativeScheduleEvents value) {
        return new JAXBElement<GetNativeScheduleEvents>(_GetNativeScheduleEvents_QNAME, GetNativeScheduleEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNativeEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getAllNativeEvents")
    public JAXBElement<GetAllNativeEvents> createGetAllNativeEvents(GetAllNativeEvents value) {
        return new JAXBElement<GetAllNativeEvents>(_GetAllNativeEvents_QNAME, GetAllNativeEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUpdatedNativeEventsJSON }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getUpdatedNativeEventsJSON")
    public JAXBElement<GetUpdatedNativeEventsJSON> createGetUpdatedNativeEventsJSON(GetUpdatedNativeEventsJSON value) {
        return new JAXBElement<GetUpdatedNativeEventsJSON>(_GetUpdatedNativeEventsJSON_QNAME, GetUpdatedNativeEventsJSON.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoNativeActiveEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getGeoNativeActiveEventsResponse")
    public JAXBElement<GetGeoNativeActiveEventsResponse> createGetGeoNativeActiveEventsResponse(GetGeoNativeActiveEventsResponse value) {
        return new JAXBElement<GetGeoNativeActiveEventsResponse>(_GetGeoNativeActiveEventsResponse_QNAME, GetGeoNativeActiveEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeEventsByTypeJSONResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeEventsByTypeJSONResponse")
    public JAXBElement<GetNativeEventsByTypeJSONResponse> createGetNativeEventsByTypeJSONResponse(GetNativeEventsByTypeJSONResponse value) {
        return new JAXBElement<GetNativeEventsByTypeJSONResponse>(_GetNativeEventsByTypeJSONResponse_QNAME, GetNativeEventsByTypeJSONResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoNativeScheduleEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getGeoNativeScheduleEvents")
    public JAXBElement<GetGeoNativeScheduleEvents> createGetGeoNativeScheduleEvents(GetGeoNativeScheduleEvents value) {
        return new JAXBElement<GetGeoNativeScheduleEvents>(_GetGeoNativeScheduleEvents_QNAME, GetGeoNativeScheduleEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeEventsByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeEventsByType")
    public JAXBElement<GetNativeEventsByType> createGetNativeEventsByType(GetNativeEventsByType value) {
        return new JAXBElement<GetNativeEventsByType>(_GetNativeEventsByType_QNAME, GetNativeEventsByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoNativeEventsByState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getGeoNativeEventsByState")
    public JAXBElement<GetGeoNativeEventsByState> createGetGeoNativeEventsByState(GetGeoNativeEventsByState value) {
        return new JAXBElement<GetGeoNativeEventsByState>(_GetGeoNativeEventsByState_QNAME, GetGeoNativeEventsByState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeEventsByStateJSON }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeEventsByStateJSON")
    public JAXBElement<GetNativeEventsByStateJSON> createGetNativeEventsByStateJSON(GetNativeEventsByStateJSON value) {
        return new JAXBElement<GetNativeEventsByStateJSON>(_GetNativeEventsByStateJSON_QNAME, GetNativeEventsByStateJSON.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNativeEventsJSON }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getAllNativeEventsJSON")
    public JAXBElement<GetAllNativeEventsJSON> createGetAllNativeEventsJSON(GetAllNativeEventsJSON value) {
        return new JAXBElement<GetAllNativeEventsJSON>(_GetAllNativeEventsJSON_QNAME, GetAllNativeEventsJSON.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeActiveEventsJSON }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeActiveEventsJSON")
    public JAXBElement<GetNativeActiveEventsJSON> createGetNativeActiveEventsJSON(GetNativeActiveEventsJSON value) {
        return new JAXBElement<GetNativeActiveEventsJSON>(_GetNativeActiveEventsJSON_QNAME, GetNativeActiveEventsJSON.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoAllNativeEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getGeoAllNativeEventsResponse")
    public JAXBElement<GetGeoAllNativeEventsResponse> createGetGeoAllNativeEventsResponse(GetGeoAllNativeEventsResponse value) {
        return new JAXBElement<GetGeoAllNativeEventsResponse>(_GetGeoAllNativeEventsResponse_QNAME, GetGeoAllNativeEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUpdatedNativeEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getUpdatedNativeEventsResponse")
    public JAXBElement<GetUpdatedNativeEventsResponse> createGetUpdatedNativeEventsResponse(GetUpdatedNativeEventsResponse value) {
        return new JAXBElement<GetUpdatedNativeEventsResponse>(_GetUpdatedNativeEventsResponse_QNAME, GetUpdatedNativeEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeEventsByStateJSONResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeEventsByStateJSONResponse")
    public JAXBElement<GetNativeEventsByStateJSONResponse> createGetNativeEventsByStateJSONResponse(GetNativeEventsByStateJSONResponse value) {
        return new JAXBElement<GetNativeEventsByStateJSONResponse>(_GetNativeEventsByStateJSONResponse_QNAME, GetNativeEventsByStateJSONResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUpdatedNativeEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getUpdatedNativeEvents")
    public JAXBElement<GetUpdatedNativeEvents> createGetUpdatedNativeEvents(GetUpdatedNativeEvents value) {
        return new JAXBElement<GetUpdatedNativeEvents>(_GetUpdatedNativeEvents_QNAME, GetUpdatedNativeEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoAllNativeEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getGeoAllNativeEvents")
    public JAXBElement<GetGeoAllNativeEvents> createGetGeoAllNativeEvents(GetGeoAllNativeEvents value) {
        return new JAXBElement<GetGeoAllNativeEvents>(_GetGeoAllNativeEvents_QNAME, GetGeoAllNativeEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeActiveEventsJSONResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeActiveEventsJSONResponse")
    public JAXBElement<GetNativeActiveEventsJSONResponse> createGetNativeActiveEventsJSONResponse(GetNativeActiveEventsJSONResponse value) {
        return new JAXBElement<GetNativeActiveEventsJSONResponse>(_GetNativeActiveEventsJSONResponse_QNAME, GetNativeActiveEventsJSONResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeEventsByStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeEventsByStateResponse")
    public JAXBElement<GetNativeEventsByStateResponse> createGetNativeEventsByStateResponse(GetNativeEventsByStateResponse value) {
        return new JAXBElement<GetNativeEventsByStateResponse>(_GetNativeEventsByStateResponse_QNAME, GetNativeEventsByStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoNativeEventsByStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getGeoNativeEventsByStateResponse")
    public JAXBElement<GetGeoNativeEventsByStateResponse> createGetGeoNativeEventsByStateResponse(GetGeoNativeEventsByStateResponse value) {
        return new JAXBElement<GetGeoNativeEventsByStateResponse>(_GetGeoNativeEventsByStateResponse_QNAME, GetGeoNativeEventsByStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNativeEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getAllNativeEventsResponse")
    public JAXBElement<GetAllNativeEventsResponse> createGetAllNativeEventsResponse(GetAllNativeEventsResponse value) {
        return new JAXBElement<GetAllNativeEventsResponse>(_GetAllNativeEventsResponse_QNAME, GetAllNativeEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNativeActiveEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.ws.de.isg.com/", name = "getNativeActiveEvents")
    public JAXBElement<GetNativeActiveEvents> createGetNativeActiveEvents(GetNativeActiveEvents value) {
        return new JAXBElement<GetNativeActiveEvents>(_GetNativeActiveEvents_QNAME, GetNativeActiveEvents.class, null, value);
    }

}
