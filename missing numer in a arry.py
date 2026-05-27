n=int(input())
arr=list(map(int,input().split()))
expected_sum=(n*(n+1))//2
actual_sum=sum(arr)
missing_number=actual_sum-expected_sum
print(missing_number)