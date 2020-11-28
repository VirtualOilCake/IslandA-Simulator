import java.util.*;
import IASimulator.*;

public class main {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        String inputString = input.next();/*用户输入*/
        
        IASimulator ias = new IASimulator(inputString);
        ArrayList output = ias.getResponse();
        
        for (int i = 0; i < ias.getTimes(); i++) {
            System.out.println("---------------------");
            System.out.println(output.get((int) (Math.random() * output.size())));
        }
    }
}
