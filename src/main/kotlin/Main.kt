import java.sql.Struct
import kotlin.random.Random

import kotlin.random.nextInt

fun main() {

    /*val numLetters = "Mississippi".count { it == 's' }
    println(numLetters)*/

    //---------------------------------

    //5.1 -> Defining an anonymous greeting function
    /*println({
        val currentYear= 2018
        "Welcome to SimVillage, Mayor! (copyright $currentYear)"
    }()
    )
    */

    //---------------------------------

    //5.2 -> Assigning the anonymous function to a variable
    /*val greetingFunction: ()->String ={
        val currentYear=2018
        "Welcome to SimVillage, Mayor! (copyright $currentYear)"
    }
      println(greetingFunction())
    */

    //---------------------------------

    //5.3 -> Adding a playerName parameter to the anonymous function
    /*val greetingFunction: (String)->String={ playerName->
        val currentYear=2018
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
        println(greetingFunction("Rahaf"))
    }*/

    //---------------------------------

    //5.4 -> Using the it keyword
    /*val greetingFunction: (String) -> String = {
        val currentYear = 2018
        "Welcome to SimVillage, $it! (copyright $currentYear)"
    }
    println(greetingFunction("Rahaf"))
    */

    //---------------------------------

    //5.5 -> Accepting a second argument
    /*val greetingFunction: (String,Int)-> String={playerName,numBuildings->
        val currentYear=2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("Rahaf",2))
*/

    //---------------------------------

    //5.6 -> Using type inference for greetingFunction
    /*val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("Rahaf",2))
    */

    //---------------------------------

    //5.7 -> Adding the runSimulation function
    /*val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    println(runSimulation("Rahaf", greetingFunction))*/

    //---------------------------------

    //5.8 -> Passing a trailing lambda
    /*runSimulation("Rahaf") { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }*/

    //---------------------------------

    //5.12 -> Passing a function reference
    /*runSimulationInline("Rahaf", ::printConstructionCost) { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }*/

    //---------------------------------

    //5.13 -> Adding the configureGreetingFunction function
    runSimulationReruenFun()

}

fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuilding: Int = Random.nextInt(1..3)
    println(greetingFunction(playerName, numBuilding))
}

//5.9 -> Using the inline keyword
//5.11-> Adding a costPrinter parameter
inline fun runSimulationInline(
    playerName: String,
    costPrinter: (Int) -> Unit,
    greetingFunction: (String, Int) -> String
) {
    val numBuilding: Int = Random.nextInt(1..3)
    println(numBuilding)
    println(greetingFunction(playerName, numBuilding))
}


//return function type
fun runSimulationReruenFun() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Rahaf"))
}

//5.10 -> Defining the printConstructionCost function
//I will call it by reference by using :: operation
fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}

//5.13-> Adding the configureGreetingFunction function
fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospital"
    var numBuildings = 5
    return { playerName ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"

    }
}