# Enter your code here. Read input from STDIN. Print output to STDOUT

r,c = map(int, input().split())
A = []
B = []
for i in range(2*r):
    if i<r:
        A.append(list(map(int, input().split())))
    else:
        B.append(list(map(int, input().split())))

for i in range(r):
    for j in range(c):
        print(A[i][j] + B[i][j], end= " ")
    print()