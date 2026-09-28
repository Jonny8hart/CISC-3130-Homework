# CISC-3130-Homework

Name: Jonathan Hart

Programming Language: Java

IDE / Editor: Visual Studio Code

Question 1: The worst-case Big O time complexity of Bubble Sort is O(n^2).

Question 2: The reason bubble sort has this time complexity is that it sorts the array by comparing adjacent elements, so every time the array increases by n elements, it has to do n x n comparisons. The reason this happens is that the algorithm uses nested loops, with an inner loop that performs the comparison of each element, and then the outer loop, which will restart the inner loop if all the elements are not sorted.

Question 3: A 1000 element bubble sort will require about 10000 times more comparisons than a 10 element bubble sort because of Bubble Sort’s Big O time complexity of O(n^2). 1000^2 is 10000 times greater than 10^2, which shows why Bubble Sort becomes much slower as the number of elements increases.

Question 4: The Big O time complexity of Merge Sort is O(n log n).

Question 5: Merge Sort does much better as the array size increases compared to bubble sort because the time complexity of bubble sort grows much faster than merge sort. n^2 grows faster than n log n.

Question 6: 
Bubble Sort = O(n^2 )

Merge Sort = O(n log n)

Question 7: The Big O time complexity of a linear search is O(n) since it checks each element individually and linearly.

Question 8: The Big O time complexity of a binary search is O(log n), it cuts the search area in half, so it is quicker as data size increases.

Question 9: Binary Search requires a sorted set of data because it splits the set in half by checking if the middle value is greater or smaller than the target value.

Question 10: If the data were not sorted, I would use linear search because linear search does not require sorted data since it checks each value individually and does not rely on any form of sorting.

Question 11: Binary search would be better for a very large array, given that it is sorted because it will narrow down the amount of elements by half with every comparison, being the O(log n) complexity. Linear search would take much longer since it has to check every element until it finds the target.

Algorithm
Purpose
Big O
Bubble Sort
Sorting
 O(n^2)
Merge Sort
Sorting
O(n log n)
Linear Search
Searching
O(n)
Binary Search
Searching
O(log n)


