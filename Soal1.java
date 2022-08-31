package TugasPraktikum2;
import java.util.Scanner;

public class Soal1 {
	
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
        long bil;
        System.out.print("Inputkan Bilangan = ");
        bil=input.nextLong();
        
        if (bil<127 && bil>-128){
            System.out.println(" "+bil+" adalah byte");
        } if(bil<= Short.MAX_VALUE && bil>= Short.MIN_VALUE){
             System.out.println(" "+bil+" adalah short"); 
        } if(bil<= Integer.MAX_VALUE && bil>= Integer.MIN_VALUE){
             System.out.println(" "+bil+" adalah integer");
        }if(bil<= Long.MAX_VALUE && bil>= Long.MIN_VALUE){
             System.out.println(" "+bil+" adalah long");
        }else{
             System.out.println(" error");
        }
	}
}
