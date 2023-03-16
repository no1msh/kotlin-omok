package omok.view

import omok.model.stone.Coordinate

object InputView {
    fun getCoordinate(): Coordinate {
        val input = readln().trim()
        return runCatching {
            Coordinate(input)
        }.getOrElse {
            println(it.message)
            getCoordinate()
        }
    }
}
