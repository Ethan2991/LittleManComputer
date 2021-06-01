package core

import IContext

/**
 * 指令
 * 子类通过 [exec] 来实现具体操作
 *
 * @param op 指令的第一位, 可能是地址也可能和 value 组成一个数值
 * @param value 指令的后两位，可能是地址也可能和 op 组成一个数值
 */
abstract class Instruction(val op: Int, val value: Int) {
    abstract fun exec(context: IContext)
}