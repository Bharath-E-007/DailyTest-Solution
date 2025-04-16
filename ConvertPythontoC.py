def main():
    N = int(input())  # Read an integer input

    num_str = str(N)  # Convert integer to string
    length = len(num_str)  # Length of string

    total_sum = 0

    for index in range(length - 1, -1, -1):  # Iterate from last digit to first
        if num_str[index] != '0':  # Check if digit is not '0'
            curr_val = int(num_str[index:])  # Convert substring starting from index to int
            total_sum += curr_val

    print(total_sum)

main()
#include <stdio.h>

#include <stdlib.h>

# int main()

# {

# int N;

# char numStr[10];

# scanf("%d", &N); int len = sprintf(numStr, "%d", N); for(int index = len-1; index >= 0; index--)

# int sum 0, currval;

# {

# if(numStr[index] 1= '0')

# {

# }

# sscanf(numStr+index, "%d", &currVal);

# sum += currval;

# } printf("%d", sum);

# return 0;

# }