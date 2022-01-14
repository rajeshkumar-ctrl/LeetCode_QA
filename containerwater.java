// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.
  
  
//   Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
//   Input: height = [1,1]
// Output: 1




// aproach from internet
class Solution {
    public int maxArea(int[] height) {
        int max_so_far = 0;
        int start = 0;
        int end = height.length - 1;
        while(start < end) {
            max_so_far = Math.max(max_so_far, Math.min(height[start], height[end])*(end - start));
            if(height[start] < height[end]) {
                start++;
            }
            else {
                end--;
            }
        }
        return max_so_far;
    }
}


// my aproach but time limit exceded
// class Solution {
//     public int maxArea(int[] height) {
//         int max =-1;
        
        
//         for (int i=0;i<height.length;i++)
//         {
//             for(int j=i+1;j<height.length;j++)
//             {
                
//               if((j-i)*Math.min(height[i],height[j])>max)

//               {
//                     max=(j-i)*Math.min(height[i],height[j]);
//                 }
//             }          
//         }
        
//         return max;
        
//     }
// }
