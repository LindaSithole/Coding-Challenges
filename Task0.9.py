def print_vowels(word):


    vowels = "a", "e", "i", "o", "u"
    occurrences = ""

    for i in word:
        if i in vowels:
            occurrences += i

    print("vowels:", ", ".join(occurrences))


print_vowels("Umuzi")

