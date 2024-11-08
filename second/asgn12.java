package Assgn.second;

class Distance {
    protected double distanceInMiles;

    public Distance(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    public void travelTime() {
        double speedInMilesPerHour = 60.0;
        double timeInHours = distanceInMiles / speedInMilesPerHour;
        System.out.println("Time taken to cover the distance at 60 miles per hour: " + timeInHours + " hours");
    }
}

class DistanceMKS extends Distance {
    public DistanceMKS(double distanceInKilometers) {
        super(distanceInKilometers);
    }

    @Override
    public void travelTime() {
        double speedInKmPerSecond = 100.0;
        double timeInSeconds = distanceInMiles / speedInKmPerSecond;
        System.out.println("Time taken to cover the distance at 100 km per second: " + timeInSeconds + " seconds");
    }
}

public class asgn12 {
    public static void main(String[] args) {
        Distance distance = new Distance(120); // Distance in miles
        DistanceMKS distanceMKS = new DistanceMKS(120); // Distance in kilometers

        System.out.println("Base class Distance:");
        distance.travelTime();

        System.out.println("\nDerived class DistanceMKS:");
        distanceMKS.travelTime();
    }
}

