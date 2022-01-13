package br.com.estudosjava.banco;

import java.time.LocalDate;

public class ContaPoupanca {
    private String numeroConta;
    private String titular;
    private String numeroDocumento;
    private Double saldo;
    private boolean ativa;
    private LocalDate dataAbertura;

    public ContaPoupanca(String numeroConta, String titular, String numeroDocumento, double saldo, boolean ativa, LocalDate dataAbertura) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.numeroDocumento = numeroDocumento;
        this.saldo = saldo;
        this.ativa = ativa;
        this.dataAbertura = dataAbertura;
    }

    public String toString() {
        return "ContaPoupanca{" +
                "numeroConta='" + numeroConta + '\'' +
                "titular='" + titular + '\'' +
                "numeroDocumento='" + numeroDocumento + '\'' +
                "saldo='" + saldo + '\'' +
                "ativa='" + ativa + '\'' +
                "dataAbertura='" + dataAbertura + '\'' +
                '}';
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public Double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }


    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public void setDataAbertura(LocalDate dataAbertura){
        this.dataAbertura = dataAbertura;
    }
}
