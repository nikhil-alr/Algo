package com.company.lovebabar.array;

import javax.xml.soap.Node;

class TreeNode
{
  int value = 0;
  TreeNode leftNode;
  TreeNode rightNode;
}

class AvlTree
{
  TreeNode rootNode;

  public void insert(int element)
  {

    if (rootNode==null)
    {
      rootNode = new TreeNode();
      rootNode.value = element;
    }
    else
    {
      insertValue(element,rootNode);

    }

  }


  private TreeNode insertValue(int element,TreeNode node)
  {
    if(node==null)
    {
      return  null;
    }

    if (node.value>element)
    {

      if (insertValue(element,node.leftNode)==null)
      {
        node.leftNode = new TreeNode();
        node.leftNode.value = element;
      }


    }
    else
    {
      if (insertValue(element,node.rightNode)==null)
      {
        node.rightNode = new TreeNode();
        node.rightNode.value = element;
      }


    }

    return node;
  }

//  private TreeNode rotate(TreeNode node)
//  {
//    TreeNode nodeToReturn = null;
//    if (node.height<-1)
//    {
//      nodeToReturn =  rightRotate(node);
//    }
//    if (node.height>1)
//    {
//      nodeToReturn =  leftRotate(node);
//    }
//    return nodeToReturn;
//  }

//  private TreeNode rightRotate(TreeNode node)
//  {
//    node.leftNode.rightNode = node;
//    return node.leftNode;
//  }
//
//  private TreeNode leftRotate(TreeNode node)
//  {
//    node.leftNode.rightNode = node;
//
//    return node.leftNode;
//  }

  public void delete()
  {

  }

  public void update()
  {

  }
}

public class CountInversions {

  public static void main(String args[])
  {
    long array[] = {10, 10, 10};
    System.out.print("Inversion");

    //sort(array,0, array.length-1);
    //printArray(array);
    System.out.print(inverseCount);
    inversionCount(array,array.length);
  }
  static long inversionCount(long arr[], long N)
  {
    // Your Code Here
    sort(arr,0, arr.length-1);
    return inverseCount;
  }

static long inverseCount = 0;

  static void merge(long arr[], int l, int m, int r)
  {
    // Find sizes of two subarrays to be merged
    int n1 = m - l + 1;
    int n2 = r - m;

    /* Create temp arrays */
    long L[] = new long[n1];
    long R[] = new long[n2];

    /*Copy data to temp arrays*/
    for (int i = 0; i < n1; ++i)
      L[i] = arr[l + i];
    for (int j = 0; j < n2; ++j)
      R[j] = arr[m + 1 + j];

    /* Merge the temp arrays */

    // Initial indexes of first and second subarrays
    int i = 0, j = 0;

    // Initial index of merged subarry array
    int k = l;
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        arr[k] = L[i];
        i++;
      }
      else {
        arr[k] = R[j];
        inverseCount+=(L.length)-i;
        j++;
      }
      k++;
    }

    /* Copy remaining elements of L[] if any */
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    /* Copy remaining elements of R[] if any */
    while (j < n2) {
      arr[k] = R[j];
      j++;
      k++;
    }
  }

  // Main function that sorts arr[l..r] using
  // merge()
  static void sort(long arr[], int l, int r)
  {
    if (l < r) {
      // Find the middle point
      int m = (l + r) / 2;

      // Sort first and second halves
      sort(arr, l, m);
      sort(arr, m + 1, r);

      // Merge the sorted halves
      merge(arr, l, m, r);
    }
  }

  /* A utility function to print array of size n */
  static void printArray(int arr[])
  {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }





  public static void countInversionUsingAvlTree(int array[])
  {
    AvlTree avlTree = new AvlTree();
    for (int item:array)
      avlTree.insert(item);

    System.out.print("");
  }





  public static void countInversionUsingFenwickTree()
   {

  }


}
