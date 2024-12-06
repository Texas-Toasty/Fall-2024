import turtle

turtle.bgcolor("black")
turtle.pensize(5)
turtle.speed(0)

for i in range(100):
    for colors in ["red", "orange", "yellow", "green", "blue", "indigo", "violet"]:
        turtle.color(colors)
        turtle.circle(100)
        turtle.left(10)

turtle.hideturtle()
turtle.done()
