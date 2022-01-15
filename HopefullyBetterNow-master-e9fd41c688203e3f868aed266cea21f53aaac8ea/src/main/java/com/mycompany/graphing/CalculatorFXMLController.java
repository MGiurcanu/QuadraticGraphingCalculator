package com.mycompany.graphing;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author willi
 
public class CalculatorFXMLController implements Initializable {
    List finishedProblems = new ArrayList();
    String typingProblem = new String();
    @FXML
    private Button clear;
    @FXML
    private Button mult;
    @FXML
    private Button div;
    @FXML
    private Button sub;
    @FXML
    private Button add;
    @FXML
    private Label typed;
    @FXML
    private Button enter;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button zero;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button exponential;
    @FXML
    private Button negative;
    @FXML
    private Button decimal;
    @FXML
    private Button p1;//what does this do
    @FXML // never mind - I'll put these as paranthesis
    private Button p2;//and what does this do
    @FXML
    private Button graph;
    @FXML
    private TableView table; 
    @FXML
    private TableColumn problems;
    @FXML
    private TableColumn answers;
    @FXML
    private Button delete;
    
    
    
    /**
     * Initializes the controller class.
     
    public int intointAnswer(String str){
        return 0;
    }
    public void handleButtonAction(ActionEvent e) throws Exception{
        if(e.getSource() == clear){
            typingProblem = "";
            typed.setText("");
        }
        if(e.getSource() == mult){
            typingProblem += "*";
            typed.setText(typed + "*");
        }
        if(e.getSource() == div){
            typingProblem += "/";
            typed.setText(typed + "/");
        }
        if(e.getSource() == sub){
            typingProblem += "-";
            typed.setText(typed + "-");
        }
        if(e.getSource() == add){
            typingProblem += "+";
            typed.setText(typed + "+");
        }
        if(e.getSource() == enter){
            
            finishedProblems.add(a);
            typed.setText("");
        }
        if(e.getSource() == one){
            typingProblem += "1";
            typed.setText(typed + "1");
        }
        if(e.getSource() == two){
            typingProblem += "2";
            typed.setText(typed + "2");
        }
        if(e.getSource() == three){
            typingProblem += "3";
            typed.setText(typed + "3");
        }
        if(e.getSource() == four){
            typingProblem += "4";
            typed.setText(typed + "4");
        }
        if(e.getSource() == five){
            typingProblem += "5";
            typed.setText(typed + "5");
        }
        if(e.getSource() == six){
            typingProblem += "6";
            typed.setText(typed + "6");

        }
        if(e.getSource() == seven){
            typingProblem += "7";
            typed.setText(typed + "7");

        }
        if(e.getSource() == eight){
            typingProblem += "8";
            typed.setText(typed + "8");

        }
        if(e.getSource() == nine){
            typingProblem += "9";
            typed.setText(typed + "9");

        }
        if(e.getSource() == zero){
            typingProblem += "0";
            typed.setText(typed + "0");
        }
        if(e.getSource() == exponential){
           typingProblem += "^";
           typed.setText(typed + "^");

        }
        if(e.getSource() == negative){
            typingProblem += "-";
            typed.setText(typed + "-");

        }
        if(e.getSource() == decimal){
           typingProblem += ".";
           typed.setText(typed + ".");
        }
        if(e.getSource() == p1){
           typingProblem += "(";
           typed.setText(typed + "(");

        }
        if(e.getSource() == p2){
            typingProblem += ")";
            typed.setText(typed + ")");
        }
        if(e.getSource() == graph){
            Parent root = FXMLLoader.load(getClass().getResource("Graph_1.fxml"));        
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);

        }
        
        if(e.getSource() == delete){
            typingProblem = typingProblem.substring(0, typingProblem.length() - 1);
            typed.setText(typingProblem);
        }
    
    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        problems.setCellValueFactory(new PropertyValueFactory<>("problem"));
        answers.setCellValueFactory(new PropertyValueFactory<>("answer"));
        

        table.setItems(FXCollections.observableList(finishedProblems));
        //we should make a class that has both the question and the answer inside of it.
    }    
    //you wanna message - you get one
}
*/
