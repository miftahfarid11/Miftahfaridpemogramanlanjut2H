package Array;

public class Arrays {
    private static double[] myArray;
    public static void main(String[] args){
        double sum = 0.0;
        for (int x = 0; x < 4; x++) {
            sum += myArray[x];
        }
        System.out.println(sum);
    }
}

