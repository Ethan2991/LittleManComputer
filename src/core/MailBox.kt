package core

/**
 * 邮箱
 *
 * 1.用来预存程序指令
 * 2.在程序运行时用来保存值
 */
class MailBox {

    private val boxes = IntArray(100)

    fun getValue(lmc: LMC) {
        lmc.take(boxes[lmc.getValue()])
    }

    fun getValueByPc(lmc: LMC): Int {
        return boxes[lmc.getPCValue()]
    }

    fun setValue(lmc: LMC) {
        boxes[lmc.getPCValue()] = lmc.getValue()
    }

    fun initBoxes(program: Map<Int, Int>) {
        program.forEach { (t, u) ->
            boxes[t] = u
        }
    }
}