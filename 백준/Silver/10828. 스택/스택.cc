#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_STACK_SIZE 10000

typedef int element;

typedef struct {
	element data[MAX_STACK_SIZE];
	int top;
} StackType;

void init_stack(StackType* s) { //스택 초기화(top을 -1로 설정)
	s->top = -1;
}

int is_empty(StackType* s) {
	return (s->top == -1);
}

int is_full(StackType* s) {
	return (s->top == (MAX_STACK_SIZE - 1));
}

void push(StackType* s, element item) { //스택이 꽉 차있는지 검사 후 꽉 차있지 않다면 데이터 삽입
	s->top++;
	s->data[s->top] = item;
}

element pop(StackType* s) { //스택이 비어있는지 검사 후 비어있지 않다면 데이터 삭제 및 반환
	return s->data[(s->top)--];
}
element peek(StackType* s) { //스택이 비어있는지 검사 후 비어있지 않다면 데이터 삭제 및 반환
	return s->data[(s->top)];
}

int main(void) {
	StackType* s = (StackType*)malloc(sizeof(StackType));
	init_stack(s);
	int n, item;
	char command[10];
	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf("%s", command);
		if (strcmp(command, "push")==0) {
			scanf("%d", &item);
			push(s, item);
		}
		else if (strcmp(command, "pop") == 0) {
			if (is_empty(s))
				printf("-1\n");
			else
				printf("%d\n", pop(s));
		}
		else if (strcmp(command, "size") == 0) {
			printf("%d\n", s->top + 1);
		}
		else if (strcmp(command, "empty") == 0) {
			if (is_empty(s))
				printf("1\n");
			else
				printf("0\n");
		}
		else if (strcmp(command, "top") == 0) {
			if (is_empty(s))
				printf("-1\n");
			else
				printf("%d\n", peek(s));
		}
		else
			return 0;
	}
}