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
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Vista2 {
    private Scene escena;
    private GridPane grid;
    private Label label1;
    private TextField x;
    private Label label2;
    private TextField y;
    private Button boton;

    public Vista2() {
        this.grid = new GridPane();
        this.grid.setAlignment(Pos.CENTER);
        this.grid.setPadding(new Insets(25, 25, 25, 25));
        this.grid.setHgap(5.5);
        this.grid.setVgap(5.5);
        
        this.label1 = new Label("Z:");
        this.grid.add(this.label1, 0, 0);
        
        this.x = new TextField();
        this.grid.add(this.x, 1, 0);
        
        this.label2 = new Label("W:");
        this.grid.add(this.label2, 0, 1);
        
        this.y = new TextField();
        this.grid.add(this.y, 1, 1);
        
        this.boton = new Button("Regresar");
        this.grid.add(this.boton, 1, 2);
        
        this.escena = new Scene(this.grid, 300, 300);
    }
    
    public void Show(Stage stage){
        stage.setTitle("Vista2");
        stage.setScene(this.escena);
        stage.show();
    }

    public TextField getX() {
        return x;
    }

    public void setX(TextField x) {
        this.x = x;
    }

    public TextField getY() {
        return y;
    }

    public void setY(TextField y) {
        this.y = y;
    }

    public Button getBoton() {
        return boton;
    }

    public void setBoton(Button boton) {
        this.boton = boton;
    }
    
}
