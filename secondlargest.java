public class secondlargest {
    public static void main(String[] args) {

        int[] array ={12,5,8,21,7,14};
      
            int max= 0;
            int secondmax= 0;
            for(int i=0; i<array.length; i++){
                if(array[i]>max){
                    secondmax = max;
                    max = array[i];
}
                else if (array[i]>secondmax){
                    secondmax = array[i];
            }
            

}
System.out.println("Second maximum element is: " + secondmax);
    }
}
