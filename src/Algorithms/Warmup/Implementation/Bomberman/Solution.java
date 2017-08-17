package Algorithms.Warmup.Implementation.Bomberman;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int turnos = sc.nextInt();
        String[] tablero = new String[r];
        String[] tableroTemp = new String[r];
        sc.nextLine();
        for (int i = 0; i < r; i++) {
            tablero[i] = sc.nextLine();
        }
        for (int h=2; h<=turnos; h++){
            if (h % 2 == 0) {
                for (int i = 0; i < r; i++) {
                    tableroTemp[i] = tablero[i].replace('.', 'O');
                }
            } else {
                for (int j = 0; j < r; j++) {
                    if (!tablero[j].contains("O")) {
                        continue;
                    }
                    for (int k = tablero[j].indexOf('O'); k < c; k++) {
                        if (tablero[j].charAt(k) == 'O') {
                            StringBuilder temp2 = new StringBuilder(tableroTemp[j]);
                            temp2.setCharAt(k, '.');
                            tableroTemp[j] = temp2.toString();
                            if (j > 0) {
                                StringBuilder temp = new StringBuilder(tableroTemp[j - 1]);
                                temp.setCharAt(k, '.');
                                tableroTemp[j - 1] = temp.toString();
                            }
                            if (j < r - 1) {
                                StringBuilder temp = new StringBuilder(tableroTemp[j + 1]);
                                temp.setCharAt(k, '.');
                                tableroTemp[j + 1] = temp.toString();
                            }
                            if (k > 0) {
                                StringBuilder temp = new StringBuilder(tableroTemp[j]);
                                temp.setCharAt(k - 1, '.');
                                tableroTemp[j] = temp.toString();
                            }
                            if (k < c - 1) {
                                StringBuilder temp = new StringBuilder(tableroTemp[j]);
                                temp.setCharAt(k + 1, '.');
                                tableroTemp[j] = temp.toString();
                            }
                        }
                    }
                }
                tablero = tableroTemp;
            }
            if (turnos % 2 == 0) {
                tablero = tableroTemp;
            }
        }
        for (int i = 0; i < r; i++) {
            System.out.println(tablero[i]);
        }
    }
}
