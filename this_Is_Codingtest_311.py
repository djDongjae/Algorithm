n = int(input())
data = list(map(int, input().split()))

data.sort()
result = 0
group = []

while data:
    group.append(data[0])
    if len(group) == max(group):
        result += 1
        group = []
    data.remove(data[0])

print(result)
