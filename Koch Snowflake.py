import turtle
import random


def snow(size):
    if size > 10:
        snow(size / 3)
        koch.right(60)
        snow(size / 3)
        koch.left(120)
        snow(size / 3)
        koch.right(60)
        snow(size / 3)
    else:
        koch.forward(size)


koch = turtle.Turtle()

koch.speed(0)
koch.color(random.choice(["blue", "green", "purple", "red"]))

flake_size = random.randint(150, 250)

for _ in range(3):
    snow(flake_size)
    koch.left(120)

turtle.exitonclick()
