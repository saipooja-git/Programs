package java_new_programs;

import java.io.*;

class GFG {
  public static void main(String args[]) throws IOException {
      BufferedReader read =
          new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(read.readLine());
      while (t-- > 0) {
          String s = read.readLine();
          
          Solution ob = new Solution();
          String result = ob.removeDups(s);
          
          System.out.println(result);
      }
  }
}
//} Driver Code Ends


//User function Template for Java

class Solution {
  String removeDups(String S) {
      // Create a boolean array to keep track of characters seen before
      boolean[] seen = new boolean[256]; // Assuming ASCII characters
      
      // Use a StringBuilder to build the result string
      StringBuilder result = new StringBuilder();
      
      // Traverse the input string
      for (char c : S.toCharArray()) {
          if (!seen[c]) {
              // If the character is not seen before, add it to the result and mark it as seen
              result.append(c);
              seen[c] = true;
          }
      }
      
      // Convert StringBuilder to String and return
      return result.toString();
  }

  }
