package calculator_sc;

import java.lang;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author puggioni.riccardo
 */
public class Scientific_calc implements Calculator_interface {

    @Override
    public void standard() {

    }

    public static double sin(double d) {
        return d;
    }

    @Override
    public void scientific() {
        Scanner sc = new Scanner(System.in);
        String o = "";
        double num = 0, rex = 0;

        boolean state = true, equals = false;

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
                System.out.println("OPERAZIONI: + - * / = sin cos ln"
                        + " tan mod log AC off, scegli");
                o = sc.next();
            }
        } while (state);
    }

    @Override
    public void programmer() {
        
    }

}
