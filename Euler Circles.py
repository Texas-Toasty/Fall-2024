import turtle

t = turtle.Turtle()


def euler_curve(step_size, angle_step, n_steps):
    t.color("green")
    angle = 0
    for i in range(n_steps):
        t.right(angle)
        t.forward(step_size)
        angle += angle_step


def center_drawing():
    t.penup()
    t.setposition(-250, 100)
    t.pendown()


t.speed(0)
turtle.tracer(100)
turtle.bgcolor("tan")

center_drawing()

euler_curve(step_size=0.75, angle_step=1.788889, n_steps=500000)

turtle.exitonclick()
