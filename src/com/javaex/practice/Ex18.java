package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int inputNum = sc.nextInt();
		for(int i = inputNum; i > 0 ; i--) {
			for(int j = i; j > 0; j --) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int k = 2; k <= inputNum ; k++) {
			for(int a = 1; a <= k; a++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();


	}

}
