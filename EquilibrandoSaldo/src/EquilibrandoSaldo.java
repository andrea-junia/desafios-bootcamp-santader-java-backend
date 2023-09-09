import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();


        saldoAtual= atualizarSaldo(saldoAtual, valorDeposito, valorRetirada);
        System.out.println("Saldo atualizado na conta: " + saldoAtual);

       scanner.close();
   }

   public static double atualizarSaldo(double saldoAtual, double valorDeposito, double valorRetirada) {
       // Atualiza o saldo com o valor do depósito
       saldoAtual += valorDeposito;

       // Atualiza o saldo subtraindo o valor da retirada
       saldoAtual -= valorRetirada;

       // Retorna o saldo atualizado
       return Math.round(saldoAtual * 10) / 10.0;
   }
}