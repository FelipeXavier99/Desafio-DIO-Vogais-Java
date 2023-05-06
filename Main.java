Desenvolva um programa que receba uma string S como entrada e retorne a mesma string S com as vogais em caixa alta e as consoantes em caixa baixa. O programa deve imprimir a string gerada na saída padrão.

Entrada
Uma string qualquer.

Saída
A string informada com as vogais em caixa alta e as consoantes em caixa baixa.





// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   

        
        // Lê a string de entrada
        String input = sc.nextLine();
        
        // Cria uma string para armazenar a string modificada
        StringBuilder output = new StringBuilder();
        
        // Percorre cada caractere da string de entrada
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            // Verifica se o caractere é uma vogal
            if ("AEIOUaeiou".indexOf(c) != -1) {
                // Se for vogal, adiciona o caractere em caixa alta à string de saída
                output.append(Character.toUpperCase(c));
            } else {
                // Se for consoante, adiciona o caractere em caixa baixa à string de saída
                output.append(Character.toLowerCase(c));
            }
        }
        
        // Imprime a string modificada na saída padrão
        System.out.println(output.toString());
        
        sc.close();
    }
}
