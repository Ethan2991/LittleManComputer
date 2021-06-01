package instruction

import IContext
import core.Instruction

class BR(value: Int, op: Int) : Instruction(value, op) {
    override fun exec(context: IContext) {
        context.getLMC().changePC(value)
    }
}