import turtle

pen = turtle.Turtle()
pen.speed(5)
# top lines
pen.forward(85)
pen.left(45)
pen.forward(60)
pen.left(135)
pen.forward(90)
pen.left(50)
pen.forward(58)

# front
pen.seth(270)
pen.forward(75)
pen.left(90)
pen.forward(85)
pen.seth(90)
pen.forward(75)
pen.seth(270)
pen.forward(75)

# right
pen.left(135)
pen.forward(60)
pen.seth(92)
pen.forward(75)
pen.seth(272)
pen.forward(75)

# back
pen.right(90)
pen.forward(90)
pen.seth(90)
pen.forward(80)
pen.seth(270)
pen.forward(80)

# left
pen.right(45)
pen.forward(55)

pen.hideturtle()
turtle.done()
