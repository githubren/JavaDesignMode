package singleton

/**
 *
 *author: renbing
 *
 *date: 2021/5/27
 *
 *des: 线程安全的懒汉式单例模式  在线程不安全的懒汉式基础上，在获取实例的方法上添加@Synchronized注解
 *
 * java:
 * class SafeLazySingleton{
 *     private static SafeLazySingleton instance;
 *
 *     public static synchronized SafeLazySingleton getInstance(){
 *          if(instance == null)
 *              instance = new SafeLazySingleton();
 *          return instance;
 *     }
 * }
 */
class SafeLazySingleton {

    companion object{
        private var instance: SafeLazySingleton? = null
            get() {
                if (field == null)
                    field = SafeLazySingleton()
                return field
            }

        @Synchronized
        fun get(): SafeLazySingleton{
            return instance!!
        }
    }
}