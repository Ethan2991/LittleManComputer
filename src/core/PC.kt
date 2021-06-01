package core

/**
 * 程序计数器
 *
 * 指引小伙计 [LMC] 去邮箱[MailBox] 的哪个位置找下一个指令
 * 每次[get] 后要+1 [up]
 */
class PC {
    private var counter = 0

    fun get(lmc: LMC) {
        lmc.takePCValue(counter)
    }

    fun up() {
        counter += 1
    }

    fun reset() {
        counter = 0
    }

    fun set(num: Int) {
        counter = num
    }

}