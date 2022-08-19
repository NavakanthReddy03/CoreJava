package com.navakanth;

public class Operators {
/*
 * Arithmetic +,-,*,/,%
 * BitWise << >>
 * Relational
 * Logical
 */
	public static void main(String[] args) {
		int m=6,n=2; 
		int r1 =m+n; //8 n+=m which is equals to n = n+m; ++n is called pre-increment, n++ post increment
		int r2=m-n; //4
		int r3=m*n; //12
		double r4=(double)m/n; //3 always gives quotient
		int r5 = m%n; // gives remainder
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		//m=++n; preincrement
		//System.out.println(m); //3
		//System.out.println(n); //3
		m=n++; //post-increment
		System.out.println(m); //2
		System.out.println(n); //3

	}

}
