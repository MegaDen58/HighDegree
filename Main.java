package com.company;
import java.util.regex.*;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        String regexp1 = "((((25[0-5])|(2[0-4]\\d))|((1\\d{2})|(\\d{1,2})))\\.){3}(((25[0-5])|(2[0-4]\\d))|((1\\d{2})|(\\d{1,2})))";
        Pattern pattern = Pattern.compile(regexp1);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String word = in.nextLine();
        Matcher m = pattern.matcher(word);
        if(m.find()){
            System.out.printf("Корректный IP адрес: %s.", m.group());
        }
    }
}