package abstract_factory

/**
 *
 *author: renbing
 *
 *date: 2021/5/26
 *
 *des:对象提供接口类，对象工厂类实现这个接口生成不同的对象，体现闭包原则，对现有的类不更改
 */
interface ColorProvider {

    fun provider():Color
}