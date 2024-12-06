from matplotlib import pyplot as plt

freq_y = [2, 8, 13, 22, 16, 9]
years_x = [0, 1, 2, 3, 4, 5]

plt.plot(years_x, freq_y, color="green", label="Frequency")

plt.ylabel('Frequency')
plt.xlabel('Years')
plt.title('Mattress Purchases')

plt.legend()

plt.tight_layout()

plt.show()
