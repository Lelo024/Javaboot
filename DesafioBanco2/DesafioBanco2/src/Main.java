public class Main {
    public static void main(String[] args) {
        conta cc = new ContaCorrente();
        conta poupanca = new ContaPoupanca();
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
