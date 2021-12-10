/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_sc;

import java.util.Scanner;

/**
 *
 * @author puggioni.riccardo
 */
public class Calculator_sc {

    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Standard_calcu standard = new Standard_calcu();
        Scientific_calc scientific = new Scientific_calc();
        Programmer_calc programmer = new Programmer_calc();
        System.out.println("Scegli una calcolatrice da usare: ");
        System.out.println("1. Standard"
                + "\n2. Scientifica"
                + "\n3. Personalizzata");
        switch (sc.nextInt()) {
            case 1:
                standard.standard();
            case 2:
                scientific.scientific();
            case 3:
                programmer.programmer();
        }
    }

}
