class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:

        l = len(letters)
        low = 0
        up = l
        midpos = int((low + up)/2)
        while midpos < l:
            if letters[midpos]  <= target:
                low = midpos+1
                midpos = int((low + up)/2)
            elif letters[midpos] > target:
                if midpos == 0:
                    return letters[midpos]
                elif letters[midpos - 1] <= target:
                    return letters[midpos]
                else:
                    up = midpos-1
                    midpos = int((low + up)/2)
        return letters[0]


        