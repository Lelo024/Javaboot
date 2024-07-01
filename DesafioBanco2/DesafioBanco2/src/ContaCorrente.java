public class ContaCorrente  extends conta {
  private static int SEQUENCIAL = 1;

public ContaCorrente() {
    super.agencia = AGENCIA_PADRAO;
    super.numero = SEQUENCIAL++;    
  }
  @Override
  public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Poupanca ===");
    super.imprimirInfoComuns();  }
}
