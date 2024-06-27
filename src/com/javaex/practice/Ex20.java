package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int gameNum = 29;
        boolean checker = false;
        System.out.println("=================================");
        System.out.println("\t[숫자맞추기게임 시작]\t");
        System.out.println("=================================");
        while(checker == false) {
            
            System.out.print(">> ");
            int input = sc.nextInt();
            if (input > gameNum) {
                System.out.println("더 낮게");
            } else if(input < gameNum) {
                System.out.println("더 높게");
            } else {
                System.out.print("맞았습니다. \n게임을 종료하시겠습니다?(y/n) ");
                String endPlay = sc.next();
                if (endPlay.equals("y") || endPlay.equals("Y")) {
                    System.out.println("=================================");
                    System.out.println("\t[숫자맞추기게임 종료]\t");
                    System.out.println("=================================");
                    checker = true;
                }else if (endPlay.equals("n") || endPlay.equals("N")) {
                	System.out.println("=================================");
                    System.out.println("\t[숫자맞추기게임 시작]\t");
                    System.out.println("=================================");
                }
            }
        }
        sc.close();
    }
}
