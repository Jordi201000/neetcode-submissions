class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
            int right= s.length()-1;

        for (int left=0; left<s.length()/2; left++){
            while (left<=right && !Character.isLetterOrDigit( s.charAt(left))){
                left++;
            }

            while(right>=left && !Character.isLetterOrDigit( s.charAt(right))){
                right--;
            }
            if(right>=left && s.charAt(left)!=s.charAt(right))
                return false;
            else{
                right--;
            }
        }
        return true;

    }




}

