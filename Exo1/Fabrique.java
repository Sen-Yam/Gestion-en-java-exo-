package Exo1;

public class Fabrique {
    static Object CreeProduit (String Code) {
        Object P;
        if(Code.charAt(0)=='9') {
            P = new Livre();
        }
        else {
            if(Code.charAt(0)=='4') {
                P = new Ordinateur();
            }
            else {
                P=null;
            }
        }
        return P;
    }
}
