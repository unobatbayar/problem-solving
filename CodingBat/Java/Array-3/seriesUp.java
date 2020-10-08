/*
Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]
@author unobatbayar
*/

public int[] seriesUp(int n) {
  
    ArrayList<Integer> patternList = new ArrayList<Integer>();
    
    for(int i = 1; i <= n; i++){
      for(int k = 1; k <= i; k++){
        patternList.add(k);
      }
    }
    
    int[] patternArray = new int[patternList.size()];
    
    for(int i = 0; i<patternArray.length; i++){
      patternArray[i] = patternList.get(i);
    }
    
    return patternArray;
  }
  