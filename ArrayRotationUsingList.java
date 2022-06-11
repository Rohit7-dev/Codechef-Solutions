import java.util.*;

public class ArrayRotationUsingList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        Integer[] arr = {1,2,3,4,5}; //Initialising Array.
        Integer[] temp = new Integer[m]; // Creating temporary array.
        System.arraycopy(arr,0,temp,0,m); // Copying array elements into temporary arrays.
        List<Integer> li = new ArrayList<>(Arrays.asList(arr).subList(m, arr.length)); // Shorthand method to copy array into ArrayList {subList is used to chop array from the desired length}.
        Collections.addAll(li,temp); // adding temp array at the end of list
        System.out.println(li); // Displaying list
        // If you want to convert list back into array we can do that by...
        //li.toArray(arr);
        //System.out.println(Arrays.toString(arr)); // Display converted array.
    }
}

