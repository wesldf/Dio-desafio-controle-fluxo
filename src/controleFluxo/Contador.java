package controleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parametro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("Segundo parametro deve ser maior que o primeiro");
        }
    }

    static class ParametrosInvalidosException extends Exception {
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm + 1;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("contagem" + i);
            }
        }
    }
}