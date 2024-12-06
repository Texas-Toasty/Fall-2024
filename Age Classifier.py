age = int(input("Enter your age: "))

if 0 <= age <= 1:
    print("You are an infant")

elif 1 < age < 13:
    print("You are a child")

elif 13 <= age < 20:
    print("You are a teenager")

elif 20 <= age <= 100:
    print("You are an adult")

else:
    print("Invalid response. Please enter an integer 0-100")
