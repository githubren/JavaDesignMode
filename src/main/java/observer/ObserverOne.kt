package observer

/**
 *
 *author: renbing
 *
 *date: 2021/5/27
 *
 *des: 观察者一号
 */
class ObserverOne : Observer{

    override fun update() {
        println("ObserverOne has received")
    }
}