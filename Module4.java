public class Module4 {
    public static short average(short[] array) {
        if (array.length == 0) {
            return 0;
        }
        
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        
        return (short)(sum / array.length);
    }
    
    public static int average(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        
        return sum / array.length;
    }
    
    public static long average(long[] array) {
        if (array.length == 0) {
            return 0;
        }
        
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        
        return sum / array.length;
    }
    
    public static double average(double[] array) {
        if (array.length == 0) {
            return 0.0;
        }
        
        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        
        return sum / array.length;
    }
    
    public static void main(String[] args) {
        short[] shortArray = {2, 4, 6, 8};
        int[] intArray = {10, 20, 30, 40, 50};
        long[] longArray = {101L, 202L, 303L, 404L, 505L, 606L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        System.out.println("Short Array: " + java.util.Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));
        
        System.out.println("\nInt Array: " + java.util.Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));
        
        System.out.println("\nLong Array: " + java.util.Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));
        
        System.out.println("\nDouble Array: " + java.util.Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
    }
}
