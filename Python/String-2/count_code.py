"""
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

count_code('aaacodebbb') → 1
count_code('codexxcode') → 2
count_code('cozexxcope') → 2

@author unobatbayar
"""

def count_code(str):
  counter = 0
  #we can ingore third substring 'd' because it can by any letter
  for i in range(len(str)-3):
    if str[i:i+2] == "co" and str[i+3] == "e":
        counter = counter + 1
  return counter
  
  #we can put 'code', 'cope' and 'cooe' etc in array so we can search in double loop
  #but is not efficient, it's just another way of doing it
