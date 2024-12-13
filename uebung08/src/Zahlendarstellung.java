public class Zahlendarstellung {

    public static void main(String[] args) {
        // Test cases
        int[] result1 = ermittleZiffern(4711, 10);
        int[] result2 = ermittleZiffern(4711, 16);
        int[] result3 = ermittleZiffern(4711, 2);
        int[] result4 = ermittleZiffern(1234, 16);

        // Display results
        printArray(result1); // Expected: {1, 1, 7, 4}
        printArray(result2); // Expected: {7, 6, 7, 12}
        printArray(result3); // Expected: {1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1}
        printArray(result4); // Expected: {2, 13, 4}
    }

    public static int[] ermittleZiffern(int x, int b) {
        // Handle the special case where x == 0
        if (x == 0) {
            return new int[]{0};
        }

        // Determine the number of digits needed
        int temp = x;
        int count = 0;
        while (temp > 0) {
            temp /= b;
            count++;
        }

        // Create the result array
        int[] result = new int[count];
        int index = 0;

        // Extract digits using modulo and integer division
        while (x > 0) {
            result[index++] = x % b;
            x /= b;
        }

        return result; // Result contains digits in reverse order
    }

    public static void printArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) { // Print in normal order
            System.out.print(array[i] + (i > 0 ? ", " : ""));
        }
        System.out.println();
    }
}
