class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        my_map = {}
        for i,num in enumerate(nums):

            if (target-num in my_map):
                return [my_map[target-num],i]
            my_map[num]=i
        return []