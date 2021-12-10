package calculator_sc;

import java.lang;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author puggioni.riccardo
 */
public class Programmer_calc implements Calculator_interface {

    static Scanner sc = new Scanner(System.in);

    @Override
    public void standard() {

    }

    @Override
    public void scientific() {

    }

    @Override
    public void programmer() {
        String o = "";
        double num = 0, rex = 0;
        System.out.println("Seleziona una modalità: "
                + "\n1. Standard"
                + "\n2. Convertitore");
        int cycle1 = sc.nextInt();
        switch (cycle1) {
            case 1:

                boolean state = true,
                 equals = false;

                do {
                    switch (o) {
                        case "=":
                            System.out.println("RISULTATO: " + rex);
                            equals = true;
                            break;
                        case "AC":
                            o = "";
                            equals = false;
                            break;
                        case "off":
                            state = false;
                            break;
                    }
                    if (state) {
                        if (!equals) {
                            System.out.println("Inserisci un numero");
                            num = sc.nextInt();
                        } else {
                            equals = false;
                        }
                        switch (o) {
                            case "":
                                rex = num;
                                break;
                            case "+":
                                rex = rex + num;
                                break;
                            case "-":
                                rex = rex - num;
                                break;
                            case "*":
                                rex = rex * num;
                                break;
                            case "/":
                                rex = rex / num;
                                break;
                            case "sin":
                                rex = Math.toRadians(Math.sin(num));
                                break;
                            case "cos":
                                rex = Math.toRadians(Math.cos(num));
                                break;
                            case "log":
                                rex = Math.toRadians(Math.log(num));
                                break;
                            case "tan":
                                rex = Math.toRadians(Math.atan(num));
                                break;

                        }

                        System.out.println("Scegli tra le operazioni: + - * / = sin cos ln"
                                + " tan mod log AC off");
                        o = sc.next();
                    }

                } while (state);
            case 2:
                System.out.println("seleziona tra: hex, bin, oct ");
                String cycle3 = "";
                cycle3 = sc.next();
                switch (cycle3) {
                    case "hex":
                        System.out.println("Inserisci un numero: ");
                        int i = sc.nextInt();
                        String hex = Integer.toHexString(i);
                        System.out.println("Hex value is " + hex);
                        break;
                    case "bin":
                        int binary[] = new int[40];
                        int index = 0;
                        System.out.println("Inserisci il numero: ");
                        int decimal = sc.nextInt();
                        while (decimal > 0) {
                            binary[index++] = decimal % 2;
                            decimal = decimal / 2;
                        }
                        for (int h = index - 1; h >= 0; h--) {
                            System.out.print(binary[h]);
                        }
                        System.out.println();
                        break;
                    case "oct":
                        System.out.println("Inserisci un numero: ");
                        String octalString = sc.next();
                        int decimal2 = Integer.parseInt(octalString, 8);
                        System.out.println(decimal2);
                        break;
                    

                }

        }
    }
}
