height=int(input("What's your height in cm mate? \n"))

bill = 0
if height >= 120:
    print("You can ride")
    age = int(input("What is your age?\n"))
    if age < 12:
        bill = 5
        print("Child tickets are $5")
    elif 12 < age < 18:
        bill = 7
        print("Young tickets are $7")
    elif age >= 18:
        bill = 12
        print("Adult tickets are $12")

    photo = input("Wanna take a photo? \n").lower()
    if photo == "yes":
        bill += 3
        print(f"Your finale bill is {bill}")



else:
    print("Sorry, you have to grow taller before you can ride.")
