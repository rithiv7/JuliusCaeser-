import java.util.Scanner;

public class JuliusCaesar{
    public static void main (String [] args){
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
        System.out.println("|||||||||||||||||||||||");
        System.out.println("-----------------------");
        System.out.println("OPERATION JULIUS CAESAR");
        System.out.println("-----------------------");
        System.out.println("|||||||||||||||||||||||");
        
        System.out.println();
        
        System.out.print("Enter a message: ");
        String input = scan1.nextLine();
        
        
        System.out.print("Enter a shift value: ");
        int shift = scan2.nextInt();
        
        System.out.println();
        
        String rerun = "y";
        while (rerun.equals("y")){
            for (int x = 0; x < input.length(); x += 1){
                
                char z = input.charAt(x);
                
                if (z != (' ')){
                    int ogAscii = (int) z; //getting ascii value
                    
                    if ((ogAscii + shift) >= 33 && (ogAscii + shift) <= 126){
                        int newAscii = ogAscii + shift;
                        z = (char) newAscii;
                        //System.out.println("in if");
                        System.out.print(z);
                    }
                    else if ((ogAscii + shift) < 33){
                        int newAscii = (ogAscii + shift);
                        while ( newAscii < 33) {
                            newAscii = newAscii + 94;
                            z = (char) newAscii;
                            //System.out.print(newAscii);
                        }
                        //System.out.println("in el if 1");
                        System.out.print(z);
                    }
                    else if ((ogAscii + shift) > 126){
                        int newAscii = (ogAscii + shift);
                        while ( newAscii > 126) {
                            newAscii = newAscii - 94;
                            z = (char) newAscii;
                            //System.out.print(newAscii);
                        }
                        //System.out.println("in el if 2");
                        System.out.print(z);
                    }
                    
                    
                }
                else{
                    //System.out.println("in else");
                    System.out.print(" ");
                }
            }
            System.out.print(" <-- encrypted message ");
            System.out.println(" ");
            System.out.println();
            System.out.print("Enter a new message that you want to decipher ('n' to quit): ");
            input = scan1.nextLine();
            if (input.equals("n")){
                System.out.println();
                System.out.println("Operation Julius Caesar Complete...");
                rerun = "n";
            }
            else {
                System.out.print("Enter a new shift value: ");
                shift = scan2.nextInt();
            }
        }
        
        
    }
}
