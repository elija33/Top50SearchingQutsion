package BinarySearch;

public class BinarySearch {
    public static int BSearch(int number[], int target){
        
    // creta a valu call starting and set it equal to start of the array 
        int starting = 0;

    // creta a valu call ending and set it equal to the end of the array 
        int ending = number.length - 1;

    // check if the starting array is less than the ending array
        while(starting <= ending){

    // find the milder of the arrray by adding the start, ending and dived it by 2 
            int mid = (starting + ending) / 2;

    // if the milder element is equal to the target, we return the mid element 
            if(number[mid] == target){
                return mid;
            }

    // else if the target is less than the milder number we start looking for the target element from the right side of the array
            else{
                if(target < number[mid]){
                    ending = mid + 1;
                    //[1,2,3,4,5,6,7,8,9] tsh = 9
                }
    // else we start looking for the element frmo the left side of the array.
                else{
                    starting = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        System.out.println(BSearch(number, target));
    }
}
