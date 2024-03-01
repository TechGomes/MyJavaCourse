package aulas_praticas.metodosString;

public class ExemplosClasseString {
	public static void main(String[] args) {
		
		//The String class is immutable, so when printing toUpperCase, a new string is created, leaving the original string intact
		String name = "Diow";
		System.out.println(name.toUpperCase());
		System.out.println(name);
		//To change the created String it is necessary to reassign its value
		name = name.toUpperCase();		
		System.out.println();
		
		//____________________________________________________________________
		//For comparison, at first glance it seems common to do this:
		String n1 = "Diow";
		String n2 = "Diow";
		System.out.println("n1 == n2? = "+ (n1 == n2));//Here the result is true
		//But it is not the correct way to compare String, as this can happen:
		String n3 = new String("Diow");
		System.out.println("n1 == n3? = "+ (n1 == n3));//Here the result is false
		
		//A forma correta de comparar String é usar o metodo 'equals'
		System.out.println("n1.equals(n2)? = "+ (n1.equals(n2)));//Here the result is true
		System.out.println("n1.equals(n3)? = "+ (n1.equals(n3)));//Here the result is true
		System.out.println();
		
		//____________________________________________________________________
		//This next method chooses the characters that will be printed
		System.out.println(n1.charAt(0));
		System.out.println(n1.charAt(1));
		System.out.println(n1.charAt(2));
		System.out.println(n1.charAt(3));
		System.out.println(n1.substring(1));
		System.out.println(n1.substring(1, 4));
		System.out.println();
		
		//____________________________________________________________________
		//The Trim method deletes spaces at the beginning and end of the String
		n1 = "  Diogo Gabriel  ";
		System.out.println(String.format(">%s<", n1));
		System.out.println(String.format(">%s<", n1.trim()));
		System.out.println();
		
		//____________________________________________________________________
		//Para vetorizar palavras unidas em uma so string podemos usar o metodo split para excluir espaços, virgulas, etc
		n1 = "Diogo, Gabriel, Farias, Gomes";
		String[] n1Array = n1.split(", ");
		for(int i=0; i < n1Array.length; i++) {
			System.out.println(String.format("[%s] = %s", i, n1Array[i]));
		}
		System.out.println();
		
		//____________________________________________________________________
		//Substituir karacteres
		n1 = "Software analysis";
		System.out.println(n1.replaceAll("analysis", "Enginer"));
	}
}
