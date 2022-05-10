
public class Impressao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Bismark J Silva", endereco = "Rua Deus me Chama, 1000", estado = "SP", email="giva@gama.com.br" ;
		int idade = 35;
		
		System.out.println("Nome: "+nome+" "+"Idade: "+ idade+ "Endereçoi: "+ endereco+ "-"+ "Email: "+ email);
		System.out.printf("Nome: %s Idade: %d Endereço: %s Estado %s Email %s , ", nome, idade, endereco, estado, email);
	}

}
