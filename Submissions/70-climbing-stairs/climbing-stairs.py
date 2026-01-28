class Solution(object):
    dict = {0:0,1:1,2:2}
    def climbStairs(self, n):
        if n in self.dict.keys():
            return self.dict[n]
        else:
            self.dict[n] = self.climbStairs(n-1) + self.climbStairs(n-2)
        return self.dict[n]
        
        