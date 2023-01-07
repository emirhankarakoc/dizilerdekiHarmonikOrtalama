import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    double sayilar[] = new double[5];
    double sum=0;
    double ortalama = 0;
    double n = sayilar.length;
    for(double i=0;i<sayilar.length;i++){

        sayilar[(int) i]= scanner.nextDouble();

        sum += (1/(i+1));

    }
    ortalama = n/sum;
        System.out.println(ortalama);



    }
}