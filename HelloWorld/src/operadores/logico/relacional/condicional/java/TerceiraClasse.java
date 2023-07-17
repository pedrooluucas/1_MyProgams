package operadores.logico.relacional.condicional.java;

public class TerceiraClasse {
	
	public static void main(String[] args) {
		
		/*SWITCH CASE: OPERAÇÕES EXATAS*/
		
		int dia = 2;
		
		switch (dia) {
		case 1: 
				System.out.println("Hoje é Domingo: Final de Semana Ebaaa!!");
			break;
		case 2: 
				System.out.println("Hoje é Segunda-Feira");
			break;
		case 3: 
				System.out.println("Hoje é Terca-Feira");
			break;
		case 4:
				System.out.println("Hoje é Quarta-Feira");
			break;
		case 5: 
				System.out.println("Hoje é Quinta-Feira");
			break;
		case 6: 
				System.out.println("Hoje é Sexta-Feira: Ebaaa!!!");
			break;
		case 7: 
				System.out.println("Hoje é Sabado: Final de Semana Ebaaa!!!");
			break;
		
		default:
				System.out.println("Dia Não Encontrado no Banco de Dados");
			break;
		}
		
	}	

}
