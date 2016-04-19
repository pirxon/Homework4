package homework4;

public class Zadanija {

	public static void _1() {
		System.out.println("One\nTwo\nTree");
	}
	
	public static void _2() {
		double n = 563.25638;
		
		int temp = (int)(n * 100000);
		int a1 = (temp % 100000000 / 10000000);
		int a2 = (temp % 10000000 / 1000000);
		int a3 = (temp % 1000000 / 100000);
	    int a4 = (temp % 100000 / 10000);
	 	int a5 = (temp % 10000 / 1000);
	    int a6 = (temp % 1000 / 100);
	    int a7 = (temp % 100 / 10);
	    int a8 = (temp % 10);
	    
	    int res = a1+a2-a3+a4-a5+a6-a7+a8;
	    
	    System.out.println("Задано число - "+n);
	    System.out.println("Результат  5+6-3+2-5+6-3+8 = "+res);
	}
	
	public static void _3() {
		int dohod = 200000;
		System.out.println("Ваш ежемесячный доход - "+dohod);
		if(dohod > 0 & dohod < 1000) {System.out.println("критически малый доход");}
		else if (dohod > 1000 & dohod < 5000) {System.out.println("средний доход");}
		else if (dohod > 5000 & dohod < 100000) {System.out.println("высокий доход");}
		else if (dohod > 100000) {System.out.println("Вы миллионер");} 
	}
}
