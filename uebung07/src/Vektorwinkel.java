 public class Vektorwinkel {

    public static void main(String[] args) {
        // Example vectors
        double[] a = {1, 0};
        double[] b = {1, 1};

        System.out.println("Winkel zwischen a und b: " + winkel(a, b) + " Grad");
    }

    public static double winkel(double[] a, double[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Die Vektoren müssen die gleiche Länge haben!");
        }

        double dotProduct = skalarprodukt(a, b);
        double normA = norm(a);
        double normB = norm(b);

        // Calculate cosine of the angle
        double cosTheta = dotProduct / (normA * normB);

        // Ensure cosTheta is in the range [-1, 1] to avoid Math.acos errors
        cosTheta = Math.max(-1.0, Math.min(1.0, cosTheta));

        // Calculate the angle in radians and convert to degrees
        double thetaRad = Math.acos(cosTheta);
        return thetaRad * 180 / Math.PI;
    }

    // Method to compute the dot product
    public static double skalarprodukt(double[] a, double[] b) {
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }
        return result;
    }

    // Method to compute the norm of a vector
    public static double norm(double[] v) {
        double sum = 0;
        for (double val : v) {
            sum += val * val;
        }
        return Math.sqrt(sum);
    }
}
