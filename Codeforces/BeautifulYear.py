def isDistinct(year) -> int:   
    year+=1 
    year_duplicate = year

    seen = set()
    while(year_duplicate > 0):
        digit = year_duplicate % 10

        if digit in seen:
            return isDistinct(year)
        else:
            seen.add(digit)
        year_duplicate //=10

    return year


year = int(input())
print(isDistinct(year))