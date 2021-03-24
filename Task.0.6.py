
def maximum(a, b, c):

    if (a >= b) and (a >= c):
        maximum_number = a

    elif (b >= a) and (b >= c):
        maximum_number = b
    else:
        maximum_number = c

    return maximum_number


print(maximum(35, 24, 20))
