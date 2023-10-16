package com.esteban.ejemplo2;

import java.util.Scanner;

public class Ejemplo2 {

    public static void main(String[] args) {
        String[] abecedario = new String[26];
        //String[] abecedarioL = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "K", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        abecedario[0] = "A";
        abecedario[1] = "B";
        abecedario[2] = "C";
        abecedario[3] = "D";
        abecedario[4] = "E";
        abecedario[5] = "F";
        abecedario[6] = "G";
        abecedario[7] = "H";
        abecedario[8] = "I";
        abecedario[9] = "J";
        abecedario[10] = "K";
        abecedario[11] = "L";
        abecedario[12] = "M";
        abecedario[13] = "N";
        abecedario[14] = "O";
        abecedario[15] = "P";
        abecedario[16] = "K";
        abecedario[17] = "R";
        abecedario[18] = "S";
        abecedario[19] = "T";
        abecedario[20] = "U";
        abecedario[21] = "V";
        abecedario[22] = "W";
        abecedario[23] = "X";
        abecedario[24] = "Y";
        abecedario[25] = "Z";

        System.out.println("ABECEDARIO");
        for (int i = 0; i < abecedario.length; i++) {
            System.out.print(abecedario[i] + " ");
        }
    }
}
