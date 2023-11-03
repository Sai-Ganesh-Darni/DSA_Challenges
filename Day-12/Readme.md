# Intution For problems

## Remove K Digits
Find Peak elements and remove them
If the string is already in sorted order, there will be no peak elements so, we'll remove the k elements from the end.

## Asteroid Collision
Note:
    1. Asteroids are arrangeed in row.
    2. Same speed and direction.
Collision occur only when we had already visited negative number and wants to visit positive number

## Trapping Rain Water
We use stack to store previous long bars, which can be used to store the water in future. If the bar is too short than it's next element then we can't store water using it, so we discard it. 
We calculate the rain water trapped till the element by traversing through the every element of the array.

