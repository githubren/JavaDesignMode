package strategy

/**
 *
 *author: renbing
 *
 *date: 2021/5/26
 *
 *des:
 */
class Subtract : Operation {

    override fun operation(num1: Int, num2: Int): Int {
        return num1 - num2
    }
}