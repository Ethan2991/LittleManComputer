package instruction

import IContext
import core.Instruction

class BRZ(value: Int, op: Int) : Instruction(value, op) {
    override fun exec(context: IContext) {
        val lmc = context.getLMC()
        context.getCalculator().getValue(lmc)
        if (lmc.getValue() == 0){
            lmc.changePC(value)
        }
    }
}