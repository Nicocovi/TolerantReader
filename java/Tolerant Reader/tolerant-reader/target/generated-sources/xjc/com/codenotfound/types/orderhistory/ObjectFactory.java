//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.12.11 um 01:39:21 PM CET 
//


package com.codenotfound.types.orderhistory;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.codenotfound.types.orderhistory package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.codenotfound.types.orderhistory
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrderHistoryRequest }
     * 
     */
    public GetOrderHistoryRequest createGetOrderHistoryRequest() {
        return new GetOrderHistoryRequest();
    }

    /**
     * Create an instance of {@link GetOrderHistoryResponse }
     * 
     */
    public GetOrderHistoryResponse createGetOrderHistoryResponse() {
        return new GetOrderHistoryResponse();
    }

    /**
     * Create an instance of {@link OrderHistoryType }
     * 
     */
    public OrderHistoryType createOrderHistoryType() {
        return new OrderHistoryType();
    }

    /**
     * Create an instance of {@link OrderListType }
     * 
     */
    public OrderListType createOrderListType() {
        return new OrderListType();
    }

    /**
     * Create an instance of {@link OrderType }
     * 
     */
    public OrderType createOrderType() {
        return new OrderType();
    }

}
