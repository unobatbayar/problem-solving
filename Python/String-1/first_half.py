"""


Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


first_half('WooHoo') → 'Woo'
first_half('HelloThere') → 'Hello'
first_half('abcdef') → 'abc'

@author unobatbayar
"""
def first_half(str):
  half = len(str)/2
  return str[:half]
