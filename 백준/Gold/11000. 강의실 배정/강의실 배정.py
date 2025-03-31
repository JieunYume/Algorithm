import sys
import heapq

q = []
n = int(sys.stdin.readline())

for i in range(n):
    start, end = map(int, sys.stdin.readline().split())
    q.append([start, end])
q.sort() # 정렬~!

classroom = []
heapq.heappush(classroom, q[0][1]) # 제일 빨리 시작하는 수업의 종료 시간간

for i in range(1, n):
    if q[i][0] < classroom[0]: # 다음 수업의 시작 시간이 가장 일찍 끝난 강의실의 종료 시간보다 빠르면
        heapq.heappush(classroom, q[i][1]) # 새로운 강의실을 개설
    else: # 현재 강의실에 이어서 가능
        heapq.heappop(classroom) # 새로운 강의로 시간 변경을 위해 pop후 새 시간 push
        heapq.heappush(classroom, q[i][1])
print(len(classroom))