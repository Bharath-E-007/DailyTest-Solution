#include <stdlib.h>

typedef struct {
	int* arr;
	int SIZE;
} BoundedArray;

BoundedArray* removeMultiplesOfTen(int SIZE, int arr[]) {

	BoundedArray* Result = (BoundedArray*)malloc(sizeof(BoundedArray));
	Result->arr = (int*)malloc(sizeof(int) * (SIZE + 1000));
	Result->SIZE = 0;

	for (int i = 0; i < SIZE; i++) {
		if (arr[i] % 10 == 0) continue;
		Result->arr[Result->SIZE++] = arr[i];
	}

	return Result;
}