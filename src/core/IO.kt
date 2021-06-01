package core

import java.util.*

/**
 * IO 模块
 */
open class IO {
    private val list = LinkedList<Int>()

    fun pop(lmc: LMC) {
        lmc.take(list.pop())
    }

    fun init(values: List<Int>) {
        list.addAll(values)
    }

    fun push(lmc: LMC) {
        list.push(lmc.getValue())
    }

    fun getContentStr(): String {
        return list.toString()
    }
}