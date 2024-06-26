import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    String nome = " Willyan";

    public static void main(String[] args) {

        // best way to do an array

        int[] idade = new int[20]; // Primeira parte, -- tipo e nome da array -- segunda parte -- quantidade de coisas
        //dentro da array

        String[] nomes = new String[10];

        nomes[0] = "Willyan";
        nomes[1] = "Willyan";
        nomes[2] = "Willyan";
        nomes[3] = "Willyan";
        nomes[4] = "Willyan";
        nomes[5] = "Willyan";
        nomes[6] = "Willyan";


        ArrayList<Integer> idades = new ArrayList<Integer>();
        idades.add(20);
        idades.add(40);

        // Segundo tipo de lista
        int NUMEROS = 10;
        for (var i = 0; i < NUMEROS; i++) {

            System.out.println(NUMEROS);


            while (i < NUMEROS) {
                System.out.println("Teste");
                i++;
            }
        }




    }
}
