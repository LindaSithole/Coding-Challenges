
def hours_into_minutes(number):

  
    hour = number // 60
    hr = str(hour)
    minute = number % 60
    mnt = str(minute)

    if number <= 60 and minute <= 1:
        print(hr + "hour," + mnt + "minute")

    elif number >= 60 and minute >= 1:
        print(hr + "hour," + mnt + "minute")
              

hours_into_minutes(71)
