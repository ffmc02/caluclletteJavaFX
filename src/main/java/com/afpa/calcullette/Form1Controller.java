/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afpa.calcullette;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author gaeta
 */
public class Form1Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    int result=0;
   @FXML
    private TextArea text;
    @FXML
    private Button calculle;

    @FXML
    private Button Btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button Btn3;

    @FXML
    private Button add4;

    @FXML
    private Button add5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn0;

    @FXML
    private Button btn9;

    @FXML
    private Button vider;

    @FXML
    private Button close;

    @FXML
    void Add1() {
text.appendText("+1");
result= result + 1;
    }

    @FXML
    void Add3() {
text.appendText("+3");
    }

    @FXML
    void Calculle() {
text.appendText(String.valueOf(result));
    }

    @FXML
    void add0() {
text.appendText("0");
    }

    @FXML
    void add2() {
text.appendText("2");
    }

    @FXML
    void add4() {
text.appendText("4");
    }

    @FXML
    void add5() {
text.appendText("5");
    }

    @FXML
    void add6() {
text.appendText("6");
    }

    @FXML
    void add7() {
text.appendText("7");
    }

    @FXML
    void add8() {
text.appendText("8");
    }

    @FXML
    void add9() {
text.appendText("9");
    }

    @FXML
   private void clear() {
       text.clear();
    }

    @FXML
    void closeWindow() {

    }

}
