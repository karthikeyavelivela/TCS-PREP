n=int(input())
arr=list(map(int,input().split()))
dis=sorted(set(arr))
print(dis[-2] if len(dis)>=2 else -1)