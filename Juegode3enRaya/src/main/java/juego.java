/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SrK
 */
public class juego {

    private byte turno = 1;//1=>jugador 1 2=> jugador 2
    private String marca_X = "X";
    private String marca_O = "O";
    private boolean error=false;//por si se produce algun mensaje
    private byte ganador_es=0;//1=>jugador 1 2=> jugador 2 3=>Empate
    //matriz para almacenar los movimientos del juego
    private String tablero[][] ={{"","",""},
                                 {"","",""},
                                 {"","",""}
                                };
