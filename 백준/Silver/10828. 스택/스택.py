import collections
import sys

n = int(sys.stdin.readline())
stack = collections.deque()

for i in range(n):
    command = sys.stdin.readline().split()

    if(command[0]=="push"):
        stack.appendleft(int(command[1]))
    elif(command[0]=="pop"):
        if(len(stack)==0):
            print(-1)
        else:
            print(stack.popleft())
    elif(command[0]=="top"):
        if(len(stack)==0):
            print(-1)
        else:
            print(stack[0])
    elif(command[0]=="size"):
        print(len(stack))
    elif(command[0]=="empty"):
        if(len(stack)==0):
            print(1)
        else:
            print(0)
