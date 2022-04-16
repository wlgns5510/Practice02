package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		double m;
		double tax;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		m = sc.nextDouble();
		
		if(0 <= m && m <= 1000) {
			tax = 0.09*m;
			System.out.println("소득세는 " + tax +" 입니다.");
		}
		else if(1000 < m && m <= 4000) {
			tax = 1000*0.09 + 0.18*(m-1000);
			System.out.println("소득세는 " + tax +" 입니다.");
		}
		else if(4000 < m && m < 8000) {
			tax = 1000*0.09 + 3000*0.18 + 0.27*(m-4000);
			System.out.println("소득세는 " + tax +" 입니다.");
		}
		else if(8000 <= m) {
			tax = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(m-8000);
			System.out.println("소득세는 " + tax + " 입니다.");
		}
		else {
			System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();
	
	
	}

}
