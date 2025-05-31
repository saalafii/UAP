package uap.models;
import uap.bases.Shape;
import uap.interfaces.*;

public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    public double gramToKilogram() {
        double massKg = getMass() / DENOMINATOR;
        return Math.ceil(massKg); 
    }

    @Override
    public double calculateCost() {
        return gramToKilogram() * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
        System.out.printf("Volume           : %.2f\n", getVolume());
        System.out.printf("Luas permukaan   : %.2f\n", getSurfaceArea());
        System.out.printf("Massa            : %.2f\n", getMass());
        System.out.printf("Massa dalam kg   : %.0f\n", gramToKilogram());
        System.out.printf("Biaya kirim      : Rp%.0f\n", calculateCost());
         System.out.println("===============================================");
    }
}
