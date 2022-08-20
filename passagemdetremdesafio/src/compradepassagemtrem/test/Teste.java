package compradepassagemtrem.test;

import compradepassagemtrem.dominio.Assento;
import compradepassagemtrem.dominio.Passageiro;
import compradepassagemtrem.dominio.Vagao;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Vagao vagao = new Vagao();

        for (Assento assento : vagao.getAssentos()) {
            System.out.println(assento.toString());
        }

    }
}
