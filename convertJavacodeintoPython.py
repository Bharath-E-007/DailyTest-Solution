from collections import defaultdict

# Read input
numbers = input().strip().split()

# Dictionary to count frequencies
num_count_map = defaultdict(int)

# Count each number's frequency
for num in numbers:
    num = int(num)
    num_count_map[num] += 1

# Sort keys in reverse order and print
for key in sorted(num_count_map.keys(), reverse=True):
    print(f"{key} {num_count_map[key]}")