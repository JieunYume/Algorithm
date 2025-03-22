import sys
from collections import deque 

n = int(sys.stdin.readline())
queue = deque([i+1 for i in range(n)])

i = 1
while(len(queue) != 1):
    if(i%2 == 1):
        queue.popleft()
    else:
        queue.append(queue.popleft())
    i+=1

print(queue[0])