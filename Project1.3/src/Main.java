import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choix=0;
        String chaine="";
	//Afficher un menu a l'utilisateur et demander de choisir l'un des choix
        while(choix !=5){
            Scanner myObj= new Scanner(System.in);
            System.out.println("1. Saisir une chaine");
            System.out.println("2. Afficher la chaine");
            System.out.println("3. Inverser la chaine");
            System.out.println("4. Nombre de mots dans la chaine");
            System.out.println("5. Quitter");
            System.out.println("Choisir l'une des operations suivantes:");
            choix= Integer.parseInt(myObj.nextLine());
            switch(choix){
                case 1:
                    chaine=Menu.saisir();
                    break;
                case 2:
                    Menu.afficher(chaine);
                    break;
                case 3:
                    chaine= Menu.inverser(chaine);
                    System.out.println("La chaine est inversee.");
                    break;
                case 4:
                    System.out.println("Nombre de mots dans chaine est : "+Menu.nmbMots(chaine));
                    break;
                case 5:
                    choix=5;
                    myObj.close();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choix);
            }
            System.out.println("-----------------------------");
        }
    }
}