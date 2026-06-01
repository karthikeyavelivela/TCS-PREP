s=input().lower().strip()
if s==s[::-1]:
    print("Palindrome")
else:    
    print("Not a Palindrome")

##n=int(input())
##print("Palindrome" if str(n)==str(n)[::-1] else "Not a Palindrome")