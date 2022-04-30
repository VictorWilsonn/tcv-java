package principal;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciaProduto {
	Scanner sc = new Scanner(System.in);
	private ArrayList<Produto> prod = new ArrayList<>();
	int resp;
	String nome;
	double preco;
	String CodBarras;
	
	public void MenuProduto() {
int resp = 1;

		while(resp != 0 ){
			System.out.println("1 - Cadastrar Produto           ");
			System.out.println("2 - Alterar Produto             ");
			System.out.println("3 - Excluir Produto             ");
			System.out.println("0 - Sair                        ");
			System.out.print("Digite uma op��o:                 ");
			resp = sc.nextInt();
			
			switch(resp) {
			case 1: 
				CadastraProduto();
				break;
			case 2:
				AlterarProduto();
				break;
			case 3:
				ExcluirProduto();
				break;
			}
		}
		
	}
	
	
	public void CadastraProduto(){
		System.out.println("=--[ Cadastro Produto ]--=");
		System.out.println("Cadastrando Produto       ");
		System.out.println("Nome:                     ");
		nome = sc.nextLine();
		System.out.println("Preco:                    ");
		preco = sc.nextDouble();
		System.out.println("Código de Barras:         ");
		CodBarras = sc.nextLine();
		
		Produto pro = new Produto(nome, preco, CodBarras);
		prod.add(pro);
		
		System.out.println("=--[Produto Cadastrado com Sucesso]--=");
	}
	
	public void listar() {
		//Produto no coisinha
		for (Produto pro : prod) {
			//Retorna o endereço(posição do vetor) do Produto
			int pos = prod.indexOf(pro);
			System.out.println(pos+"- "+pro.getNome());
		}
	}

	public void AlterarProduto(){
		System.out.println("=--[ Alteração Produto ]--=");
        listar();
		System.out.println("Digite o Código do produto que deseja alterar:");
		int pos = 0;
		pos = sc.nextInt();
		sc.nextLine();
		
		if(pos < prod.size() && pos >= 0) {
		System.out.println("Produto:              ");
		System.out.println("Nome:"  + prod.get(pos).getNome());
		System.out.println("Preço:"  + prod.get(pos).getPreco());
		System.out.println("Codigo de Barras:"  + prod.get(pos).getCodigoDeBarras());
		System.out.println("Alterar Produto?  ");
		resp = sc.nextInt();
		if(resp == 1) {
			System.out.println("Digite Os novos Dados do Produto:      ");
			System.out.println("Nome:                                  ");
			prod.get(pos).setNome(sc.nextLine());
			System.out.println("Preco:                                 ");
			prod.get(pos).setPreco(sc.nextDouble());
			System.out.println("Código de Barras:                      ");
			prod.get(pos).setCodigoDeBarras(sc.nextLine());
			System.out.println("=--[ Alterado com Sucesso ]--=");
		}else
			System.out.println("Não Alterado");
	
		}else
			System.out.println("Produto Invalido");
		
	}
	
	public void ExcluirProduto(){
		System.out.println("=--[ Exclusão Produto ]--=");
		System.out.println("Digite a Posição do Produto que Deseja Excluir:");
		resp = sc.nextInt();
		if(prod.get(resp) != null) {
			prod.remove(resp);
			System.out.println("Produto Excluído");
		}else
			System.out.println("Produto inválido");
		
	}
	
	

}
