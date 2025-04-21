#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    char line[1005];
    char *token;
    char *last_token = NULL;

    while (fgets(line, sizeof(line), stdin) != NULL) {
        // Remove trailing newline character if present
        size_t len = strlen(line);
        if (len > 0 && line[len - 1] == '\n') {
            line[len - 1] = '\0';
        }

        // Tokenize the string by spaces
        token = strtok(line, " ");
        last_token = token;
        while (token != NULL) {
            last_token = token;
            token = strtok(NULL, " ");
        }

        // Print the last token
        if (last_token != NULL) {
            printf("%s\n", last_token);
        }
    }

    return 0;
}

/*
   Please convert the following Java code to C so that the C program executes successfully passing the test cases.

import java.util.Scanner;

public class Hello (

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

while (sc.hasNextLine()) {

String currRow[] = sc.nextLine().trim().split("\\s+");

System.out.println(currRow[currRow.length - 1]);

}

Note: The number of characters in each line of the input is greater than 0 and less than or equal to 1000.
*/