/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Estudiante
 */
public class Controlador3 {
    private Vista3 vista;
    private Modelo modelo;
    
    public Controlador3(Modelo modelo){
        this.modelo = modelo;
        this.vista = new Vista3();
        //Eventos
        this.vista.getBoton().setOnAction(new EventoBoton3());
        this.vista.getBoton2().setOnAction(new EventoBoton4());
    }
    
    class EventoBoton3 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
            Controlador1 c = new Controlador1(modelo);
            c.mostrarVista();
        }
        
    }
    
    class EventoBoton4 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
            Controlador2 c = new Controlador2(modelo);
            c.mostrarVista();
        }
        
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.vista.Show(singleton.getStage());
    }
}
