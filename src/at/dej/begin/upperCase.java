package at.dej.begin;

import java.util.Scanner;

public class upperCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        char[] arr = t.toCharArray();


        String upper = "";
        String lower = "";

        for(int i = 0; i< arr.length;i++){
            if(Character.isUpperCase(arr[i])){
                upper += arr[i];

            }
            else{

              lower += arr[1];
            }
        }
        System.out.println(upper);
        System.out.println(lower);
    }
}
