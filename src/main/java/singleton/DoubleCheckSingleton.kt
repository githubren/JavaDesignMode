package singleton

/**
 *
 *author: renbing
 *
 *date: 2021/5/27
 *
 *des:双重锁校验单例模式
 *
 * java:
 * class DoubleCheckSingleton{
 *     private static DoubleCheckSingleton instance;
 *
 *     public static DoubleCheckSingleton getInstance(){
 *         if(instance == null){
 *             synchronized(DoubleCheckSingleton.class){
 *                 if(instance == null){
 *                     instance = new DoubleCheckSingleton();
 *                 }
 *             }
 *         }
 *         return instance;
 *     }
 * }
 */
class DoubleCheckSingleton {

    companion object{
        val instance by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) { DoubleCheckSingleton() }
    }
}