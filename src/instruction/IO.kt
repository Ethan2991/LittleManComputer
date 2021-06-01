package instruction

import IContext
import core.Instruction

class IO(value: Int, op: Int) : Instruction(value, op) {
    override fun exec(context: IContext) {
        val lmc = context.getLMC()
        when (value) {
            1 -> {
                context.getInput().pop(lmc)
                context.getCalculator().setValue(lmc)
            }
            2 -> {
                context.getCalculator().getValue(lmc)
                context.getOutput().push(lmc)
            }
        }
    }
}