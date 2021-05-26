package abstract_factory

/**
 *
 *author: renbing
 *
 *date: 2021/5/26
 *
 *des: 对象工厂类，实现对象提供接口，生成相应的对象，
 *     当需要创建新的类型对象时，实现对象提供接口就行，体现闭包原则
 */
class WhiteFactory : ColorProvider {

    override fun provider():Color {
        return White()
    }
}