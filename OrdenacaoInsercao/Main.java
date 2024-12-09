import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int array[] = {0,3,2,4,1,6,5};

        int j;

        for(int i = 2;i < array.length;i++){
            int x = array[i];
            j = i - 1;
            array[0] = x;
            while(x < array[j]){
                array[i] = array[j]; 
            }
            array[j+1 ] = x;
        }
    }
}
