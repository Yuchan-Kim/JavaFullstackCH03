package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int result = 0;
		for (int j = 1; j <= num; j++) {
			if (j == num) {
				System.out.print(j);
			}else {
				System.out.print(j + "+");
			}
		}
		
		for (int i = 1 ; i <= num; i++) {
			result += i;
		}
		
		System.out.println("\n합계: " + result);
		sc.close();
	}

}
