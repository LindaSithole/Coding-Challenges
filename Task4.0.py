
def even_or_odd():
    user_input = int(input("Enter Your Number: "))
    even_numbers = [1,2,4,6,8,10]
    odd_numbers = [1,3,5,7,9,11]

    if user_input in even_numbers: 
        print("even")
    elif user_input in odd_numbers:
        print("odd")
    
even_or_odd()