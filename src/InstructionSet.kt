import core.Instruction
import instruction.*

object InstructionSet {

    private val instructionSet = mutableMapOf<Int, Class<*>>(
        0 to COB::class.java,
        1 to ADD::class.java,
        2 to SUB::class.java,
        3 to STO::class.java,
        5 to LDA::class.java,
        6 to BR::class.java,
        7 to BRZ::class.java,
        8 to BRP::class.java,
        9 to IO::class.java
    )

    fun createInstruction(value: Int): Instruction? {
        val op = value / 100
        val clazz = instructionSet[op]
        return clazz?.getConstructor(Int::class.java, Int::class.java)?.run {
            newInstance(op, value % 100)
        } as? Instruction
    }
}