class Solution:
    def combine(self,str1:str,strL:List[str])-> List[str]:
        L=[]
        for c in str1:
            for item in strL:
                item = c+item
                L.append(item)
        return L 

    def letterCombinations(self, digits: str) -> List[str]:
        my_dict = {2:'abc',3:'def',4:'ghi',5:'jkl',6:'mno',7:'pqrs',8:'tuv',9:'wxyz'}
        c = int(digits[0])
        my_str = my_dict[c]
        if len(digits) == 1:
            return [c for c in my_str]
        return self.combine(my_str,self.letterCombinations(digits[1:]))