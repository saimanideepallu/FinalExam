/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author S542406
 */
public class RecursionSearchExample {

    static int arr[] = {12, 34, 54, 2, 3};
      
     /* Recursive Method to search x in arr[l..r] */
     static int recSearch(int arr[], int l, int r, int x)
     {
          if (r < l)
             return -1;
          if (arr[l] == x)
             return l;
          if (arr[r] == x)
             return r;
          return recSearch(arr, l+1, r-1, x);
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 3;
         
        //Method call to find x
        int index = recSearch(arr, 0, arr.length-1, x);
        if (index != -1)
           System.out.println("Element " + x + " is present at index " +
                                                    index);
        else
            System.out.println("Element " + x + " is not present");
        }
    }
    
    
    

