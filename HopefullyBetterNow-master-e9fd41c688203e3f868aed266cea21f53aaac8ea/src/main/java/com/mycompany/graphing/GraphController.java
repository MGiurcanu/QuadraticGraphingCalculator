package com.mycompany.graphing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.*;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.Axis;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author willi
 */
public class GraphController{
    
    private List<Integer> beforeDecimal = new ArrayList<Integer>();
    private List<Integer> afterDecimal = new ArrayList<Integer>();
    
    private boolean negativeNumber = false;
    private boolean isbeforedecimal = true;
    private int entersPressed = 0;
    private double firstNumber = 0;
    private double secondNumber = 0;
    private double thirdNumber = 0;
    //private int ymaxnum = 0;
    //private int yminnum = 0;
   // private int xmaxnum = 0;
    //private int xminnum = 0;
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
    private TextField typed;
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
    private Button quit;
    @FXML
    private LineChart<Double, Double> chartGraph; //commit?
    @FXML
    private Button settings;
    @FXML
    private Button delete;
    @FXML
    private Button graph;
    @FXML
    private Button linear;
    @FXML
    private Button quadratic;
    
    
    
    
   

    /**
     *
     */
    public GraphController(){
        this.beforeDecimal = new ArrayList();
    }
    
    
    /**
     * Initializes the controller class.
     */
    /*public void graphLinear() throws Exception{
            //passToMainGraph(xminnum, yminnum, xmaxnum, ymaxnum);
            //chartGraph.updateAxisRange();
            typed.setText("ax+b");
            while(true){
                int i = 1;
                
                handleButtonAction(action);
                factor = num * i + factor;
                typed.setText(factor + "x" + "+" + "b");
                i = i * 10;
                if(action.getSource() == enter){
                    break;
                }
             }
            while(true){
                if(action.getSource() == enter){
                int i = 1;
                    handleButtonAction(action);
                    intercept = num * i + intercept;
                    typed.setText(factor + "x+" + intercept);
                    if(action.getSource() == enter){
                        break;
                    }
                    
                }
            }
            XYChart.Series series = new XYChart.Series();
                
                    //how many points we get will be depedent on our window settings, we actually only need 2 points, two draw the line.
            series.getData().add(new XYChart.Data(1 , factor * 1 + intercept));
            series.getData().add(new XYChart.Data(0 , factor * 0 + intercept));
                
            chartGraph.getData().add(series);
        }
        public void graphQuadratic() throws Exception{
            //passToMainGraph(xminnum, yminnum, xmaxnum, ymaxnum);
            typed.setText("ax^2+bx+c");
            while(true){
                int i = 1;
                
                handleButtonAction(action);
                expo = num * i + expo;
                typed.setText(expo + "x^2+bx+c");
                i = i * 10;
                if(action.getSource() == enter){
                    break;
                }
             }
            while(true){
                if(action.getSource() == enter){
                int i = 1;
                    handleButtonAction(action);
                    factor = num * i + factor;
                    typed.setText(expo + "x^2+" + factor + "x+c");
                    i = i * 10;
                    if(action.getSource() == enter){
                        break;
                    }
                    
                }
            }
            while(true){
                if(action.getSource() == enter){
                int i = 1;
                    handleButtonAction(action);
                    intercept = num * i + factor;
                    typed.setText(expo + "x^2+" + factor + "x+" + intercept);
                    i = i * 10;
                    if(action.getSource() == enter){
                        break;
                    }
                    
                }
            }
            XYChart.Series series = new XYChart.Series();
                for (int i = 0; i < 100; i++){
                    
                    //how many points we get will be depedent on our window settings, we actually only need 2 points, two draw the line.
                    series.getData().add(new XYChart.Data(i, expo * (i ^ 2) + factor * i + intercept));
                }
            chartGraph.getData().add(series);
        */
   public void handleButtonAction(ActionEvent e) throws Exception{
        

        // The changes start from here...
if(e.getSource() == enter){
            if(entersPressed == 0){
                for(int i = 0; i < beforeDecimal.size(); i++){
                    double placeH;
                    placeH = beforeDecimal.get(i).doubleValue();
                    firstNumber = placeH * (double) Math.pow(10,beforeDecimal.size() - i - 1) + firstNumber;// ^ (beforeDecimal.size() - i));
                    
                }
                beforeDecimal = new ArrayList<Integer>();
                for(int i = 0; i < afterDecimal.size(); i++){
                    double placeHAD;
                    placeHAD = afterDecimal.get(i).doubleValue();
                    firstNumber = firstNumber + (placeHAD * (double)(Math.pow(10,(-i - 1))));
                   
                }
                afterDecimal = new ArrayList<Integer>();
                if(negativeNumber == true){
                    firstNumber *= -1;
                }
                negativeNumber = false;
                typed.setText("y = " + firstNumber + "x^2 + _x + _");
                entersPressed++;
                isbeforedecimal = true;
                }
            else if(entersPressed == 1){
                for(int i = 0; i < beforeDecimal.size(); i++){
                    double placeH;
                    placeH =  beforeDecimal.get(i).doubleValue();
                    secondNumber = placeH * (double) Math.pow(10,beforeDecimal.size() - i - 1) + secondNumber;// ^ (beforeDecimal.size() - i));
                    
                }
                beforeDecimal = new ArrayList<Integer>();
                for(int i = 0; i < afterDecimal.size(); i++){
                    double placeHAD;
                    placeHAD = afterDecimal.get(i).doubleValue();
                    secondNumber = secondNumber + (placeHAD * (double)(Math.pow(10,(-i - 1))));
                    
                }
                afterDecimal = new ArrayList<Integer>();
                if(negativeNumber == true){
                    secondNumber *= -1;
                }
                negativeNumber = false;
                typed.setText("y = " + firstNumber + "x^2 + "+secondNumber+"x + _");
                entersPressed++;
                isbeforedecimal = true;
                }
            else if(entersPressed == 2){
                for(int i = 0; i < beforeDecimal.size(); i++){
                    double placeH;
                    placeH = beforeDecimal.get(i).doubleValue();
                    thirdNumber = placeH * (double) Math.pow(10,beforeDecimal.size() - i - 1) + thirdNumber;// ^ (beforeDecimal.size() - i));
                    
                }
                beforeDecimal = new ArrayList<Integer>();
                for(int i = 0; i < afterDecimal.size(); i++){
                    double placeHAD;//I believe this should be commited no?
                    placeHAD = afterDecimal.get(i).doubleValue();
                    thirdNumber = thirdNumber + (placeHAD * (double)(Math.pow(10,(-i - 1))));
                    
                }
                afterDecimal = new ArrayList<Integer>();
                if(negativeNumber == true){
                    thirdNumber *= -1;
                }
                negativeNumber = false;
                typed.setText("y = " + firstNumber + "x^2 + "+secondNumber+"x + " + thirdNumber);
                entersPressed++;
                isbeforedecimal = true;
                }
            else if(entersPressed == 3){ 
                // Put the stuff here that would be required to be put in. (The part specifiaclly about graphing and )
            }
                
        }
        if(e.getSource() == clear){
        typed.setText("Goodbye!");
            

            
            
        }
        if(e.getSource() == decimal){
            isbeforedecimal = false;
        }
        if(e.getSource() == one){
            
            
            if(this.isbeforedecimal){
            beforeDecimal.add(1);
            }   else{
                    afterDecimal.add(1);
            }
            
        }
        if(e.getSource() == two){
            
            if(this.isbeforedecimal){
            beforeDecimal.add(2);
            }   else{
                    afterDecimal.add(2);
            }
        }
        if(e.getSource() == three){
            
            if(this.isbeforedecimal){
            beforeDecimal.add(3);
            }   else{
                    afterDecimal.add(3);
            }
        }
        if(e.getSource() == four){
            
            if(this.isbeforedecimal){
            beforeDecimal.add(4);
            }   else{
                    afterDecimal.add(4);
            }
        }
        if(e.getSource() == five){
            
            if(this.isbeforedecimal){
            beforeDecimal.add(5);
            }   else{
                    afterDecimal.add(5);
            }
        }
        if(e.getSource() == six){
            
            if(this.isbeforedecimal){
            beforeDecimal.add(6);
            }   else{
                    afterDecimal.add(6);
            }

        }
        if(e.getSource() == seven){
            
            if(this.isbeforedecimal){
            beforeDecimal.add(7);
            }   else{
                    afterDecimal.add(7);
            }
        }
        if(e.getSource() == eight){
            
            if(this.isbeforedecimal){
            beforeDecimal.add(8);
            }   else{
                    afterDecimal.add(8);
            }
        }
        if(e.getSource() == nine){
            
            if(this.isbeforedecimal){
            beforeDecimal.add(9);
            }   else{
                    afterDecimal.add(9);
            }
        }
        if(e.getSource() == zero){
            
            if(this.isbeforedecimal){
            beforeDecimal.add(0);
            }   else{
                    afterDecimal.add(0);
            }
        }
        
        if(e.getSource() == negative){
            negativeNumber = true;
        }
        
        /*if(e.getSource() == graph){
            Parent root = FXMLLoader.load(getClass().getResource("GraphSettings.fxml"));        
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);

        } No graph settings because charts are automatically set to fit size.*/
        
        
            
        
        if(e.getSource() == quadratic){
            
            
                XYChart.Series series = new XYChart.Series();
                for (int i = -100; i < 100; i++){
                    
                    //how many points we get will be depedent on our window settings, we actually only need 2 points, two draw the line.
                    series.getData().add(new XYChart.Data<Number, Number>(i, (int) (firstNumber * (Math.pow(i,2)) + secondNumber * i + thirdNumber)));
                }
                chartGraph.getData().add(series);
                chartGraph.setVisible(true);
                series.getData().removeAll();
                
            /*while(true){
                int i = 1;
                
                handleButtonAction(action);
                expo = num * i + expo;
                typed.setText(expo + "x^2+bx+c");
                i = i * 10;
                if(action.getSource() == enter){
                    break;
                }
             }
            while(true){
                if(action.getSource() == enter){
                int i = 1;
                    handleButtonAction(action);
                    factor = num * i + factor;
                    typed.setText(expo + "x^2+" + factor + "x+c");
                    i = i * 10;
                    if(action.getSource() == enter){
                        break;
                    }
                    
                }
            }
            while(true){
                if(action.getSource() == enter){
                int i = 1;
                    handleButtonAction(action);
                    intercept = num * i + factor;
                    typed.setText(expo + "x^2+" + factor + "x+" + intercept);
                    i = i * 10;
                    if(action.getSource() == enter){
                        break;
                    }
                    
                }
*/
            
            
                
            /*} catch (Exception i){
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Warning Dialog");
                alert.setHeaderText("Invalid Graph!");
                alert.showAndWait();
            }
            */
        
    
        }
    }
    public void initialize(URL url, ResourceBundle rb) {
        typed.setText("y=_x^2+_x+_");
        //passToMainGraph(xminnum, yminnum, xmaxnum, ymaxnum);

        //NumberAxis yaxis = chartGraph.getYAxis();
        //NumberAxis xaxis = chartGraph.getXAxis();
        //yaxis.setUpperBound(ymaxnum);
        //yaxis.setLowerBound(ymaxnum);
        //xaxis.setUpperBound(xmaxnum);
        //xaxis.setLowerBound(xminnum);
        //chartGraph.layoutPlotChildren();


        //we should make a class that has both the question and the answer inside of it.
    }    
        
}

                //if(action.getSource() == one || action.getSource() == two || action.getSource() == three || action.getSource() == four || action.getSource() == five || action.getSource() == six || action.getSource() == seven || action.getSource() == eight || action.getSource() == nine || action.getSource() == zero){

