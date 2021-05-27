package observer

/**
 *
 *author: renbing
 *
 *date: 2021/5/27
 *
 *des: 观察者二号
 */
class ObserverTwo : Observer{
    override fun update() {
        println("ObserverTwo has received")
    }
}