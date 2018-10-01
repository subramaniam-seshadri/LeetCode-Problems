def convertStoT(S,T):
    '''
        This function converts the given source string to target string
    '''
    if(len(S)<len(T)):
       return False
    elif len(S) == len(T):
       if (S == T):
           return True
    else:
        try:
            k = 0
            result = ''
            for i in S:
                if(i == T[k] and k <len(T)):
                    result += i
                    k += 1
                else:
                    continue
            if result == T:
                return True
            else:
                return False
                
        except:
            print("Exception")

S = "abcccadbc"
T = "abac"

print(convertStoT(S,T))


       

