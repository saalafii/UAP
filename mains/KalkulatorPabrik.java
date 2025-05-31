package uap.mains;
import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("salman al farisy");
        System.out.println("245150707111021");
        System.out.println("===============================================");

        System.out.println("Donat dengan lubang");
         System.out.println("===============================================");
        System.out.print("Isikan Radius   : ");
        double R = sc.nextDouble(); 
        System.out.print("Isikan radius   : ");
        double r = sc.nextDouble(); 

        Torus torus = new Torus(R, r);
        System.out.println("===============================================");
        torus.printInfo();

    
        System.out.println("Donat tanpa lubang");
         System.out.println("===============================================");
        System.out.print("Isikan radius   : ");
        double r2 = sc.nextDouble(); 

        Sphere sphere = new Sphere(r2);
        System.out.println("===============================================");
        sphere.printInfo();
    }
}
