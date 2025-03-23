#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int *arr;
    int SIZE;
} BoundedArray;

BoundedArray* getIntegersWithUniqueDigits(int SIZE, int arr[]) {
    BoundedArray *result = (BoundedArray *)malloc(sizeof(BoundedArray));
    result->arr = (int *)malloc(SIZE * sizeof(int));
    result->SIZE = 0;

    for (int i = 0; i < SIZE; i++) {
        int digit[10] = {0};
        int num = arr[i];
        int b = 1;

        while (num > 0) {
            int d = num % 10;
            if (digit[d] == 1) {
                b = 0;
                break;
            }
            digit[d]++;
            num /= 10;
        }

        if (b) {
            result->arr[result->SIZE++] = arr[i];
        }
    }

    if (result->SIZE == 0) {
        result->arr[result->SIZE++] = -1;
    }

    return result;
}

int main() {
    int arr[] = {123, 112, 456, 789, 987};
    int SIZE = sizeof(arr) / sizeof(arr[0]);

    BoundedArray *result = getIntegersWithUniqueDigits(SIZE, arr);

    for (int i = 0; i < result->SIZE; i++) {
        printf("%d ", result->arr[i]);
    }

    free(result->arr);
    free(result);

    return 0;
}
/*Check and return Number in The Array Contains a Unique Value*/