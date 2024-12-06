import turtle

color = input("Enter the color for the polygon: ")
sides = int(input("Enter the number of sides for the polygon: "))

t = turtle.Turtle()
t.color(color)
t.begin_fill()
angle = 360 / sides

for _ in range(sides):
    t.forward(100)
    t.left(angle)
t.end_fill()
turtle.done()
