package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("숫자를 입력하세요: ");
		int input = sc.nextInt();
//		for (int i = 1; i <= input; i++) {
//			for (int j = 1; j <= input; j++) {
//				if(i * j == input) {
//					System.out.println(i);
//				}
//			}
//		}
		for(int i = 1; i <= input; i++) {
			if (input%i ==0){
				System.out.println(i);
			}
		}
		sc.close();

	}

}
