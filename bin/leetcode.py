class Solution:
    def isPalindrome(self, x) -> bool:

        i = str(x)[::-1]

        try:

            i_int = int(i)

            return (i_int == (x))
        except ValueError:
            return False
        