a,b,c=map(int,input().split())
k=sorted([a,b,c])
print("as",*k)
print("ds",*k[::-1])
