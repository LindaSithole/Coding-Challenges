def even_or_odd(values):
   
    even_numbers = [1,2,4,6,8,10]
    odd_numbers = [1,3,5,7,9,11]

    if values in even_numbers: 
        return "even"
    elif values in odd_numbers:
        return "odd"

print(even_or_odd(4))
