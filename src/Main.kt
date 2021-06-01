import core.IO
import core.MailBox
import core.Computer

fun main() {
    test(listOf(1, 4), mapOf(
        0 to 901,
        1 to 310,
        2 to 901,
        3 to 311,
        4 to 210,
        5 to 808,
        6 to 510,
        7 to 211,
        8 to 902,
        9 to 0
    ), "test01")


    test(listOf(100, 4), mapOf(
        0 to 901,
        1 to 399,
        2 to 901,
        3 to 199,
        4 to 902,
        5 to 0
    ), "test02")

}

fun test(inputValues: List<Int>, program: Map<Int, Int>, tag: String){
    val input = IO()
    input.init(inputValues)

    val mailBox = MailBox()
    mailBox.initBoxes(program)

    val room = Computer(input, mailBox)
    when (val result = room.run()){
        is Result.Success -> {
            println("$tag result: ${result.io.getContentStr()}")
        }
        is Result.Error -> {
            println("$tag error: ${result.msg}")
        }
    }
}