def area__of_triangle(a, b, c):

    semi_p = (a + b + c) / 2

    area = (semi_p * (semi_p - a) * (semi_p - b) * (semi_p - c)) ** 0.5
    return round(area)


print(area__of_triangle(5, 6, 7))
