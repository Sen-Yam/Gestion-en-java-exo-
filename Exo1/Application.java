package Exo1;
import java.util.Scanner;
public class Application {
    

    public static void main(String arg[]) {
        Produit P;
        Scanner e= new Scanner(System.in);
        System.out.println("Donnez un code ");
        String S=e.next();
        P=Fabrique.CreeProduit(S);
        if(P instanceof Ordinateur) {
           
            
        P.AfficherModeEmploi();
        }
        else {
            if( Fabrique.CreeProduit(S) instanceof Livre) {
               
                P.AfficherModeEmploi();
            }
            else {
                System.out.println("NULL");
            }
        }
    }

    

  
}
/* Les concepts de POO utilisees sont :  
les interfaces , le overriding
*/