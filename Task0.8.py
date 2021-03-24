
def hours_into_minutes(number):

    hour = number // 60
    minute = number % 60

    time = ("{0} hour{1}, ".format(hour, "s" if hour != 1 else "") if hour else "") + \
           ("{0} minute{1} ".format(minute, "s" if minute != 1 else "") if minute else "")


    return time

print(hours_into_minutes(124587))


