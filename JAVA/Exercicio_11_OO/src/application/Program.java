package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {
	
	/* Fazer um programa para mostrar 2 posts de redes sociais, por exemplo intagram,
	 * com o post, data/hora da publicação, comentários e números de likes
	 */

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				
		Comment c1 = new Comment("Tenha uma boa viajem!");
		Comment c2 = new Comment("Nossa! Que demais!");
		Post p1 = new Post(
				sdf.parse("21/06/2021 13:05:44"), 
				"Viajando para Noza Zelândia!", 
				"Indo visitar esse maravilhoso país!", 
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		Comment c3 = new Comment("Boa noite!");
		Comment c4 = new Comment("Que a força estaja com você!");
		Post p2 = new Post(
				sdf.parse("28/07/2021 23:14:19"),
				"Boa noite Galera",
				"Vejo vocês amanhã!",
				5);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p2);
		
				
		
		
		
		

	}

}
