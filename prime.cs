using)
{
    
}

class prime{
    
    static void main(String[] args) {
        Console.Write(prime(18));
    }

    public static void factors(int n)
    {
        int[] factors = {};
        for(int i = 0; i < 5; i++)
        {
            if (n % i == 0)
            {
                factors.add(i);
            };
        }
        return factors;
    }
}