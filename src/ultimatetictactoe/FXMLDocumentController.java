/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import ultimatetictactoe.move.Move;

/**
 *
 * @author Melchertsen
 */
public class FXMLDocumentController implements Initializable
{
    
    @FXML
    private Button btn00_00;
    @FXML
    private Button btn00_10;
    @FXML
    private Button btn00_20;
    @FXML
    private Button btn00_01;
    @FXML
    private Button btn00_11;
    @FXML
    private Button btn00_21;
    @FXML
    private Button btn00_02;
    @FXML
    private Button btn00_12;
    @FXML
    private Button btn00_22;
    @FXML
    private Button btn10_00;
    @FXML
    private Button btn10_10;
    @FXML
    private Button btn10_20;
    @FXML
    private Button btn10_01;
    @FXML
    private Button btn10_11;
    @FXML
    private Button btn10_21;
    @FXML
    private Button btn10_02;
    @FXML
    private Button btn10_12;
    @FXML
    private Button btn10_22;
    @FXML
    private Button btn20_00;
    @FXML
    private Button btn20_10;
    @FXML
    private Button btn20_20;
    @FXML
    private Button btn20_01;
    @FXML
    private Button btn20_11;
    @FXML
    private Button btn20_21;
    @FXML
    private Button btn20_02;
    @FXML
    private Button btn20_12;
    @FXML
    private Button btn20_22;
    @FXML
    private Button btn01_00;
    @FXML
    private Button btn01_10;
    @FXML
    private Button btn01_20;
    @FXML
    private Button btn01_01;
    @FXML
    private Button btn01_11;
    @FXML
    private Button btn01_21;
    @FXML
    private Button btn01_02;
    @FXML
    private Button btn01_12;
    @FXML
    private Button btn01_22;
    @FXML
    private Button btn11_00;
    @FXML
    private Button btn11_10;
    @FXML
    private Button btn11_20;
    @FXML
    private Button btn11_01;
    @FXML
    private Button btn11_11;
    @FXML
    private Button btn11_21;
    @FXML
    private Button btn11_02;
    @FXML
    private Button btn11_12;
    @FXML
    private Button btn11_22;
    @FXML
    private Button btn21_00;
    @FXML
    private Button btn21_10;
    @FXML
    private Button btn21_20;
    @FXML
    private Button btn21_01;
    @FXML
    private Button btn21_11;
    @FXML
    private Button btn21_21;
    @FXML
    private Button btn21_02;
    @FXML
    private Button btn21_12;
    @FXML
    private Button btn21_22;
    @FXML
    private Button btn02_00;
    @FXML
    private Button btn02_10;
    @FXML
    private Button btn02_20;
    @FXML
    private Button btn02_01;
    @FXML
    private Button btn02_11;
    @FXML
    private Button btn02_21;
    @FXML
    private Button btn02_02;
    @FXML
    private Button btn02_12;
    @FXML
    private Button btn02_22;
    @FXML
    private Button btn12_00;
    @FXML
    private Button btn12_10;
    @FXML
    private Button btn12_20;
    @FXML
    private Button btn12_01;
    @FXML
    private Button btn12_11;
    @FXML
    private Button btn12_21;
    @FXML
    private Button btn12_02;
    @FXML
    private Button btn12_12;
    @FXML
    private Button btn12_22;
    @FXML
    private Button btn22_00;
    @FXML
    private Button btn22_10;
    @FXML
    private Button btn22_20;
    @FXML
    private Button btn22_01;
    @FXML
    private Button btn22_11;
    @FXML
    private Button btn22_21;
    @FXML
    private Button btn22_02;
    @FXML
    private Button btn22_12;
    @FXML
    private Button btn22_22;
    @FXML
    private GridPane MacroGridPane;
    @FXML
    private GridPane MircroGridPane1;
    @FXML
    private GridPane MircroGridPane2;
    @FXML
    private GridPane MircroGridPane3;
    @FXML
    private GridPane MircroGridPane4;
    @FXML
    private GridPane MircroGridPane5;
    @FXML
    private GridPane MircroGridPane6;
    @FXML
    private GridPane MircroGridPane7;
    @FXML
    private GridPane MircroGridPane8;
    @FXML
    private GridPane MircroGridPane9;
    private Move theMove;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        theMove = new Move();
    }    

    @FXML
    private void handleBtn00_00(ActionEvent event)
    {
        theMove.setX(0);
        theMove.setY(0);
    }

    @FXML
    private void handleBtn00_10(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn00_20(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn00_01(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn00_11(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn00_21(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn00_02(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn00_12(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn00_22(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn10_00(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn10_10(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn10_20(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn10_01(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn10_11(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn10_21(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn10_02(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn10_12(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn10_22(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn20_00(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn20_10(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn20_20(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn20_01(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn20_11(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn20_21(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn20_02(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn20_12(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn20_22(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn01_00(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn01_10(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn01_20(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn01_01(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn01_11(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn01_21(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn01_02(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn01_12(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn01_22(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn11_00(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn11_10(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn11_20(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn11_01(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn11_11(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn11_21(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn11_02(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn11_12(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn11_22(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn21_00(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn21_10(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn21_20(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn21_01(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn21_11(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn21_21(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn21_02(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn21_12(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn21_22(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn02_00(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn02_10(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn02_20(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn02_01(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn02_11(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn02_21(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn02_02(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn02_12(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn02_22(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn12_00(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn12_10(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn12_20(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn12_01(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn12_11(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn12_21(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn12_02(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn12_12(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn12_22(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn22_00(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn22_10(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn22_20(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn22_01(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn22_11(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn22_21(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn22_02(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn22_12(ActionEvent event)
    {
    }

    @FXML
    private void handleBtn22_22(ActionEvent event)
    {
    }
    
}
