from collections import deque
import sys

queue=deque()

def push(x):
    queue.append(x)

def pop():
    if(len(queue) == 0):
        print(-1)
    else:
        print(queue.popleft())

def size():
    print(len(queue))

def empty():
    if(len(queue)==0):
        print(1)
    else:
        print(0)

def front():
    if(len(queue)==0):
        print(-1)
    else:
        print(queue[0])

def back():
    if(len(queue)==0):
        print(-1)
    else:
        print(queue[-1])


n = int(sys.stdin.readline())
for i in range(n):
    command = sys.stdin.readline().split()
    if(command[0] == "push"):
        push(int(command[1]))
    elif(command[0] == "front"):
        front()
    elif(command[0] == "back"):
        back()
    elif(command[0] == "pop"):
        pop()
    elif(command[0] == "size"):
        size()
    elif(command[0] == "empty"):
        empty()
    else:
        print("오류")