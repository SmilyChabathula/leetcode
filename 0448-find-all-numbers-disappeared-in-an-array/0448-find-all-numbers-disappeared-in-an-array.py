class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:

        set1=set(nums)
        set2=set(range(1,len(nums)+1))
        diff=set2-set1

        return list(diff)


        