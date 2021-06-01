import core.*

interface IContext {
    fun getInput(): IO
    fun getOutput(): IO
    fun getPC(): PC
    fun getLMC(): LMC
    fun getMailBox(): MailBox
    fun getCalculator(): Calculator
    fun stop()
}