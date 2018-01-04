//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.12.11 um 01:39:21 PM CET 
//


package com.codenotfound.types.orderhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderHistory" type="{http://codenotfound.com/types/orderhistory}OrderHistoryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderHistory"
})
@XmlRootElement(name = "getOrderHistoryResponse")
public class GetOrderHistoryResponse {

    @XmlElement(required = true)
    protected OrderHistoryType orderHistory;

    /**
     * Ruft den Wert der orderHistory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrderHistoryType }
     *     
     */
    public OrderHistoryType getOrderHistory() {
        return orderHistory;
    }

    /**
     * Legt den Wert der orderHistory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHistoryType }
     *     
     */
    public void setOrderHistory(OrderHistoryType value) {
        this.orderHistory = value;
    }

}
