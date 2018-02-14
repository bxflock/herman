import java.util.Scanner;
public class Main {
    //a change added to the file
    public static void main(String args[]){

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = scnr.nextLine();
        hex = hex.toUpperCase();
        hex = hex.replace("0X", "");
        int hexLength = hex.length();

        char[] charArray = hex.toCharArray();

        double power = 0;
        double decimal = 0;
        long decimalConv = 0;

        while(hexLength > 0)
        {
            char character = charArray[hexLength - 1];
            if(character == 'A'){
                decimal = 10;
            }
            else if(character == 'B'){
                decimal = 11;
            }
            else if(character == 'C'){
                decimal = 12;
            }
            else if(character == 'D'){
                decimal = 13;
            }
            else if(character == 'E'){
                decimal = 14;
            }
            else if(character == 'F'){
                decimal = 15;
            }
            else{
                decimal = Character.getNumericValue(character);
            }

            decimalConv += decimal * Math.pow(16, power);
            hexLength--;
            power++;
        }
        System.out.println("Your number is " + decimalConv + " in decimal");
    }
}
