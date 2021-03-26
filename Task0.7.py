def celsius_to_fahrenheit(celsius):

    fahrenheit = 9.0 / 5.0 * celsius + 32

    return fahrenheit


print(celsius_to_fahrenheit(0))


def fahrenheit_to_celsius(fahrenheit):

    celsius = (fahrenheit - 32) * 5.0 / 9.0

    return celsius


print(fahrenheit_to_celsius(32))
