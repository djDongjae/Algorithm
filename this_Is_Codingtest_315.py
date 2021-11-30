n, m = map(int, input().split())
data = list(map(int, input().split()))
data.sort()
lst = [[]for i in range(m)]
k = 0
lst[0].append(data[0])

for i in range(1, n):
    if data[i-1] != data[i]:
        k += 1
    lst[k].append(data[i])

rslt1 = 0
rslt2 = 0
for i in range(len(lst) - 1):
    for j in range(i+1, len(lst)):
        rslt1 = len(lst[i]) * len(lst[j])
        rslt2 += rslt1

print(rslt2)
    
    
