package BinarySearch;

public class RecursiveBinarySearch {
    public static int RecursiveBS(int number[], int target){
        int starting = 0;
        int ending = number.length - 1;

        if(starting > ending){
            int mid = (starting + ending) / 2;
            if(number[mid] == target){
                return mid;
            }
            else{
                if(target > number[mid]){
                    ending = mid + ending;
                }
                else{
                    starting = mid - starting;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {10, 20, 30, 40, 60, 110, 120, 130, 170};
        int target = 175;
        System.out.println(RecursiveBS(number, target));
    }
}
