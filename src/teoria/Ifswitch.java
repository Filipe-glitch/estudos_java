package teoria;

import java.util.Scanner;

public class Ifswitch {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        if (idade < 18) {
			System.out.print("Acesso negado, você é menor");
			}
		else if(idade > 60) {
			System.out.println("você é idoso");
			}
		else {
			System.out.println("sem opção");
	        }
       // if(idade > 5 && idade < 15) usamos &&(and), ||(or) e !(not). Operadores(>,<, == etc).
       System.out.println("Digite um número de 1 a 3, sendo segunda = 1 ...");
       int dia = teclado.nextInt();
       switch(dia) {
         case 1 -> System.out.println("Segunda");
         /* forma antiga
          case 1:
			  System.out.println("Segunda");
			  break; 
          */
	      case 2 -> System.out.println("Terça");
	      case 3 -> System.out.println("Quarta");
	      default -> System.out.println("Dia inválido"); //usado quando nenhum case corresponde ao valor testado.
	      //usamos SWITCH para comparar um valor especifico com várias opçõs fixas(menu, dias da semana,etc)
       }
       teclado.close(); //é boa prática fechar o Scanner.
	}

}
