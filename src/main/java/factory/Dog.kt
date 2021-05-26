package factory

/**
 *
 * author： renbing
 *
 * date： 2021/05/26
 *
 * des： 共同特征接口实现类，实现自己独有的特征
 */
class Dog : Animal {

    override fun sound() {
        println("我是小狗，汪！")
    }
}