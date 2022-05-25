package Exo2;
import java.util.Scanner;
public class App {
    public static void main(String arg[]) {
        Scanner e= new Scanner(System.in);
        System.out.println("Donnez le numero correspondant : 1=Ouvrier   2=Technicien");
    int S=e.nextInt();
    System.out.println("Donnez le nombre des heures :");
    int M=e.nextInt();
    System.out.println("Le calcul est :");
    if(S==1) {
        TechnicienRisque T = new TechnicienRisque();
        System.out.println(T.Calcul(M));
    }
    else {
        OuvrierRisque O= new OuvrierRisque();
        System.out.println(O.Calcul(M));
    }

    }
}
