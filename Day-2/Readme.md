# Explanation
## 1. Remove Duplicates from Sorted Array
Given a sorted array we need to remove the duplicates from it.
### I. Brute Force
We traverse through the array and take only distinct elements from it and place them in one temporary array and placing back in the actual array.
Time Complexity: O(n)
Space Complexity: O(n)

### II. Using TreeSet
We add all elements into the TreeSet and Storing the elements back in the actual array. 

Time Complexity: O(n)
Space Complexity: O(n)

### III. Using Two Pointer Approach  (Optimal)
Since the array is sorted, all duplicates will be present side by side. So if we can compare the adjacent elements we can find whether the element is distinct or not. 
Every time when we encounter a new distinct element we add it to the array. By continuing it till the end of array we'll get the required array.

Ex: {1,2,2,3,3,3,4}
We use two pointers, one is to iterate and find the distinct element and another is to place the distinct element.
let l and i are two pointers. Both are initialized with 1.
we compare arr[i] with arr[i-1], if not equal we encountered a distinct element we need to place it at the arr[l]
At l = 1,i = 1 => arr[1] != arr[1-1] then arr[l] = arr[i] =>  arr = {1,2,2,3,3,3,4}
At l = 2,i = 2 => arr[2] == arr[1] we'll skip it
At l = 2,i = 3 => arr[3] != arr[2] then arr[l] = arr[i] => arr = {1,2,3,3,3,3,4}
At l = 3,i = 4 => arr[4] == arr[3] we'll skip it
At l = 3,i = 5 => arr[5] == arr[4] we'll skip it
At l = 3,i = 6 => arr[6] != arr[5] then arr[l] = arr[i] => arr = {1,2,3,4,3,3,4}
we'll return 4 whhich is the value of l at the end

From 0 to 3 we can fnd only distinct elements.

Time Complexity: O(n)
Sapce Complexity: O(1)

## 2. Sort Colors
Given an array where three colors are represented using 0,1 and 2. 
Sort the colors such that 0s come first, 1s come second and 2s at end.

### I. Using Frequencies
Count the frequencies of 0s,1s and 2s. We can use HashMap or simple three variables to store the frequencies.
Take a temporary and store the 0s first, 1s next and 2s at the end using their respective frequencies.
Copy temporary array to actual array.

Time Complexity: O(n)
Space Complexity: O(n)

### II. Sorting the Array using Sort Function
Time Complexity: O(nlogn)
Space Complexity: O(1)

### III. Using Two Pointers
We need to sort array in a such a way that all 0s should be at start, 1s should be in the middle and 2s should be at the end. So if we can place all the 0s we encounter in the starting, 2s we encounter at the end. Automatically 1s will be placed in the middle. For this we use two pointers, one will be used to place 0s and one will be used to place the 2s. We'll iterate through the array using the iterator. 

We'll use left, right pointers
if(arr[i]==0)
    swap(i,left)
    i++
    left++
else if(arr[i]==1)
    i++
else
    swap(i,right)
    right--

Ex: {2,0,2,1,1,0,0} 
let iterator i = 0 and left = 0 and right = len-1
at i = 0, arr[i] = 2 swap(i,right) and decrement right => arr = {0,0,2,1,1,0,2}
at i = 1, arr[i] = 0 swap(i,left) and increment i and left => arr = {0,0,2,1,1,0,2}
at i = 2, arr[i] = 2 swap(i,right) and decrement right  => arr = {0,0,0,1,1,2,2}
at i = 3, arr[i] = 1 increment i  => arr = {0,0,0,1,1,2,2}
at i = 4, arr[i] = 1 increment i  => arr = {0,0,0,1,1,2,2}

Finally, the array will be sorted.

Time Complexity: O(n)
Space Complexity: O(1)