import java.math.BigInteger

fun main() {
    var numerator = BigInteger.valueOf(3L)
    var denominator = BigInteger.TWO

    var countOfFractionsWithMoreDigitsInTheNumerator = 0
    (1..1_000).forEach { _ ->
        if (numeratorHasMoreDigits(numerator, denominator)) {
            countOfFractionsWithMoreDigitsInTheNumerator++
        }

        val newDenominator = numerator.add(denominator)
        val newNumerator = newDenominator.add(denominator)
        denominator = newDenominator
        numerator = newNumerator
    }

    println(countOfFractionsWithMoreDigitsInTheNumerator)
}

fun numeratorHasMoreDigits (numerator: BigInteger, denominator: BigInteger) =
    numerator.toString().length > denominator.toString().length