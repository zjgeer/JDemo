package demo;

public class Mydemo {
	// 十进制数
	byte bnum = 0;
	short snum = 0;
	int inum = 0;
	long lnum = 0;
	
	int five = 05;
	int seven = 07;
	int eight = 010;
	int ten = 012;
	
	int x = 0x01;
	int y = 0X05;
	int z = 0X30;
	
	long decimal = 12345L;
	long octal = 0123456L;
	long hex = 0XCafe;
	
	byte b = 28;
	public static void main(String args[])
	{
		byte b = 127;
		short s = 32767;
		System.out.print("It's my second test of java!\n");
		
		System.out.println(b);
		System.out.print(s);
		
		System.out.println();
		
		float pi = 3.1415926F;
		double d = 5.2666;
		
		System.out.print(pi);
		System.out.println();
		System.out.print(d);
		
		char a = 'a';
		char cb = 'b';
		char cpi = '\u03c0';
		System.out.println();
		System.out.print(cpi);
	}
	
}





























