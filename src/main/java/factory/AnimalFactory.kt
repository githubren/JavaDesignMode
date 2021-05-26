package factory

/**
 *
 * author： renbing
 *
 * date： 2021/05/26
 *
 * des： 工厂类，生成不同的对象
 */
class AnimalFactory {

    companion object{

        fun createCat(): Animal {
            return Cat()
        }

        fun createDog(): Animal {
            return Dog()
        }
    }
}