public class MarineLife {
    public static void main(String[] args) {
        int dolphins = 11;
        int octopuses = 8;
        int seaOtters = 4;
        int mantaRays = 2;

        dolphins += 2;
        mantaRays -=1;

        octopuses -= 4;
        
        System.out.println(dolphins > octopuses);

        System.out.println(mantaRays == seaOtters);

        System.out.println("Number of animals: " + (dolphins + octopuses + seaOtters +mantaRays));

        System.out.println(seaOtters < 4 && mantaRays < 4);
    }
}
