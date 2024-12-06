import turtle

pen = turtle.Turtle()
pen.speed(5)
pen.pensize(5)

# First circle
pen.penup()
pen.goto(-120, 0)
pen.pendown()
pen.circle(50)

# Second circle
pen.penup()
pen.goto(0, 0)
pen.pendown()
pen.circle(50)

# Third circle
pen.penup()
pen.goto(120, 0)
pen.pendown()
pen.circle(50)

# Fourth circle
pen.penup()
pen.goto(-60, -50)
pen.pendown()
pen.circle(50)

# Fifth circle
pen.penup()
pen.goto(60, -50)
pen.pendown()
pen.circle(50)

pen.hideturtle()
turtle.done()
