class Solution(object):
    def maxVowels(self, s, k):
        low = 0
        high = k
        maximum = 0
        count = 0
        vowels="aeiou"
        for i in range(k):
            if s[i] in vowels:
                count+=1
            maximum = count
        while(high<len(s)):
            if s[low] in vowels :
                count-=1
            if s[high] in vowels :
                count += 1
            maximum = max(maximum,count)
            low+=1
            high+=1
        return maximum
    

        