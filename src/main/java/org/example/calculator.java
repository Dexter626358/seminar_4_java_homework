package org.example;

import java.util.Stack;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.XMLFormatter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) throws IOException {
        calculatorDouble();
    }
    public static String calculatorDouble() throws IOException {
        Stack<Double> resultStack = new Stack<>();
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("calclogger.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        boolean flag = true;
        logger.info("Начало работы калькулятора");
        while (flag){
            System.out.println("Калькулятор умеет делать простые операции над числами");
            System.out.println("Введите операцию:\n 1. Сложение.\n 2. Вычитание.\n 3. Умножение.\n 4. Деление.\n 5. Выход\n 6. Вывести стэк.");
            Scanner scan = new Scanner(System.in);
            String operation = scan.next();
            switch (operation) {
                case "1" -> {
                    logger.info("Пользователь выбрал операцию сложение");
                    String[] data = inp_numbers();
                    String num1 = data[0];
                    String num2 = data[1];
                    logger.info(String.format("пользователь ввел %s и %s", num1, num2));
                    double a = Double.parseDouble(num1);
                    double b = Double.parseDouble(num2);
                    System.out.println(a + " + " + b + " = " + (a + b));
                    resultStack.add(a + b);
                    logger.info(String.format("Результат сложения %s и %s равено %f", num1, num2, a + b));

                }
                case "2" -> {
                    logger.info("Пользователь выбрал операцию вычитание");
                    String[] data = inp_numbers();
                    String num1 = data[0];
                    String num2 = data[1];
                    logger.info(String.format("пользователь ввел %s и %s", num1, num2));
                    double a = Double.parseDouble(num1);
                    double b = Double.parseDouble(num2);
                    System.out.println(a + " - " + b + " = " + (a - b));
                    resultStack.add(a - b);
                    logger.info(String.format("Результат вычитпния %s и %s равено %f", num1, num2, a - b));

                }
                case "3" -> {
                    logger.info("Пользователь выбрал операцию умножение");
                    String[] data = inp_numbers();
                    String num1 = data[0];
                    String num2 = data[1];
                    logger.info(String.format("пользователь ввел %s и %s", num1, num2));
                    double a = Double.parseDouble(num1);
                    double b = Double.parseDouble(num2);
                    System.out.println(a + " * " + b + " = " + (a * b));
                    resultStack.add(a * b);
                    logger.info(String.format("Результат умножения %s и %s равено %f", num1, num2, a * b));

                }
                case "4" -> {
                    logger.info("Пользователь выбрал операцию деление");
                    String[] data = inp_numbers();
                    String num1 = data[0];
                    String num2 = data[1];
                    logger.info(String.format("пользователь ввел %s и %s", num1, num2));
                    double a = Double.parseDouble(num1);
                    double b = Double.parseDouble(num2);
                    if (b != 0) {
                        System.out.println(a + " / " + b + " = " + (a / b));
                        resultStack.add(a / b);
                        logger.info(String.format("Результат деления %s и %s равено %f", num1, num2, a / b));
                    } else {
                        System.out.println("Деление на ноль");
                        logger.info("Деление на ноль");
                    }

                }
                case "5" -> {
                    flag = false;
                    logger.info("Выход из программы");
                }
                case "6" -> {
                    System.out.println(resultStack);
                }
                default -> {
                    System.out.println("Некорректный ввод");
                    logger.warning("Недопустимое значение");
                }
            }

        }


        return null;
    }

    public static String[] inp_numbers() throws IOException {
        System.out.println("Введите числа через пробел");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine().split(" ");
    }
}
