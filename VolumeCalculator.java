import java.util.Scanner;
public class VolumeCalculator {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm * 0.621371;
        double volumeMiles= (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.printf("The volume of Earth in cubic kilometers is %.2f and in cubic miles is %.2f\n", volumeKm, volumeMiles);
    }
}