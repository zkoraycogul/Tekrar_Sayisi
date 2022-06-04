import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {1,2,2,2,2,2,3,4,4,5,6,7,8,8,9,10,10,11,11,12,12,12,12,12,12,12,14,14,14,14,2000,2000,2000,2002,2002,2002,2002};
        int [] evenNumbers = new int[numbers.length];
        int index=0;
        for(int i=0;i< numbers.length;i++) {
            int total = 0;
            for(int j=0;j<numbers.length;j++) {
                if(numbers[i]%2== 0 && numbers[i]==numbers[j]){total++;}
            }
            if(total>1) {
                evenNumbers[index++] = numbers[i];
            }
        }
        int x = 1;
        for (int value : evenNumbers) {
            if ((value != 0) && (value != x)) {
                System.out.print(value + " ");
                x = value;
            }
        }
    }
}
