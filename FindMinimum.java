public class FindMinimum {
    public static void main(String[] args) {
        int[] array = {18, 7, 25, 3, 12, -4, 9};
        int min = array[0];

        for(int i =0; i<array.length;i++){

            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println(min);
    }
    
}
