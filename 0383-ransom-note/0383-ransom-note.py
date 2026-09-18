class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        map1 = {}
        map2 = {}
        for char in ransomNote:
            map1[char] = map1.get(char,0)+1
        for char in magazine:
            map2[char] = map2.get(char,0)+1
        for char,count in map1.items():
            if char not in map2 or count > map2[char]:
                return False
        
        return True