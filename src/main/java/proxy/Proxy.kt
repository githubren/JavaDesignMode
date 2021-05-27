package proxy

/**
 *
 *author: renbing
 *
 *date: 2021/5/27
 *
 *des: 代理类
 * 代理模式可以理解为：代理在委托的基础上新增了一些自己的操作，外部可以调用委托的内容，同时得到了代理的拓展
 */
class Proxy(val subject: Subject) : Subject{

    override fun request() {
        println("我是代理类，我被调用")
        subject.request()
    }
}