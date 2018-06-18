import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Cadenas {

    public static void main(String[] args) {



        String[] array = new String[4];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<4; i++){
            System.out.println("Introduce una cadena");
            String st = sc.nextLine();
            array[i] = st;
        }

        int max = 0;
        int position = 0;
        for(int i=0; i<array.length;i++){

            if (array[i].length() > max){
                max =array[i].length();
                position = i;
            }

        }

        System.out.println("la cadena mayor esta en la posicion " + position + " del array y tiene " + max + " caracteres.");




    }
}
