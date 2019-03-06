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
public class Controlador2 {
    private Vista2 vista;
    private Modelo modelo;
    
    public Controlador2(Modelo modelo){
        this.modelo = modelo;
        this.vista = new Vista2();
        //Eventos
        this.vista.getBoton().setOnAction(new EventoBoton2());
        this.vista.getX().setText(modelo.getX());
        this.vista.getY().setText(modelo.getY());
    }
    
    class EventoBoton2 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
            Controlador3 c = new Controlador3(modelo);
            c.mostrarVista();
        }
        
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.vista.Show(singleton.getStage());
    }
}
