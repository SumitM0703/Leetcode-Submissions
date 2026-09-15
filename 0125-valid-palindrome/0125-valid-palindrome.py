class Solution:
    def isPalindrome(self, s: str) -> bool:
        new_text = ""
        for ch in s:
            if(ch.isalnum()):
                new_text+=ch.lower()
        return new_text==new_text[::-1]