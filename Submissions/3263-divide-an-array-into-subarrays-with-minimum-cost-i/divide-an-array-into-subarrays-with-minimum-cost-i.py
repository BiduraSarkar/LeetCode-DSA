class Solution:
    def minimumCost(self, nums: List[int]) -> int:
        sum = nums[0]
        nums = nums[1:]
        nums= sorted(nums)
        sum += nums[0]+nums[1]
        return sum
        