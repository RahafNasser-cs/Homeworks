import java.lang.Exception
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    var swordsJuggling: Int?=null
    //val isJugglingProficient= Random.nextInt(1..3)==0
    val isJugglingProficient= Random.nextInt(1..3)
    if (isJugglingProficient in 1 until 3)
        swordsJuggling=2

    try {
        swordsJuggling= swordsJuggling!!.plus(1)
    }catch(e:Exception){
        println(e)
    }
    println("You juggle $swordsJuggling swords!")
}