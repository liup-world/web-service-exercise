
package com.bobsystem.ws.wsimport;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bobsystem.ws.wsimport package.
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

    private final static QName _GetList_QNAME = new QName("http://webservice.ws.bobsystem.com/", "getList");
    private final static QName _GetWrappingTypes_QNAME = new QName("http://webservice.ws.bobsystem.com/", "getWrappingTypes");
    private final static QName _GetString_QNAME = new QName("http://webservice.ws.bobsystem.com/", "getString");
    private final static QName _GetStringResponse_QNAME = new QName("http://webservice.ws.bobsystem.com/", "getStringResponse");
    private final static QName _PassCompsiteTypeResponse_QNAME = new QName("http://webservice.ws.bobsystem.com/", "passCompsiteTypeResponse");
    private final static QName _GetPrimitiveTypes_QNAME = new QName("http://webservice.ws.bobsystem.com/", "getPrimitiveTypes");
    private final static QName _GetCompsiteTypeResponse_QNAME = new QName("http://webservice.ws.bobsystem.com/", "getCompsiteTypeResponse");
    private final static QName _GetWrappingTypesResponse_QNAME = new QName("http://webservice.ws.bobsystem.com/", "getWrappingTypesResponse");
    private final static QName _GetListResponse_QNAME = new QName("http://webservice.ws.bobsystem.com/", "getListResponse");
    private final static QName _PassCompsiteType_QNAME = new QName("http://webservice.ws.bobsystem.com/", "passCompsiteType");
    private final static QName _GetArray_QNAME = new QName("http://webservice.ws.bobsystem.com/", "getArray");
    private final static QName _GetArrayResponse_QNAME = new QName("http://webservice.ws.bobsystem.com/", "getArrayResponse");
    private final static QName _GetPrimitiveTypesResponse_QNAME = new QName("http://webservice.ws.bobsystem.com/", "getPrimitiveTypesResponse");
    private final static QName _GetCompsiteType_QNAME = new QName("http://webservice.ws.bobsystem.com/", "getCompsiteType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bobsystem.ws.wsimport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListResponse }
     * 
     */
    public GetListResponse createGetListResponse() {
        return new GetListResponse();
    }

    /**
     * Create an instance of {@link GetCompsiteTypeResponse }
     * 
     */
    public GetCompsiteTypeResponse createGetCompsiteTypeResponse() {
        return new GetCompsiteTypeResponse();
    }

    /**
     * Create an instance of {@link GetList }
     * 
     */
    public GetList createGetList() {
        return new GetList();
    }

    /**
     * Create an instance of {@link GetCompsiteType }
     * 
     */
    public GetCompsiteType createGetCompsiteType() {
        return new GetCompsiteType();
    }

    /**
     * Create an instance of {@link PassCompsiteType }
     * 
     */
    public PassCompsiteType createPassCompsiteType() {
        return new PassCompsiteType();
    }

    /**
     * Create an instance of {@link GetString }
     * 
     */
    public GetString createGetString() {
        return new GetString();
    }

    /**
     * Create an instance of {@link GetStringResponse }
     * 
     */
    public GetStringResponse createGetStringResponse() {
        return new GetStringResponse();
    }

    /**
     * Create an instance of {@link GetWrappingTypesResponse }
     * 
     */
    public GetWrappingTypesResponse createGetWrappingTypesResponse() {
        return new GetWrappingTypesResponse();
    }

    /**
     * Create an instance of {@link GetWrappingTypes }
     * 
     */
    public GetWrappingTypes createGetWrappingTypes() {
        return new GetWrappingTypes();
    }

    /**
     * Create an instance of {@link GetPrimitiveTypesResponse }
     * 
     */
    public GetPrimitiveTypesResponse createGetPrimitiveTypesResponse() {
        return new GetPrimitiveTypesResponse();
    }

    /**
     * Create an instance of {@link GetPrimitiveTypes }
     * 
     */
    public GetPrimitiveTypes createGetPrimitiveTypes() {
        return new GetPrimitiveTypes();
    }

    /**
     * Create an instance of {@link PassCompsiteTypeResponse }
     * 
     */
    public PassCompsiteTypeResponse createPassCompsiteTypeResponse() {
        return new PassCompsiteTypeResponse();
    }

    /**
     * Create an instance of {@link GetArray }
     * 
     */
    public GetArray createGetArray() {
        return new GetArray();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link GetArrayResponse }
     * 
     */
    public GetArrayResponse createGetArrayResponse() {
        return new GetArrayResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ws.bobsystem.com/", name = "getList")
    public JAXBElement<GetList> createGetList(GetList value) {
        return new JAXBElement<GetList>(_GetList_QNAME, GetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWrappingTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ws.bobsystem.com/", name = "getWrappingTypes")
    public JAXBElement<GetWrappingTypes> createGetWrappingTypes(GetWrappingTypes value) {
        return new JAXBElement<GetWrappingTypes>(_GetWrappingTypes_QNAME, GetWrappingTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ws.bobsystem.com/", name = "getString")
    public JAXBElement<GetString> createGetString(GetString value) {
        return new JAXBElement<GetString>(_GetString_QNAME, GetString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ws.bobsystem.com/", name = "getStringResponse")
    public JAXBElement<GetStringResponse> createGetStringResponse(GetStringResponse value) {
        return new JAXBElement<GetStringResponse>(_GetStringResponse_QNAME, GetStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassCompsiteTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ws.bobsystem.com/", name = "passCompsiteTypeResponse")
    public JAXBElement<PassCompsiteTypeResponse> createPassCompsiteTypeResponse(PassCompsiteTypeResponse value) {
        return new JAXBElement<PassCompsiteTypeResponse>(_PassCompsiteTypeResponse_QNAME, PassCompsiteTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrimitiveTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ws.bobsystem.com/", name = "getPrimitiveTypes")
    public JAXBElement<GetPrimitiveTypes> createGetPrimitiveTypes(GetPrimitiveTypes value) {
        return new JAXBElement<GetPrimitiveTypes>(_GetPrimitiveTypes_QNAME, GetPrimitiveTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompsiteTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ws.bobsystem.com/", name = "getCompsiteTypeResponse")
    public JAXBElement<GetCompsiteTypeResponse> createGetCompsiteTypeResponse(GetCompsiteTypeResponse value) {
        return new JAXBElement<GetCompsiteTypeResponse>(_GetCompsiteTypeResponse_QNAME, GetCompsiteTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWrappingTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ws.bobsystem.com/", name = "getWrappingTypesResponse")
    public JAXBElement<GetWrappingTypesResponse> createGetWrappingTypesResponse(GetWrappingTypesResponse value) {
        return new JAXBElement<GetWrappingTypesResponse>(_GetWrappingTypesResponse_QNAME, GetWrappingTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ws.bobsystem.com/", name = "getListResponse")
    public JAXBElement<GetListResponse> createGetListResponse(GetListResponse value) {
        return new JAXBElement<GetListResponse>(_GetListResponse_QNAME, GetListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassCompsiteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ws.bobsystem.com/", name = "passCompsiteType")
    public JAXBElement<PassCompsiteType> createPassCompsiteType(PassCompsiteType value) {
        return new JAXBElement<PassCompsiteType>(_PassCompsiteType_QNAME, PassCompsiteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ws.bobsystem.com/", name = "getArray")
    public JAXBElement<GetArray> createGetArray(GetArray value) {
        return new JAXBElement<GetArray>(_GetArray_QNAME, GetArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArrayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ws.bobsystem.com/", name = "getArrayResponse")
    public JAXBElement<GetArrayResponse> createGetArrayResponse(GetArrayResponse value) {
        return new JAXBElement<GetArrayResponse>(_GetArrayResponse_QNAME, GetArrayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrimitiveTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ws.bobsystem.com/", name = "getPrimitiveTypesResponse")
    public JAXBElement<GetPrimitiveTypesResponse> createGetPrimitiveTypesResponse(GetPrimitiveTypesResponse value) {
        return new JAXBElement<GetPrimitiveTypesResponse>(_GetPrimitiveTypesResponse_QNAME, GetPrimitiveTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompsiteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ws.bobsystem.com/", name = "getCompsiteType")
    public JAXBElement<GetCompsiteType> createGetCompsiteType(GetCompsiteType value) {
        return new JAXBElement<GetCompsiteType>(_GetCompsiteType_QNAME, GetCompsiteType.class, null, value);
    }

}
