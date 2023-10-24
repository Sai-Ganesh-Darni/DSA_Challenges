# Explanation
## 1. Reverse Array
Given an array we need to reverse the complete array.
### I. Brute Force
We traverse through the array and place the elements at the end from the starting and return the resultant array.
Ex: {1,2,3,4,5}
Initialse the result array {}
let i is iterator, i=0
at i=0, resultant array = {1}
at i=1, resultant array = {2,1}
at i=2, resultant array = {3,2,1}
at i=3, resultant array = {4,3,2,1}
at i=4, resultant array = {5,4,3,2,1}

Hence the reversed array will be stored in resultant array and it is returned.

Time complexity - O(n)
Space complexit - O(n)

### II. Optimal
In a reversed array, first elements will be placed at the end and end elements will be placed at the first. This is the intution behind the solution.
We traverse the using two pointers one is from left end and another is from right end. We place the first element to last and last to first using two pointers.

Ex: {1,2,3,4,5}
let left pointer l = 0, right pointer r = length of array - 1 = 4
At l = 0, r = 4  array ={5,2,3,4,1}
at l = 1, r = 3 array = {5,4,3,2,1}
at l = 2, r = 2 we stop
the array is reversed in place
Using this approach we took the half the iterations used before and we did it using O(1) Space

Time Complexity - O(n/2)  = O(n)
Space Complexity - O(1)

## 2. Rotate Array
Given an array and k, we need to rotate the array right side by k places. 
### I. Brute Force
Take another array and place the elements at k right positions from now.
Example:
arr = {1,2,3,4} and k = 2
we take resultant array res = {-1,-1,-1,-1}
Iterator i = 0
At i=0, (i+k)%len = 2 ("mod length" is used because we are rotating array)
res = {-1,-1,1,-1}
At i = 1, (1+2)%4 = 3 
res = {-1,-1,1,2}
At i = 2, (2+2)%4 = 0
res = {3,-1,1,2}
At i=3, (3+2)%4
res = {3,4,1,2}

That's it, the array is rotated right side by k places

Time Complexity: O(n)
Space Complexity: O(n)

### II. Optimal Solution (Reversal Algorithm)
This solution is very interesting, we'll understand this only when we observe what happens when we rotate the array.
let us oberserve some inputs and outputs first
Input: arr = {5,6,7,8,9} and k = 2
Output: {8,9,5,6,7}

Input: arr = {3,5,7,9,12,15} and k = 5
Output: {5,7,9,12,15,3}

You can observe that the array is in the same order at all the places except at the kth place. We can observe that at kth position, left elements of it are placed in right and right elements of it are placed in the left but in the same order. 

To implement this, we came up with using reversal algorithm.
If we reverse the whole array, left elements will come to right and right elements will come to left. But in reverse order. If we can reverse the left and right part separately we can get the rotated array.

Ex: {5,6,7,8,9} and k = 2
Reverse the whole array from 0 to len -1
resultant array = {9,8,7,6,5}
Now reverse the left and right part of k
Left part reversal i.e., from 0 to k-1 => arr = {8,9,7,6,5}
Right part reversal i.e., from k to len - 1  => arr = {8,9,5,6,7}

Therefore array is rotated by k places on right side.
Using this we reduced the space.

Time Complexity:  O(n)
Space Complexity: O(1)
