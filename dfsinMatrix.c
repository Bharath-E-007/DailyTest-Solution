#include <stdio.h>

void writeAdjacencyListToFile(int N, int **adjacencyMatrix) {
    FILE *fp = fopen("adjacencylist.txt", "w");
    if (fp == NULL) {
        printf("Unable to open file for writing.\n");
        return;
    }

    for (int i = 0; i < N; i++) {
        fprintf(fp, "[%d]", i + 1);
        int hasAdjacent = 0;
        for (int j = 0; j < N; j++) {
            if (adjacencyMatrix[i][j] == 1) {
                fprintf(fp, " -> %d", j + 1);
                hasAdjacent = 1;
            }
        }
        fprintf(fp, " -> NULL\n");
    }

    fclose(fp);
}

/*
    * Function to check if a number is unique in the array
    * Returns 1 if unique, 0 otherwise
    
*/