class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if len(s) == 0 or s == t:
            return True
        else:
            x = s[-1] in t
            if x == False:
                return False
            t = t[:t.rindex(s[-1])]
            s = s[:-1]
            return self.isSubsequence(s,t)