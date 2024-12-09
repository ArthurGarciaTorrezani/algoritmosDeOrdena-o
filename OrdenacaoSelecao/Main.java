public class Main {
    public static void main(String[] args) {
        int[] array = {3,2,4,1,6,5};

        for(int i = 0;i < array.length;i++){
            int min = i;

            for(int k = i+1;k < array.length;k++){
                if(array[k] < array[min]){
                    min = k;
                }
            }

            int x = array[min];
            array[min] = array[i];
            array[i] = x;
        }
        for (int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
