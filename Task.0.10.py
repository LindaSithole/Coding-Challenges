def match_up(first_word, second_word):
    
    
    first_input_values = ""
    second_input_values= ""

    for i in first_word:
        first_input_values += i
    for i in second_word:
         second_input_values += i


    first_elements = ""

    for i in first_word:
        if i in second_input_values:
            first_elements += i
    print("First Match Ups:", ", ".join(first_elements))

    
    second_elements = ""

    for i in second_word:
        if i in first_input_values:
            second_elements += i
    print("Second Match Ups:", ", ".join (second_elements))

match_up("strong", "strange")
