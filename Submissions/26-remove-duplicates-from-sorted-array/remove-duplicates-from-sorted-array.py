class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        L = []

        for item in nums:
            if L==[] or L[-1] != item:
                L.append(item)
        
        k = len(L)
        
        nums[:k] = L
        
        return k
        