# Explanation
## 1. Reverse Array
Given an array we need to reverse the complete array.
### I. Brute Force
We traverse through the array and place the elements at the end from the starting and return the resultant array.
<br>
Ex: {1,2,3,4,5}
<br>
Initialse the result array {}
<br>
let i is iterator, i=0
<br>
at i=0, resultant array = {1}
<br>
at i=1, resultant array = {2,1}
<br>
at i=2, resultant array = {3,2,1}
<br>
at i=3, resultant array = {4,3,2,1}
<br>
at i=4, resultant array = {5,4,3,2,1}
<br>
<br>
Hence the reversed array will be stored in resultant array and it is returned.
<br>
Time complexity - O(n)
<br>
Space complexit - O(n)
<br>
<br>
### II. Optimal
<br>
In a reversed array, first elements will be placed at the end and end elements will be placed at the first. This is the intution behind the solution.
<br>
We traverse the using two pointers one is from left end and another is from right end. We place the first element to last and last to first using two pointers.
<br>
<br>
Ex: {1,2,3,4,5}
<br>
let left pointer l = 0, right pointer r = length of array - 1 = 4
<br>
At l = 0, r = 4  array ={5,2,3,4,1}
<br>
at l = 1, r = 3 array = {5,4,3,2,1}
<br>
at l = 2, r = 2 we stop
<br>
the array is reversed in place
<br>
Using this approach we took the half the iterations used before and we did it using O(1) Space
<br>
<br>
Time Complexity - O(n/2)  = O(n)
<br>
Space Complexity - O(1)
<br>
<br>
## 2. Rotate Array
<br>
Given an array and k, we need to rotate the array right side by k places. 
<br>
### I. Brute Force
<br>
Take another array and place the elements at k right positions from now.
<br>
Example:
<br>
arr = {1,2,3,4} and k = 2
<br>
we take resultant array res = {-1,-1,-1,-1}
<br>
Iterator i = 0
<br>
At i=0, (i+k)%len = 2 ("mod length" is used because we are rotating array)
<br>
res = {-1,-1,1,-1}
<br>
At i = 1, (1+2)%4 = 3 
<br>
res = {-1,-1,1,2}
<br>
At i = 2, (2+2)%4 = 0
<br>
res = {3,-1,1,2}
<br>
At i=3, (3+2)%4
<br>
res = {3,4,1,2}
<br>
<br>
That's it, the array is rotated right side by k places
<br>
<br>
Time Complexity: O(n)
<br>
Space Complexity: O(n)
<br>
<br>
### II. Optimal Solution (Reversal Algorithm)
<br>
This solution is very interesting, we'll understand this only when we observe what happens when we rotate the array.
<br>
let us oberserve some inputs and outputs first
<br>
Input: arr = {5,6,7,8,9} and k = 2
<br>
Output: {8,9,5,6,7}
<br>
<br>
Input: arr = {3,5,7,9,12,15} and k = 5
<br>
Output: {5,7,9,12,15,3}
<br>
<br>
You can observe that the array is in the same order at all the places except at the kth place. We can observe that at kth position, left elements of it are placed in right and right elements of it are placed in the left but in the same order. 
<br>
To implement this, we came up with using reversal algorithm.<br>
If we reverse the whole array, left elements will come to right and right elements will come to left. But in reverse order. If we can reverse the left and right part separately we can get the rotated array.<br>
<br>
Ex: {5,6,7,8,9} and k = 2
<br>
Reverse the whole array from 0 to len -1
<br>
resultant array = {9,8,7,6,5}
<br>
Now reverse the left and right part of k
<br>
Left part reversal i.e., from 0 to k-1 => arr = {8,9,7,6,5}
<br>
Right part reversal i.e., from k to len - 1  => arr = {8,9,5,6,7}
<br>
<br>
Therefore array is rotated by k places on right side.
<br>
Using this we reduced the space.
<br>
<br>
Time Complexity:  O(n)
<br>
Space Complexity: O(1)
<br>
