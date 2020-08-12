import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sx.nextInt() ;
    if (number>=0&&number<=14){
        System.out.println("[0;14]");}

        if (number>=15&&number<=35){
        System.out.println("[15;35]");
    }
          if (number>=36&&number<=50){
            System.out.println("[36;50]");
    }
              if (number>=51&&number<=100){
                System.out.println("[51;100]");
    }
              else {
                  System.out.println("Введите другое значение");
              }
    }

}
