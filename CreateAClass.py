class Matrix:
    def _init_(self, R, C):
        self.R = R
        self.C = C
        self.data = [[0 for _ in range(C)] for _ in range(R)]

    def setValue(self, row, col, value):
        self.data[row][col] = value

    def getValue(self, row, col):
        return self.data[row][col]

    def _add_(self, other):
        result = Matrix(self.R, self.C)
        for i in range(self.R):
            for j in range(self.C):
                result.setValue(i, j, self.getValue(i, j) + other.getValue(i, j))
        return result

# Main Program
R, C = map(int, input().split())
matrix1 = Matrix(R, C)
matrix2 = Matrix(R, C)

for row in range(R):
    currRow = list(map(int, input().split()))
    for col in range(C):
        matrix1.setValue(row, col, currRow[col])

for row in range(R):
    currRow = list(map(int, input().split()))
    for col in range(C):
        matrix2.setValue(row, col, currRow[col])

matrix3 = matrix1 + matrix2

print("Sum Matrix:")
for row in range(matrix3.R):
    for col in range(matrix3.C):
        print(matrix3.getValue(row, col), end=" ")
    print()


# Example Input/Output 1:

# Input:

# 3 3

# 1 2 3

# 4 5 6 

# 7 8 9

# 10 20 30

# 40 50 60

# 70 80 90

# Output:

# Sum Matrix:

# 11 22 33

# 44 55 66

# 77 88 99

# Explanation:

# Here R = 3 and C = 3, so the sum of the given two 3*3 matrices is printed.

# 11 22 33

# 44 55 66

# 77 88 99

# Example Input/Output 2:

# Input:

# 2 4

# 10 20 30 40

# 50 60 70 80

# 88 77 66 55

# 44 33 22 11

# Output:

# Sum Matrix:

# 98 97 96 95

# 94 93 92 91