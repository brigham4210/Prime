def prime(n):
    factors = [i for i in range(1, 2**(n)-1) if n % i == 0]
    print(n)
    
    return True if len(factors) == 2 else False

def largest_prime(n):
    
    # numbers = [i for i in range(1, n+1) if prime(i) == True]
    # number = numbers[-1]
    
    for i in range(1, 2**n-1, 2):
        if prime(i) == True:
            number = i


    print(f"{number} is the largest prime.")

largest_prime(30)