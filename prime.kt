object prime {
    @JvmStatic
    fun main(args: Array<String>) {
        println(largest_prime(300000))
    }

    fun factors(n: Int): List<Int> {
        val factors: MutableList<Int> = java.util.ArrayList<Int>()
        for (i in 1..n) {
            if (n % i == 0) {
                factors.add(i)
            }
        }
        return factors
    }

    fun isPrime(n: Int): Boolean {
        return if (factors(n).size == 2) {
            true
        } else {
            false
        }
    }

    fun largest_prime(n: Int): Int {
        var largest_prime = 2
        for (i in 199999..n) {
            if (isPrime(i) == true) {
                largest_prime = i
            }
        }
        return largest_prime
    }
}