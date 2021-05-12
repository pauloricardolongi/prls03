package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

public class Aplicativo01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new  Scanner ( System.in);
		List < Funcionario > lista =  new  ArrayList <> ();
		
		// PARTE 1 - LEITURA DE DADOS:
		
		System.out.println ( " Quantos funcionários serão cadastrados? " );
		int N = sc.nextInt();
		
		for ( int i = 0 ; i < N; i ++ ) {
			
			System.out.println();
			System.out.println("Funcionário #"  + (i +1) + ":");
			System.out.print("Id: ");
			Integer id= sc.nextInt();
			while(hasId(lista, id)) {
				System.out.println("Este Id já existe! tente novamente");
				id = sc.nextInt();
			}
			
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome= sc.nextLine();
			System.out.print("Salario: ");
			Double salario= sc.nextDouble();
			
			Funcionario f = new Funcionario
					(id, nome, salario);
			lista.add(f);
		}
		System.out.println();
System.out.print("Entre com o id do funcionário	que vai tero o salário aumentado ");
		int idsalario = sc.nextInt();
		
		Funcionario f= lista.stream().filter(x -> x.getId() == idsalario).findFirst().orElse(null);
		
		//Integer pos = posicao (lista, idsalario);
		if(f == null) {
			System.out.println("Este id não existe!");
			
		}
		else {
			System.out.print("Entre com a porcentagem:");
			double porcento = sc.nextDouble();
			f.aumentarSalario(porcento);
		}
		System.out.println();
		System.out.println("Lista de funcionários");
		for(Funcionario e : lista) {
			System.out.println(e);
		}
			
		sc.close();

	}
	//procurar  a posição do elemento funcionário na lista
	public  static Integer posicao (List<Funcionario> lista, int id) {
		for (int i=0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				return i;
			}			
			
		}
		return null;
	}
	public static boolean hasId(List<Funcionario>lista, int id) {
		Funcionario f= lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return f != null;
	

	}

}
