package edu.ebac;

import java.util.Scanner;

/**
 * @author vinisantosn
 */

public class Main {
    public static void main(String[] args) {
        double numberTypeDouble;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número: ");
        numberTypeDouble = scanner.nextDouble();
        //TO DO: Imprimir o tipo do numberTypeDouble

        Double numberTypeDoubleWithWrapper = (Double) numberTypeDouble;
        System.out.println(numberTypeDoubleWithWrapper.getClass().getSimpleName());
    }
}