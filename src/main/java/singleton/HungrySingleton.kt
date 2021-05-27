package singleton

/**
 *
 *author: renbing
 *
 *date: 2021/5/27
 *
 *des: kotlin中单例模式饿汉式写法
 *
 * java:
 * class HungrySingleton{
 *     public static HungrySingleton instance = new HungrySingleton();
 *
 *     public static HungrySingleton getInstance(){
 *         return instance;
 *     }
 *
 * }
 */
object HungrySingleton {

    init {
        println("初始化")
    }

    fun test(){
        println("测试kotlin中单例模式饿汉式写法")
    }
}