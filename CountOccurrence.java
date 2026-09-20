public class CountOccurrence {
   public static void main(String[] args) {
       int[] array = {10, 20, 10, 30, 20, 10, 40};
       int count = 0;

       for(int i =0; i<array.length; i++){
         
        if(array[i]==10){
            count++;
            
        }


       }
       System.out.println(count);
       
   } 
}
