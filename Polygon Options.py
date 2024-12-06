import turtle

s = int(input("How many sides would you like on your polygon? "))
t = int(input("How many polygons would you like? "))
c = input("Would you like vertical or horizontal polygons? ('vertical' or 'horizontal') ")

turtle.speed(5)
angle = -360/s
side_length = 100

for i in range(t):
    for _ in range(s):
        turtle.forward(side_length)
        turtle.right(angle)

    turtle.penup()

    if c == "horizontal":
        turtle.forward(side_length + 30)
    elif c == "vertical":
        turtle.left(90)
        turtle.forward(side_length + 30)
        turtle.right(90)

    turtle.pendown()

turtle.done()
