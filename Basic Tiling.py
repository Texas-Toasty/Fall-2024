import turtle
import random


def tiling(x, y, s, l, mode="straight"):
    if l == 0:

        if mode == "straight":
            if random.random() < 0.5:
                # vertical line
                turtle.penup()
                turtle.goto(x, y - s)
                turtle.pendown()
                turtle.goto(x, y + s)
            else:
                # horizontal line
                turtle.penup()
                turtle.goto(x - s, y)
                turtle.pendown()
                turtle.goto(x + s, y)

        elif mode == "diagonal":
            if random.random() < 0.5:
                # top left to bottom right
                turtle.penup()
                turtle.goto(x - s, y + s)
                turtle.pendown()
                turtle.goto(x + s, y - s)
            else:
                # bottom left to top right
                turtle.penup()
                turtle.goto(x - s, y - s)
                turtle.pendown()
                turtle.goto(x + s, y + s)
    else:
        s /= 2
        l -= 1
        tiling(x - s, y + s, s, l, mode)
        tiling(x + s, y + s, s, l, mode)
        tiling(x - s, y - s, s, l, mode)
        tiling(x + s, y - s, s, l, mode)


turtle.width(2)
turtle.hideturtle()
turtle.tracer(False)
tiling(0, 0, 400, 6, mode="straight")
turtle.tracer(True)
turtle.exitonclick()
