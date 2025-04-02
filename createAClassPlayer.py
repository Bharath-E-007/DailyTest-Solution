class Player:
    # Fixed constructor method name
    def __init__(self, name, weight):
        self.name = name
        self.weight = weight

    # Fixed string representation method name
    def __str__(self):
        return f"{self.name} {self.weight}"

    # Fixed equality comparison method name
    def __eq__(self, other):
        return self.weight == other.weight

    # Fixed greater-than comparison method name
    def __gt__(self, other):
        return self.weight > other.weight


# Input processing
name, weight = input().strip().split()
player1 = Player(name, int(weight))

name, weight = input().strip().split()
player2 = Player(name, int(weight))

# Compare and print results
if player1 == player2:
    print(player1)
    print(player2)
elif player1 > player2:
    print(player1)
else:
    print(player2)

# Output the player with the greater weight
# If both players have the same weight, output both players
# Example input:
# John 70
# Mike 70
# Example output:
# John 70
# Mike 70
