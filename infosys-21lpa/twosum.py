n = int(input())                          # read n (size of array), matches input format
nums = list(map(int, input().split()))    # read the array of numbers
target = int(input())                     # read the target sum

left, right = 0, len(nums) - 1            # left pointer at start, right pointer at end
found = False                             # flag to know if we found a pair

while left < right:                       # keep going until pointers meet
    curr_sum = nums[left] + nums[right]   # sum of current pair
    if curr_sum == target:                # exact match found
        print(left, right)                # print the two indices
        found = True
        break                             # stop, we are done
    elif curr_sum < target:               # sum is too small
        left += 1                         # move left pointer forward to increase sum
    else:                                 # sum is too big
        right -= 1                        # move right pointer backward to decrease sum

if not found:
    print(-1, -1) 