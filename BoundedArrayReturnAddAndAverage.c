#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int SIZE;
    double *arr;
} BoundedArray;

BoundedArray *getAverages(int SIZE, int arr[]) {
    if (SIZE < 3) return NULL;  // Ensure there are enough elements for averaging

    BoundedArray *result = (BoundedArray *)malloc(sizeof(BoundedArray));
    if (result == NULL) {
        printf("Memory allocation failed\n");
        return NULL;
    }

    result->arr = (double *)malloc((SIZE - 2) * sizeof(double));
    if (result->arr == NULL) {
        printf("Memory allocation failed\n");
        free(result);
        return NULL;
    }

    result->SIZE = 0;
    double sum = 0.0;

    for (int i = 0; i <= SIZE - 3; i++) {
        sum = arr[i] + arr[i + 1] + arr[i + 2];
        result->arr[result->SIZE++] = sum / 3.0;
    }

    return result;
}

int main() {
    int N;
    scanf("%d", &N);

    if (N < 3) {
        printf("Insufficient elements\n");
        return 1;
    }

    int arr[N];
    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }

    BoundedArray *ptr = getAverages(N, arr);
    if (ptr) {
        for (int i = 0; i < ptr->SIZE; i++) {
            printf("%.2f ", ptr->arr[i]);
        }
        printf("\n");

        // Free allocated memory
        free(ptr->arr);
        free(ptr);
    }

    return 0;
}
/*
    * This program reads an integer N and then N integers into an array.
    * It calculates the average of every three consecutive elements in the array
    * and stores them in a dynamically allocated structure. The averages are then printed.
    * The program ensures that there are enough elements to calculate the averages.
    * Memory is allocated for the averages and freed after use.
    * The program handles memory allocation failures gracefully.
*/