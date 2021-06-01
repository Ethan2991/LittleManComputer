package instruction

import IContext
import core.Instruction

class COB(value: Int, op: Int) : Instruction(value, op) {
    override fun exec(context: IContext) {
        context.stop()
    }
}