package br.com.estudosjava.banco;


import java.time.LocalDate;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(String numeroConta, String titular, String numeroDocumento, Double saldo, boolean ativa, LocalDate dataAbertura) {
        super(numeroConta, titular, numeroDocumento, saldo, ativa, dataAbertura);
    }


    @Override
    public void imprimeTipo(){
        System.out.println("Conta poupanca");

        System.out.println("numeroConta: " +this.getNumeroConta());
        System.out.println("titular: " +this.getTitular());
        System.out.println("numeroDocumento: " +this.getNumeroDocumento());
        System.out.println("saldo: " +this.getSaldo());
        System.out.println("ativa: " +this.isAtiva());
        System.out.println("dataAbertura: " +this.getDataAbertura());
        System.out.println("-------------------------------------------------");

    }
}
