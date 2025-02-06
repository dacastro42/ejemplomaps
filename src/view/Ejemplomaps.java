/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import model.Estudiante;

/**
 *
 * @author pc
 */
public class Ejemplomaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Map<Integer, String> mapsName = new HashMap<>();
//        mapsName.put(20, "David");
//        mapsName.put(14, "Maria");
//        mapsName.put(0, "Antonio");
//        
//        
//
//        Iterator<Map.Entry<Integer, String>> entryIterator = mapsName.entrySet().iterator();
//        while (entryIterator.hasNext()) {
//            Map.Entry<Integer, String> entry = entryIterator.next();
//            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
//        }
//        
        Map<Integer, Estudiante> mapEstudiantes = new HashMap<>();

        mapEstudiantes.put(23, new Estudiante("Ing multimedia", "2010144", "David Castro", "dacastro@uao.edu.co", "carr41"));
        mapEstudiantes.put(20, new Estudiante("Ing multimedia", "2010144", "Maria Castro", "dacastro@uao.edu.co", "carr41"));
        mapEstudiantes.put(20, new Estudiante("Ing multimedia", "2010144", "Maria Castro", "dacastro@uao.edu.co", "carr41"));
    }

}
