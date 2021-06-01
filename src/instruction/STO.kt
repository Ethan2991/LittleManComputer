package instruction

import IContext
import core.Instruction

class STO(value: Int, op: Int) : Instruction(value, op) {
    override fun exec(context: IContext) {
        val lmc = context.getLMC()
        context.getCalculator().getValue(lmc)
        lmc.takePCValue(value)
        context.getMailBox().setValue(lmc)
    }
}