public class Main {
    public static void main(String[] args) {
        int[] array = {20,65,0,35,17,92,5,44};
        int n = array.length;

        int h = 1;
        do h = h * 3 + 1;
        while(h < n);

        do{
            h /= 3;
            for(int i = h + 1; i <= n;i++){
                int x = array[i];
                int j = i;

                while (array[j-h] > x){
                    array[j] = array[j-h];
                    j -= h;
                    if(j <= h) break;
                }
                array[j] = x;
            }
        }while (h != 1);

        System.out.println(h);
    }
}