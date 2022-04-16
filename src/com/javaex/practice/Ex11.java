package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		char abc = sc.next().charAt(0); //sc.next()은 String값만 받기 떄문에 뒤에 char형 변수를 꺼내야함.
		
		switch (abc) {
		case 'a':
			System.out.print("모음");			
			break;
		case 'b':
			System.out.print("자음");
		case 'c':
			System.out.print("자음");			
			break;
		case 'd':
			System.out.print("자음");			
			break;
		case 'e':
			System.out.print("모음");			
			break;
		case 'f':
			System.out.print("자음");			
			break;
		case 'g':
			System.out.print("자음");			
			break;
		case 'h':
			System.out.print("자음");			
			break;
		case 'i':
			System.out.print("모음");			
			break;
		case 'j':
			System.out.print("자음");			
			break;
		case 'k':
			System.out.print("자음");			
			break;
		case 'l':
			System.out.print("자음");			
			break;
		case 'm':
			System.out.print("자음");			
			break;
		case 'n':
			System.out.print("자음");			
			break;
		case 'o':
			System.out.print("모음");			
			break;
		case 'p':
			System.out.print("자음");			
			break;
		case 'q':
			System.out.print("자음");			
			break;
		case 'r':
			System.out.print("자음");			
			break;
		case 's':
			System.out.print("자음");			
			break;
		case 't':
			System.out.print("자음");			
			break;
		case 'u':
			System.out.print("모음");			
			break;
		case 'v':
			System.out.print("자음");			
			break;
		case 'w':
			System.out.print("자음");			
			break;
		case 'x':
			System.out.print("자음");			
			break;
		case 'y':
			System.out.print("자음");			
			break;
		case 'z':
			System.out.print("자음");			
			break;
		default:		
			break;
		}
		sc.close();
		System.out.println("입니다.");
	}

}
