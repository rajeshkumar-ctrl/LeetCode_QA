// Given an integer x, return true if x is palindrome integer.

// An integer is a palindrome when it reads the same backward as forward.

// For example, 121 is a palindrome while 123 is not.
  
//   Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
  
//   Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
  
class Solution {
    public boolean isPalindrome(int x) {
        int number =x;
        int reminder;
        int reveresed=0;
        
        while(number!=0)
        {
            reminder=number%10;
            reveresed=reveresed*10 +reminder;
            number=number/10;
        }
        if(x==reveresed && reveresed >= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
