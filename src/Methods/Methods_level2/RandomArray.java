package Methods.Methods_level2;

public class RandomArray {
    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
        double[] result = findAverageMinMax(arr);
        System.out.println("Average = " + result[0]);
        System.out.println("Min = " + result[1]);
        System.out.println("Max = " + result[2]);
    }
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }
    public static double[] findAverageMinMax(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;
        for (int x : arr) {
            sum += x;
            if (x < min) min = x;
            if (x > max) max = x;
        }
        double avg = (double) sum / arr.length;
        return new double[]{avg, min, max};
    }
}

