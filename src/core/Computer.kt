package core

import IContext
import Result

class Computer(private val input: IO, private val mailBox: MailBox) : IContext {

    private val pc = PC()
    private val lmc = LMC(pc)
    private val output = IO()
    private val calculator = Calculator()
    private var running = true

    fun run(): Result {
        while (running) {
            pc.get(lmc)
            pc.up()
            val value = mailBox.getValueByPc(lmc)
            val instruction = InstructionSet.createInstruction(value)
                ?: return Result.Error("Without this instruction : $value")
            instruction.exec(this)
        }

        return Result.Success(output)
    }

    override fun getInput(): IO = input
    override fun getOutput(): IO = output
    override fun getPC(): PC = pc
    override fun getLMC(): LMC = lmc
    override fun getMailBox(): MailBox = mailBox
    override fun getCalculator(): Calculator = calculator

    override fun stop() {
        running = false
    }
}