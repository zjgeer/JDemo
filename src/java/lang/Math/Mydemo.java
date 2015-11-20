package demo;

public class Mydemo {

	public static void main(String args[])
	{
		/*
		int a = 12;
		byte b = 13;
		a >>= 1;
		b += 3;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		byte m = 3;
		byte n = 7;
		
		byte i = (byte) (m + n);
		System.out.println(i);
		
		String sa = "三加七为：";
		String sb = "是结果。";
		
		System.out.println(sa + (m + n));
		System.out.println(m + n + sb);
		
		double d1 = 10.0;
		double d2 = 12.0;
		
		double d3 = d1 / 0.0;
		
		System.out.println(d3);
		
		byte b1 = 12;
		byte b2 = 11;
		int it = b1 - b2;
		byte ba = -2;
		byte by = (byte) -ba;
		
		System.out.println(ba + by + it);
		int a1 = -2147483648;
		int b11 = -a;
		
		System.out.println(a1 + b11);
		
		int num = 3 * 5;
		double num1 = 3 * 5.0;
		
		System.out.println(num + "dsds" + num1);
		
		int inta = 10 / 4;
		int intb = 5 / 7;
		
		System.out.println("result :" + inta + "result:" + intb);
		System.out.println(15 % -4);
		System.out.println(-15 % 4);
		System.out.println(6.8 % 6.3);
		System.out.println(15.0 % 0);
		System.out.println(15 % 0.0);
		*/
		int a = 3;
		int b =4;
		int m = 3 * a++;
		int n = 3 * ++b;
		System.out.println("m = " + m + ",a = " + a);
		System.out.println("n = " + n + ",b = " + b);
		
		boolean boo = (true == false);
		printf(boo);
		System.out.println((12.0 / 0) == Double.POSITIVE_INFINITY);
		System.out.println((-12.0 / 0) == Double.NEGATIVE_INFINITY);
		System.out.println(12.3 / 0);
		
		System.out.println((++a>5) && (++b>5));
		System.out.println((++a<5) || (++b<5));
		int c = a > b ? a:b;
		System.out.println(c);
		
		int x = 6;
		int y = 10;
		
		int z = x > y ? x : y;
		System.out.println("x = "+ x + ", y = " + y + ", x与y中比较大的为：" + z + "。");
		System.out.println(Math.PI);
	}

	private static void printf(boolean boo) {
		// TODO Auto-generated method stub
			System.out.println(boo);
	}
}





























