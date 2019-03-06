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
public class Controlador1 {
    private Vista1 vista;
    private Modelo modelo;

    public Controlador1(Modelo modelo) {
        this.modelo = modelo;
        this.vista = new Vista1();
        //Eventos
        this.vista.getBoton().setOnAction(new EventoBoton());
    }
    
    class EventoBoton implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
            modelo.setX(vista.getX().getText());
            modelo.setY(vista.getY().getText());
            Controlador2 c = new Controlador2(modelo);
            c.mostrarVista();
        }
        
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.vista.Show(singleton.getStage());
    }
    
}
