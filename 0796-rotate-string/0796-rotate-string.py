class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        n = len(s)
        m = len(goal)
        a = s+s
        if(n!=m):
            return False
        if(goal in a ):
            return True
        else:
            return False
        