import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		int nota1 = 0, nota2=0, nota3=0, nota4=0;
		float media;
		String nome = null;
		
		Scanner i = new Scanner(System.in);
		System.out.println("Informe seu nome");
		i.next(nome);
		System.out.println("Informe a primeira nota");
		i.nextInt(nota1);
		System.out.println("Informe a segunda nota");
		i.nextInt(nota2);
		System.out.println("Informe a terceira nota");
		i.nextInt(nota3);
		System.out.println("Informe a quarta nota");
		i.nextInt(nota4);
		
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("Sua media é: "+media);
	}

}
