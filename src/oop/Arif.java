package oop;

import java.util.Scanner;

public class Arif {

    public double x;
    public double y = 1;

    public void Plus() {
        System.out.println("Enter x for summ ");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        double Sum = x + y;
        System.out.println("Сумма = " + Sum);
    }

    public void Minus() {
        System.out.println("Enter x for minus ");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        double Sum = x - y;
        System.out.println("Разница = " + Sum);
    }

    public void Div() {
        System.out.println("Enter x for divide ");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        double Sum = x / y;
        System.out.println("Деление = " + Sum);
    }

    public void Mult() {
        System.out.print("Enter x for multi ");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        double Sum = x * y;
        System.out.println("Умножение = " + Sum);
    }

    public Arif() {
        System.out.println("Конструктор класса Arif создан");
    }

}
