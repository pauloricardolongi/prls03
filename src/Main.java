import java.util.Locale;

public class Main {

	public static void main(String[] args) {		
		int y= 32;
		double x= 10.35784;
		double z= 10.35784;
		double b= 10.35784;		
		
		System.out.println("Olá mundo!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", z);
		System.out.printf("%.4f%n", b);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxx");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", b);
		System.out.println("Resultado= " + b + " Metros");
		System.out.printf("Resultado= %.2f metros%n" , b);
		
		String nome= "Maria";
		int idade= 31;
		double renda = 400.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n ", nome, idade, renda);
		
		

	}

}
