/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Main extends Application{

    @Override
    public void start(Stage stage){
        Singleton singleton = Singleton.getSingleton();
        singleton.setStage(stage);
        
        Modelo modelo = new Modelo();
        Controlador1 ventana = new Controlador1(modelo);
        ventana.mostrarVista();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
