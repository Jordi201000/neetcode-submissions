class Solution {
    public String longestPalindrome(String s) {
        int counter =0;
        int index=0;
        for (int i = 0; i <s.length(); i++){

        //odd case
            int l=i;
            int r=i;
            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
                if(r-l+1>counter){
                    index=l;
                    counter=r-l+1;

                }
                l--;
                r++;

            }


        //even case
            l=i;
            r=i+1;
            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
                if(r-l+1>counter){
                   index=l;
                    counter=r-l+1;

                }
                l--;
                r++;
 
                
            }




        }
        return s.substring(index,index+counter);

    }
}
