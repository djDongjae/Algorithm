n = input()
length = len(n)
mid = int(length/2)
sum1 = 0
sum2 = 0
for i in range(0, mid):
    sum1 += int(n[i])
for j in range(mid, length):
    sum2 += int(n[j])

if sum1 == sum2:
    print('LUCKY')
else:
    print('READY')
