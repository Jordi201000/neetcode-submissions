class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        mySet = set()
        output =0
        if len(s)==0:
            return 0
        else:
            left = 0
            for right in range (len(s)):
                while s[right] in mySet:
                    mySet.remove(s[left])
                    left = left +1
                mySet.add(s[right])
                output= max(output,right-left+1)
            return output