package LinearSearch;

// Given an array number[] of N elements, the tasks is to write a function to search a given element x in number[].

/* Examples:

    Input: arr[] = {10, 20, 80, 30, 60, 50,110, 100, 130, 170}, x = 110;
    Output: 6
    Explanation: Element x is present at index 6

    Input: arr[] = {10, 20, 80, 30, 60, 50,110, 100, 130, 170}, x = 175;
    Output: -1
    Explanation: Element x is not present in arr[].
*/
public class LinearSearch{
    public static int Search(int number[], int target){
        for(int i = 0; i<number.length - 1; i++){
            if(number[i] == target){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int number[] = {2, 3, 4, 10, 5, 40};
        int target = 5;
        System.out.println(Search(number, target));
    }
}