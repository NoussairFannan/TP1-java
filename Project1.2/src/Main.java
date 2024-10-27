import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[][] proTerm= {{"je", "e"},{"tu","es"},{"il/elle","e"},{"nous","ons"},{"vous","ez"},{"ils","ent"}};
        Scanner myObj  = new Scanner(System.in);
        System.out.println("donner un verbe du premier groupe");
        String verbe =myObj.nextLine();
        if(verbe.endsWith("er")){
            for(String[] s:proTerm){
                System.out.println(s[0]+" "+verbe.substring(0,verbe.length()-2)+s[1]);
            }
        }
        myObj.close();
    }
}