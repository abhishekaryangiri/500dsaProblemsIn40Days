//Recursively print all sentences that can be formed from list of word lists
//Given a list of word lists How to print all sentences possible taking one word from a list at a time via recursion? 

//Example: 

//Input: {{"you", "we"},
 //       {"have", "are"},
 //       {"sleep", "eat", "drink"}}

//Output:
//  you have sleep
//  you have eat
  //you have drink
//  you are sleep
//  you are eat
///  you are drink
 // we have sleep
//  we have eat
//  we have drink
//  we are sleep
//  we are eat
//  we are drink
package loveDSA;

public class $41PrintAllSent {

static final int R= 3;
static final int C =3;
   
// A recursive function to
// print all possible sentences
// that can be formed 
// from a list of word list
static void printUtil(String [][]arr,
                      int m, int n,
                      String []output)
{
  // Add current word to output array
  output[m] = arr[m][n];
 
  // If this is last word of
  // current output sentence,
  // then print the output sentence
  if (m == R - 1)
  {
    for (int i = 0; i < R; i++)
      System.out.print(output[i] + " ");
    System.out.println();
    return;
  }
 
  // Recur for next row
  for (int i = 0; i < C; i++)
    if (arr[m + 1][i] != "" && m < C)
      printUtil(arr, m + 1, i, output);
}
 
// A wrapper over printUtil()
static void print(String [][]arr)
{
  // Create an array to store sentence
  String []output = new String[R];
 
  // Consider all words for first
  // row as starting points and
  // print all sentences
  for (int i = 0; i < C; i++)
    if (arr[0][i] != "")
      printUtil(arr, 0, i, output);
}
 
// Driver program to test above functions
public static void main(String[] args)
{
  String [][]arr  = {{"you", "we", ""},
                     {"have", "are", ""},
                     {"sleep", "eat", "drink"}};
  print(arr);
}
}
