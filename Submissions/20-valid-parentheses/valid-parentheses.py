class Solution:
    def isValid(self, s: str) -> bool:
        i = 0
        l = len(s)
        L = []
        while i < l:
            if s[i] in ['{','(','[']:
                L.append(s[i])
            else:
                if len(L) == 0:
                    return False
                prev_char = L[-1]
                if s[i]== '}' and prev_char != '{':
                    return False
                elif s[i]== ']' and prev_char != '[':
                    return False
                elif s[i]== ')' and prev_char != '(':
                    return False
                else:
                    L.pop()
            i += 1

        return len(L) == 0
        