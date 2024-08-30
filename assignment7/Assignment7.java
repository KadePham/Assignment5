package assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment7 {
    public static float[] importData (float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("element " + i + ": ");
            arrays[i] = scanner.nextFloat();
        }
        
        return arrays;
    }
    
    public static void printData (float[] arrays) {
        System.out.println("Your arrays: ");
        System.out.print(Arrays.toString(arrays));
    }
    
    public static float findMax2 (float[] arrays) {
        Arrays.sort(arrays);
        float max = arrays[arrays.length - 1];
        float max2 = arrays[0];
        
        for (int i = 0; i < arrays.length; i++) {
            if (max2 < arrays[i] && arrays[i] < max) {
                max2 = arrays[i];
            }
        }
        
        return max2;
    }
    
    public static void deleteOddNumber (float[] arrays) {
        int n = arrays.length;
        for (int i = 0; i < n;) {
            if (arrays[i] % 2 >= 1 || arrays[i] % 2 <= -1) {
                arrays[i] = arrays[n - 1];
                i = 0;
                n--;
            }
            else i++;
        }
        
        System.out.println("Arrays of even: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arrays[i] + ", ");
        }
    }
    
    public static void main(String[] args) {
        float[] floatArr = new float[5];
        importData(floatArr);
        printData(floatArr);
        System.out.print("\nThe second max number of array: ");
        System.out.println(findMax2(floatArr));
        deleteOddNumber(floatArr);
    }
}
