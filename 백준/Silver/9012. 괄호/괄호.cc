#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_STACK_SIZE 100000

typedef char element;

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

void f(StackType *s,char str[]) {
	char c;

	int length = strlen(str);

	for (int i = 0; i < length; i++) {
		c = str[i];
		if (c == '(') {
			push(s, c);
		}
		else {
			if (!is_empty(s)) {
				pop(s);
			}
			else {
				printf("NO\n");
				return;
			}
		}
	}
	if (!is_empty(s)) {
		printf("NO\n");
		return;
	}
	printf("YES\n");
}

int main(void) {
	StackType* s = (StackType*)malloc(sizeof(StackType));
	int n;
	char str[60];
	char c;

	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		init_stack(s);
		scanf("%s", str);
		f(s, str);
	}
}