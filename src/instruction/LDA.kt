package instruction

import IContext
import core.Instruction

class LDA(value: Int, op: Int) : Instruction(value, op) {
    override fun exec(context: IContext) {
        val lmc = context.getLMC()
        lmc.take(value)
        context.getMailBox().getValue(lmc)
        context.getCalculator().setValue(lmc)
    }
}