s = input()
one = 0
zero = 0
for i in range(1, len(s)):
    if s[i-1] != s[i]:
        if int(s[i]) == 1:
            zero += 1
        if int(s[i]) == 0:
            one += 1

if int(s[-1]) == 0:
    zero += 1
else:
    one += 1

result = min(one, zero)
print(result)
            
            
            
        
