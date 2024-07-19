
package com.becas.uniluyten;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for solicitud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solicitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lugarDeEstudio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreDelSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDeBeca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitud", propOrder = {
    "lugarDeEstudio",
    "nombreDelSolicitante",
    "tipoDeBeca"
})
public class Solicitud {

    protected String lugarDeEstudio;
    protected String nombreDelSolicitante;
    protected String tipoDeBeca;

    /**
     * Gets the value of the lugarDeEstudio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarDeEstudio() {
        return lugarDeEstudio;
    }

    /**
     * Sets the value of the lugarDeEstudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarDeEstudio(String value) {
        this.lugarDeEstudio = value;
    }

    /**
     * Gets the value of the nombreDelSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDelSolicitante() {
        return nombreDelSolicitante;
    }

    /**
     * Sets the value of the nombreDelSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDelSolicitante(String value) {
        this.nombreDelSolicitante = value;
    }

    /**
     * Gets the value of the tipoDeBeca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeBeca() {
        return tipoDeBeca;
    }

    /**
     * Sets the value of the tipoDeBeca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeBeca(String value) {
        this.tipoDeBeca = value;
    }

}
