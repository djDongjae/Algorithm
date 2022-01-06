s = input()
lst = []
sum = 0
s2 = ''

for i in s:
    if i.isalpha():
        lst.append(i)
    else:
        sum += int(i)

lst.sort()
lst.append(str(sum))

for i in lst:
    s2 += i

print(s2)







        
