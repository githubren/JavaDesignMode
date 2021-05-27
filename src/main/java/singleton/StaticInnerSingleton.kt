package singleton

/**
 *
 *author: renbing
 *
 *date: 2021/5/27
 *
 *des: 静态内部类单例模式
 *
 * java:
 * class StaticInnerSingleton{
 *     private static class SingletonHolder{
 *         private static StaticInnerSingleton instance = new StaticInnerSingleton();
 *     }
 *
 *     public static StaticInnerSingleton getInstance(){
 *          return SingletonHolder.instance;
 *     }
 * }
 */
class StaticInnerSingleton {

    private object SingletonHolder{
        val holder = StaticInnerSingleton()
    }

    companion object{
        val instance = SingletonHolder.holder
    }
}