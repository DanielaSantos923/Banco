package br.com.estudosjava.banco;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

    ContaPoupanca contaPoupanca = new ContaPoupanca("123456",
            "Daniela Santos",
            "12345678901",
            120000.00,
            true,
            LocalDate.now());
        System.out.println(contaPoupanca);

    ContaCorrente contaCorrente = new ContaCorrente("123456",
            "Andre Santos",
            "098765432100",
            150000.00,
            true,
             LocalDate.now());
        System.out.println(contaCorrente);


    }
}
