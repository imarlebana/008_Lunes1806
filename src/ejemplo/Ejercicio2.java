package ejemplo;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String st = sc.nextLine();
        int num =0;

        char[] c = st.toLowerCase().toCharArray();

        for(char ch : c){

           switch (ch) {
               case 'a':
               case 'e':
               case 'i':
               case 'o':
                   num++;

                   break;
           }
        }
    }
}
