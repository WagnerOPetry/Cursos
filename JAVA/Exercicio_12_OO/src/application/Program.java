package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {
	
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String nome = in.nextLine();
		System.out.print("Email: ");
		String email = in.nextLine();
		System.out.print("Data de Aniversário: ");
		Date aniversario = sdf.parse(in.next());
		Cliente cliente = new Cliente(nome, email, aniversario);
		
	
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(in.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.println();
		System.out.print("Quantos itens terão no pedido? ");
		int n = in.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Dados #" + i + " pedido: ");
			System.out.print("Nome do produto: ");
			in.nextLine();
			String nomeProduto = in.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = in.nextDouble();
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			System.out.print("Quantidade: ");
			int quantidade = in.nextInt();
			ItemPedido itemPedido = new ItemPedido(quantidade, precoProduto, produto);
			
			pedido.addItem(itemPedido);
			
		}
				
		System.out.println();
		System.out.println("Resumo do Pedido:");
		System.out.println(pedido);
		
		in.close();
	}

}
