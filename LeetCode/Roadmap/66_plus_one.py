class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        digits

        index, carry = len(digits)-1, 1

        while carry:
            if index >= 0:
                if digits[index] == 9:
                    digits[index] = 0
                else:
                    digits[index] += carry
                    carry = 0
            else:
                digits.insert(0, carry)
                carry = 0
 
            index-=1

        return digits
