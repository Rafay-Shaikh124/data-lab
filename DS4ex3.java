/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dtask9;
import java.util.Arrays;

/**
 *
 * @author ESHOP
 */
public class DS4ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={11,22,33,44,55};
        int number=33;
        
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int middle;
        boolean found=false;
        while(left<=right){
            middle=left+(right-left)/2;
            if(arr[middle]==number){
                System.out.println("Element "+ number+" found at index "+middle);
                found=true;
                break;
            }
            if(arr[middle]<number){
                left=middle+1;
            }else{
                right=middle-1;
            }
        }
           if(found==false){
                System.out.println("Element "+ number+" not found at index ");
            }
            
    }
    }

    