n=int(input())
arr=list(map(int,input().split()))
first =second=float('-inf')
for x in arr:
    if x > first:
        second=first
        first=x
    elif x > second and x != first:
        second=x
if second == float('-inf'):
    print("Ledhu marchipo")
else:
    print(second)