import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nbOccur=0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Donner la chaine.");
	//Preparer la chaine de caracteres donne par l'utilisateur
        String[] chaine= myObj.nextLine().replace(" ","").toUpperCase().split("");
        Arrays.sort(chaine);
        myObj.close();
	//Affichage
        for (int i = 0; i < chaine.length-1; i++) {
            if(!chaine[i].equals(chaine[i+1])){
                System.out.println(nbOccur+"fois la lettre '"+chaine[i]+"'");
                nbOccur=0;
            }
            nbOccur++;
        }
	//Affichage de la derniere lettre
        System.out.println(nbOccur + " fois la lettre '" + chaine[chaine.length - 1] + "'");
    }
}