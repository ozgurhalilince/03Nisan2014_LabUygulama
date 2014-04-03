1. (Duplicate Elimination) Use a one-dimensional array to solve the following problem: Write an 
application that inputs five numbers, each between 10 and 100, inclusive. As each number is 
read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,” 
in which all five numbers are different. Use the smallest possible array to solve this problem. 
Display the complete set of unique values input after the user enters each new value. 
2. (Sieve of Eratosthenes) A prime number is any integer greater than 1 that’s evenly divisible only 
by itself and 1. The Sieve of Eratosthenes is a method of finding prime numbers. It operates as 
follows: 
a. Create a primitive-type boolean array with all elements initialized to true. Array elements 
with prime indices will remain true. All other array elements will eventually be set to false. 
b. Starting with array index 2, determine whether a given element is true. If so, loop through 
the remainder of the array and set to false every element whose index is a multiple of the index 
for the element with value true. Then continue the process with the next element with value 
true. For array index 2, all elements beyond element 2 in the array that have indices which are 
multiples of 2 (indices 4, 6, 8, 10, etc.) will be set to false; for array index 3, all elements beyond 
element 3 in the array that have indices which are multiples of 3 (indices 6, 9, 12, 15, etc.) will 
be set to false; and so on. 
When this process completes, the array elements that are still true indicate that the index is a 
prime number. These indices can be displayed. Write an application that uses an array of 1000 
elements to determine and display the prime numbers between 2 and 999. Ignore array 
elements 0 and 1. 
3. Create the Matrix class to make basic matrix operations. UML class diagram of the Matrix class is 
given below. 
 There are 3 constructors. Matrix(Matrix) constructor 
creates a copy of the parameter object. 
 There are 2 types of add method. add(double) adds the 
parameter value to the each element of the matrix. 
add(Matrix) method is for adding the instance matrix and 
parameter matrix. If two matrices is not addable, null value 
should be returned. 
 There are also 2 types of multiply method. multiply(double) 
multiplies the parameter value to the each element of the 
matrix. multiply(Matrix) method is for multiplying the 
instance matrix and parameter matrix. If two matrices is not 
multipliable, null value should be returned. 
 print method is for printing all of the element of the matrix 
 setElement and getElement methods are for getting and 
setting an individual value of the matrix. 
 To copy an array System.arraycopy, Arrays.copyOf methods 
or copying elements in loops can be used. 

