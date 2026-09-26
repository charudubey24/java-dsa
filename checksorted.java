public class checksorted {
    public static void main(String[] args) {
      int[] array = {2, 5, 12, 8, 15, 20};
      boolean sorted = true;

      for (int i = 0; i < array.length-1; i++) {

        if(array[i]>array[i+1]){
           sorted  = false;
         }
          }
    if(sorted==true){
        System.out.println("array is sorted");
  }
  else{
    System.out.println("array is not sorted");
  }
      
      
    }
}
