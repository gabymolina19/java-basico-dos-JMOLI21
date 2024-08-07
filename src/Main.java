//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int suma =0;
        int y = 1; //la utilizo para el while


       /* for (int x =1; x <= 10; x++) {
            //suma+=suma+x;
            suma += x;
        }*/

       while(y <= 10){
            suma += y;
            y++;
        }

        System.out.println("La sumatoria de los números del 1 al 10 es:"+suma);
    }
}