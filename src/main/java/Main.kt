import abstract_factory.BlackFactory
import abstract_factory.WhiteFactory
import factory.AnimalFactory
import strategy.Add
import strategy.Multiplicate
import strategy.OperationStrategy
import strategy.Subtract

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        //工厂模式
        AnimalFactory.createCat().sound()
        AnimalFactory.createDog().sound()
        //抽象工程模式
        WhiteFactory().provider().color()
        BlackFactory().provider().color()
        //策略模式
        println("1+2=${OperationStrategy(Add()).operation(1,2)}")
        println("1-2=${OperationStrategy(Subtract()).operation(1,2)}")
        println("1x2=${OperationStrategy(Multiplicate()).operation(1,2)}")
    }
}