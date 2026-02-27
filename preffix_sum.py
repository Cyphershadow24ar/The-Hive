# Enter your code here. Read input from STDIN. Print output to STDOUT
s = input().split()
S = s[0]
T = s[1]
start = len(S) - len(T)

ans = 1
for i in range(len(T)):
    if S[i] != T[i] or T[i] != S[start + i]:
        ans = 0;
        break
if ans == 1:
    print("Yes");
else:
    print("No")