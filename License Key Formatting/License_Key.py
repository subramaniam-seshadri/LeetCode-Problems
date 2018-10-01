import re
def licenseKeyFormatting(S, K):
    """
    :type S: str
    :type K: int
    :rtype: str
    """
    S = re.sub("\-", '', S).upper()
    print(S)
    n = len(S) % 2
    if n == 0:
        print("Equal sizes of K blocks")
        t = ''
        for i in range(n, len(S) - n, K):
            t += S[i:i + K] + '-'
        t = t.rstrip('-')
        print(t)
        return t
    else:
        print("First block is of size :", n)
        t = S[:n]
        for i in range(n,len(S)-n,K):
            t += '-' + S[i:i+K]
        print(t)
        return t



