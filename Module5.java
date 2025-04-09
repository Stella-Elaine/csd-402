import java.util.Arrays;

public class Module5 {
    public static int[] locateLargest(int[][] arrayOfArrays) {
        if (arrayOfArrays.length == 0) {
            return new int[0];
        }

        int[] listLargests = new int[arrayOfArrays.length];

        for (int i = 0; i < arrayOfArrays.length; ++i) {
            int[] subList = arrayOfArrays[i];

            int currentMax = Integer.MIN_VALUE;
            for (int item : subList) {
                if (item > currentMax) {
                    currentMax = item;
                }
            }

            listLargests[i] = currentMax;
        }

        return listLargests;
    }

    public static int[] locateLargestElement(int[][] arrayParam) {
        int[] location = new int[2];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double max = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double min = Double.POSITIVE_INFINITY;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {
        int[][] data = {
                { 10, 20, 30 },
                { 40, 50, 60},
                { 70, 80, 90, 100},
                { 700, 800, 900, 1000},
        };


        int[] largests = locateLargest(data);

        System.out.println("The largest elements are: ");
        System.out.println(Arrays.toString(largests));


        int[] largestLoc = locateLargestElement(data);
        int[] smallestLoc = locateSmallest(data);
        System.out.println("Location of largest: " + Arrays.toString(largestLoc));
        System.out.println("Location of smallest: " + Arrays.toString(smallestLoc));
    }
};
