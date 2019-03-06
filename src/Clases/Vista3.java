/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Vista3 {
    private Scene escena;
    private GridPane grid;
    private Button boton;
    private Button boton2;

    public Vista3() {
        this.grid = new GridPane();
        this.grid.setAlignment(Pos.CENTER);
        this.grid.setPadding(new Insets(50, 50, 50, 50));
        this.grid.setHgap(5.5);
        this.grid.setVgap(5.5);
        
        this.boton = new Button("Regresar V1");
        this.grid.add(this.boton, 0, 0);
        this.boton2 = new Button("Regresar V2");
        this.grid.add(this.boton2, 1, 0);
        
        this.escena = new Scene(this.grid, 300, 300);
    }
    
    public void Show(Stage stage){
        stage.setTitle("Vista3");
        stage.setScene(this.escena);
        stage.show();
    }

    public Button getBoton() {
        return boton;
    }

    public Button getBoton2() {
        return boton2;
    }
    
}
