n=int(input())
arr=list(map(int,input().split()))
curr=arr[0]
max_sum=arr[0]
for i in range(1,n):
    curr=max(arr[i],curr+arr[i])
    max_sum=max(max_sum,curr)
print(max_sum)