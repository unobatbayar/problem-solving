"""
Given two strings, return True if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: s.lower() returns the lowercase version of a string.

end_other('Hiabc', 'abc') → True
end_other('AbC', 'HiaBc') → True
end_other('abc', 'abXabc') → True

@author 
"""
def end_other(a, b):
  if len(a) > 1:
    last_a = a[len(a)-2] + a[len(a)-1]
    last_b = b[len(b)-2] + b[len(b)-1]
    if last_a.lower() == last_b.lower():
      return True
    return False
  last_a = a[len(a)-1]
  last_b = b[len(b)-1]
  if last_a.lower() == last_b.lower():
    return True
  return False
  
  #after getting the hint, In Python s1.endswith(s2) tests if string s1 ends with string s2 -- makes this much easier!
  #really understoon now, won't make mistake like this next time
