import turtle
import random


def tree(length, decrease, angle, noise=0):

    if length > 10:
        turtle.width(length/10)
        turtle.forward(length)

        new_length = length * decrease
        if noise > 0:
            new_length *= random.uniform(0.9, 1.1)

        angle_l = angle + random.gauss(0, noise)
        angle_r = angle + random.gauss(0, noise)

        turtle.left(angle_l)
        tree(new_length, decrease, angle, noise)
        turtle.right(angle_l)

        turtle.right(angle_r)
        tree(new_length, decrease, angle, noise)
        turtle.left(angle_r)

        turtle.backward(length)


turtle.bgcolor("light blue")
turtle.pencolor("dark green")
turtle.tracer(False)
turtle.penup()
turtle.goto(0, -350)
turtle.pendown()
turtle.left(90)
tree(150, 0.8, 22, 9)

turtle.hideturtle()
turtle.tracer(True)
turtle.exitonclick()
