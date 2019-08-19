package ru.stqa.pfr.sandbox;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFirstProgram {

  public static void main(String[] args) {

    String currentDate = new SimpleDateFormat("yyyy/MM/dd").format(new Date()).replace("/", "-");
    System.out.println(currentDate);


    hello("world");
    hello("Max");


    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}
