package core

/**
 * 计算器：支持加减，能保存一个值
 */
class Calculator {

    private var value: Int = 0

    fun add(lmc: LMC) {
        value += lmc.getValue()
    }

    fun sub(lmc: LMC) {
        value -= lmc.getValue()
    }

    fun getValue(lmc: LMC) {
        lmc.take(value)
    }

    fun setValue(lmc: LMC) {
        this.value = lmc.getValue()
    }

}