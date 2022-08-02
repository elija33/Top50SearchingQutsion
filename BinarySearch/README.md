# Top50SearchingQutsion

Given an array number[] of N elements, the tasks is to write a function to search a given element x in number[].

Examples:
    Input: arr[] = {10, 20, 80, 30, 60, 50,110, 100, 130, 170}, x = 110;
    Output: 6
    Explanation: Element x is present at index 6

    Input: arr[] = {10, 20, 80, 30, 60, 50,110, 100, 130, 170}, x = 175;
    Output: -1
    Explanation: Element x is not present in arr[].


# Used Two Methond Here.. Binary Search, and Rescursive

# Binary Search Algorithm: The basic steps to perform Binary Search are:

Begin with the mid element of the whole array as a search key.
If the value of the search key is equal to the item then return an index of the search key. 
Or if the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. 
Otherwise, narrow it to the upper half.
Repeatedly check from the second point until the value is found or the interval is empty.
