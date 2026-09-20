public class linearsearch {
    public static void main(String[] args) {
        int[] array = {5, 12, 7, 20, 9, 15};
        int target = 20;
        boolean found = false;

        for(int i =0; i<array.length; i++){

            if(array[i]==target){
                found = true;
           
            }
           
            

        }
        if (found) {
    System.out.println(target + " is found");
} else {
    System.out.println(target + " not found");
}
    }

}