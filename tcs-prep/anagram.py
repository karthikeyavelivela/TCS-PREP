a=input().lower()
b=input().lower()
if sorted(a)==sorted(b):
    print("Anagrams")
else:
    print("Not Anagrams")