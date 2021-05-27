package observer

/**
 *
 *author: renbing
 *
 *date: 2021/5/27
 *
 *des: 订阅者抽象类
 */
abstract class AbstractSubject : Subject{
    private val mObservers = arrayListOf<Observer>()

    override fun add(observer: Observer) {
        mObservers.add(observer)
    }

    override fun delete(observer: Observer) {
        if (mObservers.isEmpty()) return
        mObservers.remove(observer)
    }

    override fun notifyObservers() {
        mObservers.forEach {
            it.update()
        }
    }
}