package br.com.jvtrf;


import java.util.Arrays;
import java.util.Scanner;

public class InversorTarget {
    public void inverterString() {
        System.out.println("Insira uma String");
        Scanner sc = new Scanner(System.in);
        String[] valorInserido = sc.next().toLowerCase().split("");
        int tamanhoString = valorInserido.length;
        String[] valorInvertido = new String[tamanhoString];
        for(int i = 0 ; i < tamanhoString; i ++) {
            valorInvertido[i] = valorInserido[tamanhoString - i - 1];
        }
        System.out.println(Arrays.toString(valorInvertido));
    }
}
