"""
Given a non-empty string like "Code" return a string like "CCoCodCode".

string_splosion('Code') → 'CCoCodCode'
string_splosion('abc') → 'aababc'
string_splosion('ab') → 'aab'

@author unobatbayar

"""
def string_splosion(str):
  test = ""
  for x in range(1, len(str)-2):
    test = test + str[:x+2]
  if len(str) == 1:
    return str
  elif len(str) == 2:
    return str[0] + str
  return str[:1]*2 + str[1:2] + test + str
