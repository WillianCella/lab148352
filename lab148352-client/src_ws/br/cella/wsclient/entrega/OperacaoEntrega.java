
package br.cella.wsclient.entrega;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de operacaoEntrega complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="operacaoEntrega">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enredeco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operacaoEntrega", propOrder = {
    "enredeco"
})
public class OperacaoEntrega {

    protected String enredeco;

    /**
     * Obtém o valor da propriedade enredeco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnredeco() {
        return enredeco;
    }

    /**
     * Define o valor da propriedade enredeco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnredeco(String value) {
        this.enredeco = value;
    }

}
