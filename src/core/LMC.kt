package core

/**
 * 小伙计
 *
 * 在各个模块之间传递值；
 * 在特定指令中能够设置程序计数器[PC]的值
 */
class LMC(private val pc: PC) {

    private var value = 0
    private var pcValue = 0

    fun take(value: Int) {
        this.value = value
    }

    fun getValue(): Int {
        return value
    }

    fun takePCValue(pcValue: Int) {
        this.pcValue = pcValue
    }

    fun getPCValue(): Int {
        return pcValue
    }

    fun changePC(value: Int){
        pc.set(value)
    }
}