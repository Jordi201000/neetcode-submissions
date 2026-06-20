class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums)-1
        while(left<=right):
            middle=(left+right)//2
            mynum = nums[middle]
            if (mynum == target):
                return middle
            elif(mynum>target):
                right = middle-1
            else:
                left = middle+1
        return -1

        