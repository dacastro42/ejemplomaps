/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lxyen
 */
public class Persona {

    private String nombrePersona;
    private String correoPersona;
    private String direccionPersona;

    public Persona() {
    }

    public Persona(String nombrePersona, String correoPersona, String direccionPersona) {
        this.nombrePersona = nombrePersona;
        this.correoPersona = correoPersona;
        this.direccionPersona = direccionPersona;
    }
    
    

    /**
     * Get the value of direccionPersona
     *
     * @return the value of direccionPersona
     */
    public String getDireccionPersona() {
        return direccionPersona;
    }

    /**
     * Set the value of direccionPersona
     *
     * @param direccionPersona new value of direccionPersona
     */
    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    /**
     * Get the value of correoPersona
     *
     * @return the value of correoPersona
     */
    public String getCorreoPersona() {
        return correoPersona;
    }

    /**
     * Set the value of correoPersona
     *
     * @param correoPersona new value of correoPersona
     */
    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    /**
     * Get the value of nombrePersona
     *
     * @return the value of nombrePersona
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Set the value of nombrePersona
     *
     * @param nombrePersona new value of nombrePersona
     */
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public String toString() {
        return nombrePersona + "," + correoPersona + "," + direccionPersona+",";
    }

}
