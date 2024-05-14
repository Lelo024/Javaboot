import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> contas= new HashMap<>();

        while (true) {
           System.out.println("Por favor, digite o Número da Agência:");
           int Numeroagencia  = input.nextInt();
           System.out.println("Por favor, digite o Número da Conta:");
           int Numeroconta  = input.nextInt();
           System.out.print("Por favor, digite seu nome:");

           String nome = scanner.nextLine();

           System.out.println("Olá, " + nome + "! Sua Agência e Conta: " + Numeroagencia+"-" + Numeroconta);

           System.out.print("Deseja continuar? (s/n): ");
           String resposta = scanner.nextLine();
           if (resposta.equalsIgnoreCase("s"))
           System.out.println("Final do projeto");{
               return; // Encerra o método main, finalizando o programa


        }
           
        }
    }

}
    