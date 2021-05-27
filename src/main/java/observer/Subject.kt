package observer

/**
 *
 *author: renbing
 *
 *date: 2021/5/27
 *
 *des: 订阅者接口类，定义共同特征
 */
interface Subject {

    /**
     * 增加一个观察者
     */
    fun add(observer: Observer)

    /**
     * 删除一个观察者
     */
    fun delete(observer: Observer)

    /**
     * 通知所有观察者
     */
    fun notifyObservers()

    /**
     * 自身将要执行的操作
     */
    fun operation()
}