package proxy

/**
 *
 *author: renbing
 *
 *date: 2021/5/27
 *
 *des: 委托类
 */
class RealSubject : Subject{

    override fun request() {
        println("我是委托类")
    }
}