package strategy

/**
 *
 *author: renbing
 *
 *date: 2021/5/26
 *
 *des:
 */
class OperationStrategy(val strategy: Operation) {

    fun operation(num1: Int,num2: Int): Int{
        return strategy.operation(num1, num2)
    }
}