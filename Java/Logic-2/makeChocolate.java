/*
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
*/
public int makeChocolate(int small, int big, int goal) {
    int use_big = 0;
    int use_small = 0;
    
    for(int i = 1; i <= big; i++){
      if(i*5 > goal) break;
      use_big = i;
    }
    use_small = goal - use_big*5;
    if(use_small > small) return -1;
    
    return use_small;
  }
  