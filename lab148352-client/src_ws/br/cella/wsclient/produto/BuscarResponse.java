
package br.cella.wsclient.produto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de buscarResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="buscarResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadobuscar" type="{http://webservices.cella/}produto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarResponse", propOrder = {
    "resultadobuscar"
})
public class BuscarResponse {

    protected Produto resultadobuscar;

    /**
     * Obtém o valor da propriedade resultadobuscar.
     * 
     * @return
     *     possible object is
     *     {@link Produto }
     *     
     */
    public Produto getResultadobuscar() {
        return resultadobuscar;
    }

    /**
     * Define o valor da propriedade resultadobuscar.
     * 
     * @param value
     *     allowed object is
     *     {@link Produto }
     *     
     */
    public void setResultadobuscar(Produto value) {
        this.resultadobuscar = value;
    }

}
