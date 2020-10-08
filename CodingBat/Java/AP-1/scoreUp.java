/*
The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers" array contains a student's answers, with "?" representing a question left blank. The two arrays are not empty and are the same length. Return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.

scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16

@author unobatbayar
*/

public int scoreUp(String[] key, String[] answers) {
    //+4 correct -1 incorrect 0 blank
    int score = 0;
    for(int i = 0; i <key.length; i++){
      if(answers[i] == key[i]) score += 4;
      else if(answers[i].equals("?")) score += 0;
      else score -= 1;
    }
    return score;
    
  }
  