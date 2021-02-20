package pack1_inicio;

public class MainEx09Strings 
{

	public static void main(String[] args) 
	{
		/*
		 * Observa��o: Strings em Java s�o suportados internamente por array de char. 
		 * Da mesma forma que arrays sao imutaveis, Strings tamb�m s�o. 
		 * Portanto, sempre que uma String � alterada, uma nova String � criada.
		 * Os m�todos que produzem altera��o na string devem ter uma atribui��o.
		 */
		String str1 = "Bruna";
		System.out.println(str1.getBytes());
		str1 = "Bruno";
		System.out.println(str1.getBytes());
		
		System.out.println(str1.length());
		
		System.out.println(str1.charAt(0));
		
		System.out.println(str1.indexOf("r", 0) ); // primeira ocorrencia, a partir de i (-->)
		
		System.out.println(str1.lastIndexOf("o", str1.length() ) ); // ultima ocorrencia, a partir de j (<--)
		
		System.out.println(str1.substring(1, 4)); // i , j-1 index
		
		System.out.println( str1.compareTo("Ana") );
		System.out.println( str1.compareTo("Bruno") );
		System.out.println( str1.compareTo("Carlos") );
		
		System.out.println( str1.equals("Ana") );
		
		System.out.println( str1.toLowerCase() );
		
		System.out.println( str1.toUpperCase() );
		
		str1 = " B r u n o ";
		str1 = str1.trim();				// nao remove no meio
		System.out.println( str1 );  
		
		System.out.println( str1.replace(" ", "") );
		
		str1 = str1.concat(" Monteiro");
		System.out.println( str1 );

		String[] parts = str1.split(" ");
		for (int i = 0; i < parts.length; i++) {
			System.out.print("["+parts[i]+"] ");
		}
		System.out.println("\n");
		
		/*
		 * StringBuffer � uma semelhante a String, por�m � mut�vel.
		 * � indicado para cen�rios com muitas altera��es, devido ganho de efici�ncia.
		 * Os m�todos que produzem altera��o na string n�o precisam de atribui��o.
		 */
		StringBuffer sb1 = new StringBuffer("Bruno");
		System.out.println(sb1.hashCode());
		System.out.println(sb1.length());
		
		sb1.append(" Monteiro");
		System.out.println(sb1.hashCode());
		System.out.println(sb1.length());

		System.out.println(sb1.insert(5, " de Sousa"));
		
		System.out.println( sb1.delete(5, 7) );
				
		System.out.println(sb1.reverse());
				
		System.out.println( sb1.delete(0, sb1.length()) ); // deleta tudo
		System.out.println( sb1.append("Bruno") );
		
		System.out.println( sb1.replace(2, 3, "e") ); // nao confundir com o replace de String

		
	}

}
