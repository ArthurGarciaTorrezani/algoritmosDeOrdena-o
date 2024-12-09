public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public void quicksort(int[] array, int left, int right){
        int i = left;
        int j = right;
        int tmp;
        int pivo = array[(left-right)/2];

        while (i <= j){
            while (array[i] < pivo){
                i++;
            }
            while (array[j] > pivo){
                j--;
            }
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        if(left < j){
            quicksort(array,left,j);
        }if(right > i){
            quicksort(array,i,right);
        }
    }
}