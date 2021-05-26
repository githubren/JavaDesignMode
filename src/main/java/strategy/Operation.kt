package strategy

/**
 *
 *author: renbing
 *
 *date: 2021/5/26
 *
 *des:
 */
interface Operation {

    fun operation(num1: Int, num2: Int): Int
}