```java
/** Java provides a handful amounts of static methods that can be performed on arrays to get a desired result
*   A few important of them can be found here
*   
*   **Note** : All of the below examples display how you can handle int[] array. But they are not at all limited to int[] at all.
*	       You can gladly use all types of Arrays like char[], boolean[], String[] etc., in place of int[]
*
*/  

// modification
1. Arrays.fill():
// Useful when you want to assign the array with a custom value  

Def.        : Arrays.fill(int[] array, int val);
Return type : void
Explanation : Sets all the values of given array to val

Example     : Arrays.fill(myArray, 6); 
// [0,0,0,0] -> turns into -> [6,6,6,6]



// oh! maybe you want to sort them values.
2. Arrays.sort():

Def.        : Arrays.sort(int[] array); 
Return type : void
Explanation : Sorts the array values in ascending order

Example     : Arrays.sort(myArray);
// [3,4,2,7,1,5] -> [1,2,3,4,5,7]



// what's the great thing about sorting ? it's binary search compatible !!
3. Arrays.binarySearch():

Def.        : Arrays.binarySearch(int[] array, int key);
Return type : int // index of the key in the array if found or will return index where the key is supposed to be
Explanation : Performs a binary search on the array and returns the index 

Example     : Arrays.binarySearch(myArray, 7);
// [3,4,2,7,1,5] -> returns index '3'



// But what if you want to copy or clone arrays ? 
4. Arrays.copyOf():

Def.        : Arrays.copyOf(int[] array, int length);
Return type : int[] // returns new copied array
Explanation : Copies array values and returns it as a new array with specified length

Example     : int[] copy = Arrays.copyOf(myArray, 4);
//  myArray : [3,4,2,7,1,5] -> copy : [3,4,2,7]

Example     : int[] copy = Arrays.copyOf(myArray, 9);
//  myArray : [3,4,2,7,1,5] -> copy : [3,4,2,7,1,5,0,0,0] 

Example     : int[] copy = Arrays.copyOf(myArray, 6);
//  myArray : [3,4,2,7,1,5] -> copy : [3,4,2,7,1,5]



// Everything's fine until you compare them !
5. Arrays.equals():

Def.        : Arrays.equals(int[] array1, int[] array2);
Return type : boolean // returns true or false
Explanation : compares array1 with array2 and tells whether both of them have same values at each indices

Example     : boolean flag = Arrays.equals(myArray, copy);
//  myArray : [3,4,2,7,1,5] compared with copy : [3,4,2,7,1,5] returns true



// Why even bother if you can't view the contents of an array
6. Arrays.toString():

Def.        : Arrays.toString(int[] array);
Return type : String // resultant string to displayed
Explanation : Makes a new string that shows contents of the array seperated by comma

Example     : Arrays.toString(myArray);
// returns "[3,4,2,7,1,5]" 
```
