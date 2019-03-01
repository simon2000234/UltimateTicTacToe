/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;

import javafx.scene.control.Label;

import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import ultimatetictactoe.field.UTTTField;
import ultimatetictactoe.game.GameManager;
import ultimatetictactoe.game.GameState;
import ultimatetictactoe.move.Move;

/**
 *
 * @author Melchertsen
 */
public class FXMLDocumentController implements Initializable
{

    private Label label;
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
    private GameManager gm;
    private GameState gs;
    private UTTTField field;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        theMove = new Move();
        field = new UTTTField();
        gs = new GameState(field);
        gm = new GameManager(gs);
    }

    @FXML
    private void handleBtn00_00(ActionEvent event)
    {
        int player = gm.getCurrentPlayer();
        Button clickedButton = (Button) event.getSource();
        GridPane microPane = (GridPane) clickedButton.getParent();
        Integer row = GridPane.getRowIndex((Node) event.getSource());
        Integer col = GridPane.getColumnIndex((Node) event.getSource());
        Integer macroRow = GridPane.getRowIndex((Node) microPane);
        Integer macroCol = GridPane.getColumnIndex((Node) microPane);
        Button btn = (Button) event.getSource();
        int r = (row == null) ? 0 : row;
        int rm = (macroRow == null) ? 0 : macroRow;
        int c = (col == null) ? 0 : col;
        int cm = (macroCol == null) ? 0 : macroCol;
        String xOrO = player == 0 ? "X" : "O";
        int Xmove = r + (rm * 3);
        int Ymove = c + (cm * 3);
        theMove.setX(Xmove);
        theMove.setY(Ymove);
        if (gm.updateGame(theMove))
        {
            btn.setText(xOrO);
        }
        else 
        {
            return;  //move vas not valid;
        }
        System.out.println(Xmove + "," + Ymove);
        //x**
        //***
        //***
        if ((Xmove == 0 && Ymove == 0) || (Xmove == 0 && Ymove == 3) || (Xmove == 0 && Ymove == 6)
                || (Xmove == 3 && Ymove == 0) || (Xmove == 3 && Ymove == 3) || (Xmove == 3 && Ymove == 6)
                || (Xmove == 6 && Ymove == 0) || (Xmove == 6 && Ymove == 3) || (Xmove == 6 && Ymove == 6))
        {
            for (int i = 0; i < 9; i++)
            {
                for (int j = 0; j < 9; j++)
                {
                    if (i <= 2 && j <= 2)
                    {
                        if (field.getBoard()[j][i] == ".")
                        {
                            field.getBoard()[j][i] = "-1";
                        }
                    } else 
                    {
                        if (field.getBoard()[j][i] != "0" && field.getBoard()[j][i] != "1")
                        {
                            field.getBoard()[j][i] = ".";
                        }
                    }

                }

            }

        }
        //*x*
        //***
        //***
        if ((Xmove == 0 && Ymove == 1) || (Xmove == 0 && Ymove == 4) || (Xmove == 0 && Ymove == 7)
                || (Xmove == 3 && Ymove == 1) || (Xmove == 3 && Ymove == 4) || (Xmove == 3 && Ymove == 7)
                || (Xmove == 6 && Ymove == 1) || (Xmove == 6 && Ymove == 4) || (Xmove == 6 && Ymove == 7))
        {
            for (int i = 0; i < 9; i++)
            {
                for (int j = 0; j < 9; j++)
                {
                    if ((i > 2 && i <6) && (j <=2 ))
                    {
                        if (field.getBoard()[j][i] == ".")
                        {
                            field.getBoard()[j][i] = "-1";
                        }
                    } else 
                    {
                        if (field.getBoard()[j][i] != "0" && field.getBoard()[j][i] != "1")
                        {
                            field.getBoard()[j][i] = ".";
                        }
                    }

                }

            }

        }
        //**x
        //***
        //***
        if ((Xmove == 0 && Ymove == 2) || (Xmove == 0 && Ymove == 5) || (Xmove == 0 && Ymove == 8)
                || (Xmove == 3 && Ymove == 2) || (Xmove == 3 && Ymove == 5) || (Xmove == 3 && Ymove == 8)
                || (Xmove == 6 && Ymove == 2) || (Xmove == 6 && Ymove == 5) || (Xmove == 6 && Ymove == 8))
        {
            for (int i = 0; i < 9; i++)
            {
                for (int j = 0; j < 9; j++)
                {
                    if ((i >5) && (j <=2))
                    {
                        if (field.getBoard()[j][i] == ".")
                        {
                            field.getBoard()[j][i] = "-1";
                        }
                    } else 
                    {
                        if (field.getBoard()[j][i] != "0" && field.getBoard()[j][i] != "1")
                        {
                            field.getBoard()[j][i] = ".";
                        }
                    }

                }

            }

        }
        //***
        //x**
        //***
        if ((Xmove == 1 && Ymove == 0) || (Xmove == 1 && Ymove == 3) || (Xmove == 1 && Ymove == 6)
                || (Xmove == 4 && Ymove == 0) || (Xmove == 4 && Ymove == 3) || (Xmove == 4 && Ymove == 6)
                || (Xmove == 7 && Ymove == 0) || (Xmove == 7 && Ymove == 3) || (Xmove == 7 && Ymove == 6))
        {
            for (int i = 0; i < 9; i++)
            {
                for (int j = 0; j < 9; j++)
                {
                    if ((i <3) && (j >2 && j <6))
                    {
                        if (field.getBoard()[j][i] == ".")
                        {
                            field.getBoard()[j][i] = "-1";
                        }
                    } else 
                    {
                        if (field.getBoard()[j][i] != "0" && field.getBoard()[j][i] != "1")
                        {
                            field.getBoard()[j][i] = ".";
                        }
                    }

                }

            }

        }
        //***
        //*x*
        //***
        if ((Xmove == 1 && Ymove == 1) || (Xmove == 1 && Ymove == 4) || (Xmove == 1 && Ymove == 7)
                || (Xmove == 4 && Ymove == 1) || (Xmove == 4 && Ymove == 4) || (Xmove == 4 && Ymove == 7)
                || (Xmove == 7 && Ymove == 1) || (Xmove == 7 && Ymove == 4) || (Xmove == 7 && Ymove == 7))
        {
            for (int i = 0; i < 9; i++)
            {
                for (int j = 0; j < 9; j++)
                {
                    if ((i >2 && i <6) && (j >2 && j <6))
                    {
                        if (field.getBoard()[j][i] == ".")
                        {
                            field.getBoard()[j][i] = "-1";
                        }
                    } else 
                    {
                        if (field.getBoard()[j][i] != "0" && field.getBoard()[j][i] != "1")
                        {
                            field.getBoard()[j][i] = ".";
                        }
                    }

                }

            }

        }
        //***
        //**x
        //***
        if ((Xmove == 1 && Ymove == 2) || (Xmove == 1 && Ymove == 5) || (Xmove == 1 && Ymove == 8)
                || (Xmove == 4 && Ymove == 2) || (Xmove == 4 && Ymove == 5) || (Xmove == 4 && Ymove == 8)
                || (Xmove == 7 && Ymove == 2) || (Xmove == 7 && Ymove == 5) || (Xmove == 7 && Ymove == 8))
        {
            for (int i = 0; i < 9; i++)
            {
                for (int j = 0; j < 9; j++)
                {
                    if ((i >5) && (j >2 && j <6))
                    {
                        if (field.getBoard()[j][i] == ".")
                        {
                            field.getBoard()[j][i] = "-1";
                        }
                    } else 
                    {
                        if (field.getBoard()[j][i] != "0" && field.getBoard()[j][i] != "1")
                        {
                            field.getBoard()[j][i] = ".";
                        }
                    }

                }

            }

        }
        //***
        //***
        //x**
        if ((Xmove == 2 && Ymove == 0) || (Xmove == 2 && Ymove == 3) || (Xmove == 2 && Ymove == 6)
                || (Xmove == 5 && Ymove == 0) || (Xmove == 5 && Ymove == 3) || (Xmove == 5 && Ymove == 6)
                || (Xmove == 8 && Ymove == 0) || (Xmove == 8 && Ymove == 3) || (Xmove == 8 && Ymove == 6))
        {
            for (int i = 0; i < 9; i++)
            {
                for (int j = 0; j < 9; j++)
                {
                    if ((i <3) && (j >5))
                    {
                        if (field.getBoard()[j][i] == ".")
                        {
                            field.getBoard()[j][i] = "-1";
                        }
                    } else 
                    {
                        if (field.getBoard()[j][i] != "0" && field.getBoard()[j][i] != "1")
                        {
                            field.getBoard()[j][i] = ".";
                        }
                    }

                }

            }

        }
        //***
        //***
        //*x*
        if ((Xmove == 2 && Ymove == 1) || (Xmove == 2 && Ymove == 4) || (Xmove == 2 && Ymove == 7)
                || (Xmove == 5 && Ymove == 1) || (Xmove == 5 && Ymove == 4) || (Xmove == 5 && Ymove == 7)
                || (Xmove == 8 && Ymove == 1) || (Xmove == 8 && Ymove == 4) || (Xmove == 8 && Ymove == 7))
        {
            for (int i = 0; i < 9; i++)
            {
                for (int j = 0; j < 9; j++)
                {
                    if ((i >2 && i<6) && (j >5))
                    {
                        if (field.getBoard()[j][i] == ".")
                        {
                            field.getBoard()[j][i] = "-1";
                        }
                    } else 
                    {
                        if (field.getBoard()[j][i] != "0" && field.getBoard()[j][i] != "1")
                        {
                            field.getBoard()[j][i] = ".";
                        }
                    }

                }

            }

        }
        //***
        //***
        //**x
        if ((Xmove == 2 && Ymove == 2) || (Xmove == 2 && Ymove == 5) || (Xmove == 2 && Ymove == 8)
                || (Xmove == 5 && Ymove == 2) || (Xmove == 5 && Ymove == 5) || (Xmove == 5 && Ymove == 8)
                || (Xmove == 8 && Ymove == 2) || (Xmove == 8 && Ymove == 5) || (Xmove == 8 && Ymove == 8))
        {
            for (int i = 0; i < 9; i++)
            {
                for (int j = 0; j < 9; j++)
                {
                    if ((i >5) && (j >5))
                    {
                        if (field.getBoard()[j][i] == ".")
                        {
                            field.getBoard()[j][i] = "-1";
                        }
                    } else 
                    {
                        if (field.getBoard()[j][i] != "0" && field.getBoard()[j][i] != "1")
                        {
                            field.getBoard()[j][i] = ".";
                        }
                    }

                }

            }

        }
        
        System.out.println(Arrays.deepToString(gs.getField().getBoard()));
        System.out.println(Arrays.deepToString(gs.getField().getMacroboard()));

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
