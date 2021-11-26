s = input()
result = 0

for i in s:
    n = int(i)
    if (result == 0) or (n == 0):
        result += n
    else:
        result = result * n

print(result)
