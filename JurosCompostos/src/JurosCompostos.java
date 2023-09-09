import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        double valorInicial = scanner.nextDouble(); //C
        double taxaJuros = scanner.nextDouble(); //i
        int periodo = scanner.nextInt(); // t
        double valorFinal = valorInicial; //M
        DecimalFormat df = new DecimalFormat();
        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        //formula juros compostos
        //M = C ( 1+i)t
        for (int i = 0; i < periodo; i++) {
            valorFinal += valorFinal * taxaJuros;
        }        

        df.applyPattern("R$ ###0.00");
        System.out.println("Valor final do investimento: " + df.format(valorFinal));
        
        scanner.close();
    }
}