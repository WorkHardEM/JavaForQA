package ru.stqa.pfr.sandbox;

import java.util.Arrays;
import java.util.List;

public class Collections {

  public static void main(String[] args) {
    String[] langs = new String[4];
    langs[0] = "Java";
    langs[1] = "C#";
    langs[2] = "Python";
    langs[3] = "PHP";

    String[] langs2 = {"Java", "C#", "Python", "PHP"};
    for (int i = 0; i < langs2.length; i++) {
      System.out.println("Я хочу выучить " + langs2[i]);
    }

    for (String l : langs2) {
      System.out.println("Я хочу выйчить " + l);
    }

    List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");

    for (String l : languages) {
      System.out.println("Я хочу выучить " + l);
    }

    for (int i = 0; i < languages.size(); i++) {
      System.out.println("Я хочу выйчить " + languages.get(i));
    }
  }
}
