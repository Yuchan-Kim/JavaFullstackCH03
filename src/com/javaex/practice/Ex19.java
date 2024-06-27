package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int amount = 0;
		boolean process = true;
		while(process) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 |  2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			int chosenNum = sc.nextInt();
			switch(chosenNum) {
			case 1:
				System.out.print("예금액> ");
				int deposit = sc.nextInt();
				amount += deposit;
				break;
			case 2:
				System.out.print("출금액> ");
				int withdraw = sc.nextInt();
				if (amount < withdraw) {
					System.out.println("예금액보다 출금액이 더 큽니다.");
				}else {
					amount -= withdraw;
				}
				break;
			case 3:
				System.out.println("잔고액> " + amount);
				break;
			case 4:
				System.out.println("프로그램 종료");
				process =false;
				break;
			default: 
				System.out.println("다시 입력해주세요");
				break;
			}
			
		}
		
		sc.close();
	}

}
