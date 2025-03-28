import sys

dogam = {}
n, m = map(int, sys.stdin.readline().split())
for i in range(1, n+1):
    dogam[i] = sys.stdin.readline().strip()
dogam2 = {v:k for k, v in dogam.items()}

for i in range(m):
    _input = sys.stdin.readline().strip()
    if _input.isdigit():
        print(dogam[int(_input)])
    else:
        print(dogam2[_input])
    