package operadores.logico.relacional.condicional.java;

public class QuartaClasse {
	
	public static void main(String[] args) {
		
		int numero = 0;
		
		while(numero <= 10) { /*While Verifica e depois Exeecuta*/
			
			System.out.println("O Numero atual é =" + numero);
			numero++;
		}
			
		/*-----------------------*/
		
		int numero2 = 0;
		
		do { /*Executa e depois Verifica*/
			
			System.out.println("O Numero atual é =" + numero2);
			numero2++;
			
		} while(numero2 <= 10);
		
	}

}
