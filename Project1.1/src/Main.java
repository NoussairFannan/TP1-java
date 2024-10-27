import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	//Recuperer le nombre des notes
        Scanner myObj  = new Scanner(System.in);
        System.out.println("donner nombre des notes voulez vous saisir");
        int max = Integer.parseInt(myObj.nextLine());
	//Recuperer les notes
        int[] tabNote=new int[max];
        for(int i=0;i<max;i++){
            System.out.println("donner note");
            tabNote[i]=Integer.parseInt(myObj.nextLine());
        }
        Arrays.sort(tabNote);
	//Afficher les notes trier
        for(int i=0;i<max;i++){
            System.out.println("note "+(i+1)+": "+tabNote[i]);
        }
	//Calculer la moyenne
        int moyenne=0;
        for(int s : tabNote){
            moyenne+=s;
        }
        moyenne=moyenne/max;
        System.out.println("note moyenne : "+moyenne);
        System.out.println("note maximale est : "+tabNote[max-1]);
        System.out.println("note minimale est : "+tabNote[0]);
	//Demander de l'utilisateur la note rechercher
        System.out.println("donner la note que vous rechercher");
        int noteRe=Integer.parseInt(myObj.nextLine());
	//Rechercher la note saisie par l'utilisateur
        int noteRech=0;
        for(int s : tabNote){
            if(s==noteRe){
                noteRech++;
            }
        }
        System.out.println("voici le nombre d'etudiant avec cette note : "+noteRech);

    }
}