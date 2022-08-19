package com.navakanth;
public class Variable {
public static void main(String args[]) {
	//System.out.print("Hello World");
//variables
/* size of int 4 bytes (32 bits), float 4 bytes(32 bits), double 8 bytes, short 2 bytes(16 bits) */
	int num = 5; // variable name can have $, _ and variable name should not start with number like 4abc it can be like _$a4bc_
	num =8; //once we have defined variables we can change it.
	float percent1 =5.5f; //here if we write float x =5.5 it will give compile error because 5.5 by default it will double so we can't store it in float to make it float we need to put 'f'  like float x =5.5f
	double percent =5.5;
	short s =5; //2 bytes -> 16 bits -> -32768 to 32767
	byte b =5; // 1byte -> 8 bit -> -128 to 127
	long l =5000000000l; // if we have a very big number more than 10 numbers we can go with long 8bytes, here we need to specify number and l.
	
	char c ='A';
	c = 66; // we can assign an integer to a character 
	//c++;
	System.out.println(c); // it will print B because the ASCII value of B is 66
	
// conversions
	double d =5; // doble supports int value also. so this is called as implicit conversion( we don't need to convert that value it will automtically convert it)
	int k =(int)5.5; //  here we are doing type casting because 5.5 is double and it will print only 5 (explict conversion)
	
}
}
