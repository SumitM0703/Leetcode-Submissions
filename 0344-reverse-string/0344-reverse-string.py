class Solution:
    def reverseString(self, s: list[str]) -> None:
        def reverse(s,left,right):
            if left>=right:
                return
            s[left],s[right] = s[right],s[left]
            reverse(s,left+1,right-1)
        reverse(s,0,len(s)-1)
        
       

        
        