class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        occurNums = {}

        for num in nums:
            if num in occurNums:
                return True

            occurNums[num] = 1 + occurNums.get(num, 0)
        return False
        