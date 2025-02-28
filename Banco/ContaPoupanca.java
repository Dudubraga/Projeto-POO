package Banco;

public class ContaPoupanca extends Conta {
    private double taxaRendimento = 0.05;
    
    public ContaPoupanca(int numeroAgencia, int numeroConta, double saldo, Cliente cliente) {
        super(numeroAgencia, numeroConta, saldo, cliente);
    }

    public double simularOperacao(int meses){
        double rendimento = getSaldo();
        for(int i = 0; i < meses; i++){
            rendimento += (this.taxaRendimento * getSaldo());
        }
        return rendimento;
    }
}
