import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		System.out.println(" Bonjour,quel est votre prénom ?");
		Scanner scanner = new Scanner(System.in);
		String unNom = scanner.nextLine();
		System.out.println("Bonjour " + unNom);
		somme();
		division();
		volume();
	}
		
	public static void somme() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir le premier entier");
		int premierEntier = scanner.nextInt();
		System.out.println("Veuillez saisir le deuxieme entier");
		int deuxiemeEntier = scanner.nextInt();
		int somme = premierEntier + deuxiemeEntier;
		System.out.println("La somme de "+ premierEntier+ " avec "+ deuxiemeEntier+ " est egal a "+ somme);

	}
	
	public static void division()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir le premier entier");
		float premierEntier = scanner.nextFloat();
		System.out.println("Veuillez saisir le deuxieme entier");
		float deuxiemeEntier = scanner.nextFloat();
		float somme = premierEntier / deuxiemeEntier;
		System.out.println("La somme de "+ premierEntier+ " avec "+ deuxiemeEntier+ " est egal a "+ somme);

		
	}
	
	public static void volume()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir la hauteur du pavé");
		float hauteur = scanner.nextFloat();
		System.out.println("Veuillez saisir la largeur du pavé");
		float largeur = scanner.nextFloat();
		System.out.println("Veuillez saisir la longueur du pavé");
		float longueur = scanner.nextFloat();
		float somme = hauteur * largeur*longueur;
		System.out.println("Le volume du pavé est "+ somme);

		
	}
	
}
