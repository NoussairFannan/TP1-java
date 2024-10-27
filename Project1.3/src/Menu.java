import java.util.Scanner;

public class Menu {
    public static String saisir(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Donner une chaine quelconque");
        return myObj.nextLine();
    }
    public static void afficher(String chaine){
        if (chaine.isEmpty()) {
            System.out.println("Aucune chaîne n'a ete saisie.");
        } else {
            System.out.println("Votre chaine est : "+chaine);
        }
    }
    public static String inverser(String chaine){
        StringBuilder chaine2=new StringBuilder(chaine);
        return String.valueOf(chaine2.reverse());
    }
    public static int nmbMots(String chaine){
        String[] array=chaine.split(" ");
        return array.length;
    }
}
