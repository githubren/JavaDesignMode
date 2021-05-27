package singleton

/**
 *
 *author: renbing
 *
 *date: 2021/5/27
 *
 *des:kotlin中单例模式懒汉式写法
 *
 *java:
 * class LazySingleton{
 *     private static LazySingleton instance;
 *
 *     public static LazySingleton getInstance(){
 *         if(instance == null)
 *             instance = new LazySingleton();
 *         return instance;
 *     }
 *
 * }
 *
 */
class LazySingleton {

    companion object{
        private var instance: LazySingleton? = null
            get() {
                if (field == null)
                    field = LazySingleton()
                return field
            }

        fun get(): LazySingleton{
            return instance!!
        }
    }
}