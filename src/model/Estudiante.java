/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lxyen
 */
public class Estudiante extends Persona {

    private String carrera;
    private String codigoEstudiante;

    public Estudiante() {
    }

    public Estudiante(String carrera, String codigoEstudiante, String nombrePersona, String correoPersona, String direccionPersona) {
        super(nombrePersona, correoPersona, direccionPersona);
        this.carrera = carrera;
        this.codigoEstudiante = codigoEstudiante;
    }
    
    

    /**
     * Get the value of codigoEstudiante
     *
     * @return the value of codigoEstudiante
     */
    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    /**
     * Set the value of codigoEstudiante
     *
     * @param codigoEstudiante new value of codigoEstudiante
     */
    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    /**
     * Get the value of carrera
     *
     * @return the value of carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Set the value of carrera
     *
     * @param carrera new value of carrera
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() + carrera + "," + codigoEstudiante+"\n";
    }
    
    

}
