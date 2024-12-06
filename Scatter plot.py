from matplotlib import pyplot as plt

plt.style.use("fivethirtyeight")

stories_x = [57, 28, 26, 40, 60, 22, 38, 110, 100, 46]
height_y = [1050, 428, 362, 529, 790, 401, 380, 1454, 1127, 700]

plt.scatter(stories_x, height_y, s=100, c="green", linewidth=1, alpha=0.75)

colors = [7, 5, 9, 7, 5, 7, 2, 5, 3, 7, 1, 2, 8, 1, 9, 2, 5, 6, 7, 5]
sizes = [209, 486, 381, 255, 191, 315, 185, 228, 174, 538, 239, 394, 399, 153, 273, 293, 436, 501, 397, 539]

plt.title("Height to Stories Relation")
plt.xlabel("Stories")
plt.ylabel("Height")

plt.tight_layout()
plt.show()
