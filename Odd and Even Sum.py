# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())

arr = list(map(int, input().split()))
even, odd = 0, 0
for i in range(len(arr)):
    if arr[i] % 2 == 0:
        even += arr[i]
    else:
        odd += arr[i]

print(odd, even)
