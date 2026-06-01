n=int(input())
arr=list(map(int,input().split()))
pos=0
for i in range(n):
    if arr[i]!=0:
        arr[po  s]=arr[i]
        pos+=1
while pos<n:
    arr[pos]=0
    pos+=1
print(*arr)