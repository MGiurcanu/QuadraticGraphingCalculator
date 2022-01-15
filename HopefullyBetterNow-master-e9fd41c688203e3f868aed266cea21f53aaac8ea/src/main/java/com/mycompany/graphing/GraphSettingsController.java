package com.mycompany.graphing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.*;
/**
 * FXML Controller class
 *
 * @author willi
 */
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GraphSettingsController{
    private TextField ymax;
    @FXML
    private TextField ymin;
    @FXML
    private TextField xmax;
    @FXML   
    private TextField xmin;
    @FXML
    private Button done;
    private int ymaxnum;
    private int yminnum;
    private int xmaxnum;
    private int xminnum;
     public void handleButtonAction(ActionEvent e) throws IOException {
        
        if(e.getSource()== done)
        {
            if(ymin.getText() == ""){
                yminnum = 0;
                
            }
            if(ymax.getText() == ""){
                ymaxnum = 0;
                
            }
            if(xmax.getText() == ""){
                xmaxnum = 0;
                
            }
            if(xmin.getText() == ""){
                xminnum = 0;
                
            }
        xmaxnum = Integer.parseInt(xmax.getText());
        yminnum = Integer.parseInt(ymin.getText());
        xminnum = Integer.parseInt(xmin.getText());
        ymaxnum = Integer.parseInt(ymax.getText());
            
        Parent root = FXMLLoader.load(getClass().getResource("Graph_1.fxml"));        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
            
            
        }
        

}
       /* public void passToMainGraph(int xmin, int ymin, int xmax, int ymax){
            this.xminnum = xminnum;
            this.xmaxnum = xmaxnum;
            this.yminnum = yminnum;
            this.ymaxnum = ymaxnum;

        }
        */
        
        
}
