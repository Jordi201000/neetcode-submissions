import math
from bisect import bisect_right
from typing import List

class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        sortedPiles = sorted(piles)

        if h == len(piles):
            return sortedPiles[-1]

        pileSum = sum(sortedPiles)
        minK = math.ceil(pileSum / h)

        left, right = minK, sortedPiles[-1]
        ans = right

        while left <= right:
            mid = (left + right) // 2
            index = bisect_right(sortedPiles, mid)
            hours = index

            for i in range(index, len(sortedPiles)):
                hours += math.ceil(sortedPiles[i] / mid)
                if hours > h:
                    break

            if hours <= h:
                ans = mid
                right = mid - 1
            else:
                left = mid + 1

        return ans