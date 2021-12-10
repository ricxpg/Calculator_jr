package calculator_sc;

import java.lang;
import java.util.Scanner;

/**
 *
 * @author puggioni.riccardo
 */
public class Standard_calcu implements Calculator_interface {

    @Override
    public void standard() {
        Scanner sc = new Scanner(System.in);
        String o = "";
        int num = 0, rex = 0;

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
                }
                System.out.println("OPERAZIONI: + - * / AC off, scegli");
                o = sc.next();
            }
        } while (state);
    }

    @Override
    public void scientific() {
        
    }

    @Override
    public void programmer() {
        
    }

    
}
