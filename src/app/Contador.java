package app;

import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int parametro1, parametro2;

        System.out.print("Informe o primeiro valor:\n> ");
        parametro1 = sc.nextInt();
        System.out.print("Informe o segundo valor:\n> ");
        parametro2 = sc.nextInt();

        try {
            contar(parametro1,parametro2);
        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }

    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1>parametro2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }
        else{
            for (int i = 1; i<=(parametro2-parametro1);i++){
                System.out.println("Imprimindo o número: " + i);
            }
        }
    }
}
