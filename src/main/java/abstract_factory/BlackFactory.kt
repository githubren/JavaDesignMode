package abstract_factory

/**
 *
 *author: renbing
 *
 *date: 2021/5/26
 *
 *des:
 */
class BlackFactory : ColorProvider {

    override fun provider(): Color {
        return Black()
    }
}