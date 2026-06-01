n=int(input())
arr=list(map(int,input().split()))
k=int(input())
direction=input().strip()
k=k%n
if k==0:
    print(*arr)
elif direction=="right":
    print(*(arr[-k:]+arr[:-k]))
else:
    print(*(arr[k:]+arr[:k]))