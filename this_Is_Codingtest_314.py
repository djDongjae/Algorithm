n = int(input())
data = list(map(int, input().split()))
data.sort()
result = 0

if data[0] > 1:
    print(1)
else:
    for i in range(1, len(data)):
        if data[i] - data[i-1] > 1:
            for j in range(0, i):
                result += data[j]
            print(result + 1)
            break
