class Solution(object):  
    INT_MIN = -2**31 
    INT_MAX = 2**31 - 1  

    def divide(self, dividend, divisor):  
        if dividend == self.INT_MIN and divisor == -1:  
            return self.INT_MAX  
             
        result = abs(dividend) // abs(divisor)  

        if (dividend < 0) ^ (divisor < 0):    
            result = -result  
        
        return result