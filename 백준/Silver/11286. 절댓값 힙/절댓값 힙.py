import sys
import heapq

n = int(sys.stdin.readline())

heap = []

for i in range(n):
    x = int(sys.stdin.readline())
    size = len(heap)
    if x==0:
        if(size != 0):
            print(heapq.heappop(heap)[1])
        else:
            print(0)
    else:
        heapq.heappush(heap, (abs(x), x)) #(우선순위, 값)