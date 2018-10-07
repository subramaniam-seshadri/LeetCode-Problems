import time
def romanToInt(s):
    """
    :type s: str
    :rtype: int
    """
    mydict = {'I':1,'V':5, 'X':10,'L':50,'C':100,'D':500,'M':1000,'IV':4,'IX':9,'XL':40,'XC':90,'CD':400,'CM':900}
    result = 0
    checkChars = set(['I','X','C'])
    i=0
    while i<len(s):
        if s[i] in checkChars:
            if(i == len(s)-1):
                result += mydict[s[i]]
                return result
            if(s[i]+s[i+1] in mydict.keys()):
                result += mydict[s[i]+s[i+1]]
                i += 2
            else:
                result += mydict[s[i]]
                i += 1
        else:
            result += mydict[s[i]]
            i += 1
    return result

start_time = time.time()
print(romanToInt("MDCCCXCIV"))#o/p 1994
print("--- %s seconds ---" % (time.time() - start_time))

