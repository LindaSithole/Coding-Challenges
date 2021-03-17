
def hours_into_minutes():

    number = int(input("Please Enter Number:"))
    hour = number // 60
    hr = str(hour)
    minute = number % 60
    mnt = str(minute)

    if number <= 120 and minute <= 1:
        return hr + "hour," + mnt + "minute"

    elif number <= 120 and minute > 1:
         return hr + "hour," + mnt + "minute"

print(hours_into_minutes())
