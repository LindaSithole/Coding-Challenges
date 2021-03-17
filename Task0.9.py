def print_vowels():

    user_input = input("Enter A Word:")

    vowels = "a", "e", "i", "o", "u"
    occurrences = ""

    for i in user_input:
        if i in vowels:
            occurrences += i

    print("vowels:", ", ".join(occurrences))


print_vowels()

