"""
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

last2('hixxhi') → 1
last2('xaxxaxaxx') → 1
last2('axxxaaxx') → 2

@author unobatbayar

"""
def last2(str):
  def check():
    counter = 0
    last_two = str[len(str)-2] + str[len(str)-1]
    for x in range(0, len(str)-2):
      two_strings = str[x] + str[x+1]
      if two_strings == last_two:
        counter = counter + 1
    return counter

  #let's see if str is more than 2 then check  
  return 0 if len(str) < 2 else check() 



  
