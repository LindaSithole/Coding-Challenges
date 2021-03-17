def match_up():
    
    first_input = input("Please Enter The First Word:" )
    second_input = input("Please Enter The Second Word:" )
    first_input_values = ""
    second_input_values= ""

    for i in first_input:
        first_input_values += i
    for i in second_input:
         second_input_values += i


    first_elements = ""

    for i in first_input:
        if i in second_input_values:
            first_elements += i
    print("First Match Ups:", ", ".join(first_elements))

    
    second_elements = ""

    for i in second_input:
        if i in first_input_values:
            second_elements += i
    print("Second Match Ups:", ", ".join (second_elements))

match_up()