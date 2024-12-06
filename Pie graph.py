from matplotlib import pyplot as plt

plt.style.use("fivethirtyeight")

slices = [2, 8, 13, 22, 16, 9]

labels = ["2", "8", "13", "22", "16", "9"]
labels1 = ["0 Years", "1 Year", "2 Years", "3 Years", "4 Years", "5 Years"]
colors = ["#008fd5", "#fc4f30", "#e5ae37", "#6d904f", "purple", "indigo"]
plt.pie(slices, labels=labels, autopct="%1.1f%%", colors=colors, wedgeprops={"edgecolor": "black"})

plt.title("Mattress Purchases")
plt.tight_layout()
plt.show()
