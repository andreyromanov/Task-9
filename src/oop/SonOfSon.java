package oop;

import java.util.Scanner;

public class SonOfSon extends SonOfArif {

    public static void main(String[] args) {
        int q;
        System.out.print("Выберите тип операции (1-сложение, 2-вычитание, 3-деление, 4-умножение) ");
        Scanner in = new Scanner(System.in);
        q = in.nextInt();
        if (q == 4) {
            Arif o1 = new Arif();
            o1.Mult();
        }
        if (q == 3) {
            SonOfArif o1 = new SonOfArif();
            o1.Div();
        }
        if (q == 2) {
            SonOfArif o1 = new SonOfArif();
            o1.Minus();
        }
        if (q == 1) {
            Arif o1 = new Arif();
            o1.Plus();
        }
    }
public SonOfSon() {
        System.out.println("Конструктор класса SonOfArif создан");
    }
}
