import core.IO

sealed class Result {
    class Error(val msg: String) : Result()
    class Success(val io: IO) : Result()
}