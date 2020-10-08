"""
Return True if the string "cat" and "dog" appear the same number of times in the given string.

cat_dog('catdog') → True
cat_dog('catcat') → False
cat_dog('1cat1cadodog') → True

@unobatbayar
"""
def cat_dog(str):
  count_dog = 0
  count_cat = 0
  
  #search cats/dogs and count the number of times
  for i in range(len(str)-2):
    if str[i:i+3] == "dog":
      count_dog = count_dog + 1
    if str[i:i+3] == "cat":
      count_cat = count_cat + 1  
      
  #match the number of times    
  if count_dog == count_cat:
    return True
  return False


