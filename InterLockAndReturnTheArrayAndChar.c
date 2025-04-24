#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* interlaceIntegerAndCharacter(int N, int arr[], char *str) {
    // Allocate a large enough buffer to hold the result
    char result = (char)malloc(10000 * sizeof(char));
    result[0] = '\0'; // Initialize as an empty string

    char temp[20]; // To hold each integer as string

    for (int i = 0; i < N; i++) {
        // Convert integer to string
        sprintf(temp, "%d", arr[i]);
        // Concatenate the integer string
        strcat(result, temp);
        // Concatenate the corresponding character
        strncat(result, &str[i], 1);
    }

    return result;
}

/*
   The function/method interlaceintegerAndCharacter accepts three arguments - N, arr and str. The integer N represents the size of the integer array arr and the character array str.

The function/method interlaceintegerAndCharacter must form a string by interlacing the N integers with N characters and return the resulting string.

Your task is to implement the function InterlaceintegerAndCharacter so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Boundary Condition(s):

1<= N <= 100

1<= Each integer value < 10^9

Example Input/Output 1:

Input

S 12 45 789 32144 15

abcde

Output:

12a45b789c32144d15e

Explanation:

Here N = 5.

The given 5 integers are 12, 45, 789, 32144 and 15.

The given 5 characters are a, b, c, d and e.

After interlacing the 5 integers with the 5 characters, the interlaced string becomes

12a45b789c32144d15e

Example Input/Output 2:

Input:

4 159 9004 5 20

WXYZ

Output: 159W9004X5Y20Z
*/