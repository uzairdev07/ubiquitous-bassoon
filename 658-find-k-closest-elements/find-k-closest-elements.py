class Solution(object):
    def findClosestElements(self, arr, k, x):
        left, right = 0, len(arr) - 1
        
        # Perform binary search to find the closest element
        while left < right:
            mid = (left + right) // 2
            if arr[mid] < x:
                left = mid + 1
            else:
                right = mid
        
        # Initialize two pointers
        left, right = left - 1, left
        
        # Find the k closest elements
        while k > 0:
            if left < 0:
                right += 1
            elif right >= len(arr) or abs(arr[left] - x) <= abs(arr[right] - x):
                left -= 1
            else:
                right += 1
            k -= 1
        
        # Return the k closest elements
        return arr[left + 1:right]
        