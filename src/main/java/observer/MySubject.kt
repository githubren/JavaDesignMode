package observer

/**
 *
 *author: renbing
 *
 *date: 2021/5/27
 *
 *des: 订阅者实现类，订阅者本身发生改变后，调用notifyObservers函数通知观察者
 */
class MySubject : AbstractSubject(){
    override fun operation() {
        println("update self")
        notifyObservers()
    }
}