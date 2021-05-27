import abstract_factory.BlackFactory
import abstract_factory.WhiteFactory
import factory.AnimalFactory
import observer.MySubject
import observer.ObserverOne
import observer.ObserverTwo
import observer.Subject
import proxy.Proxy
import proxy.RealSubject
import singleton.*
import strategy.Add
import strategy.Multiplicate
import strategy.OperationStrategy
import strategy.Subtract
import kotlin.concurrent.thread

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
        //单例模式
        println(HungrySingleton)//饿汉式
        println(HungrySingleton)
        println(HungrySingleton)
        thread { println(LazySingleton.get()) }//线程不安全的懒汉式
        thread { println(LazySingleton.get()) }
        thread { println(LazySingleton.get()) }
        thread { println(SafeLazySingleton.get()) }//线程安全的懒汉式
        thread { println(SafeLazySingleton.get()) }
        thread { println(SafeLazySingleton.get()) }
        println(DoubleCheckSingleton.instance)//双重锁检验
        println(DoubleCheckSingleton.instance)
        println(DoubleCheckSingleton.instance)
        println(StaticInnerSingleton.instance)//静态内部类
        println(StaticInnerSingleton.instance)
        println(StaticInnerSingleton.instance)
        //观察者模式
        val subject = MySubject()//实例化订阅者
        subject.add(ObserverOne())//添加观察者
        subject.add(ObserverTwo())
        subject.operation()//执行自身的操作
        //代理模式
        val proxy = Proxy(RealSubject())
        proxy.request()
    }
}