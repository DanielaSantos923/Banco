package br.com.estudosjava.banco;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

    Conta conta1 = new ContaPoupanca("123456", "Andre Santos","098765432100",
            15000.00, true, LocalDate.now() );
        conta1.imprimeTipo();


    Conta conta2 = new ContaCorrente("54321", "Daniela Santos", "48962315788",
            28000.00, true, LocalDate.now());
        conta2.imprimeTipo();

    }
}
