def maximum():

    maximum = []
    user_input = int(input("enter number of elements :"))

    for i in range(1, user_input + 1):
        ele = int (input("Enter number:"))
        maximum.append(ele)

        maximum.sort() 


    print("Largest number is:", maximum[-1])

maximum()
