fun main(){
    //By @RahafNasser-c
    /*Write a Kotlin program that designs a calculator. The program should read from the user two integer numbers
     and a character which indicates the type of operation desired. +, -, *, / and %.*/
    println("This program calculates the arithmetic operations")
    var num1=10.0
    var num2=5.0
    var operation="%"
    //Or get inputs from the user
    /*
    println("Enter first number: ")
    var num1= readLine()!!.toDouble()
    println("Enter second number: ")
    var num2= readLine()!!.toDouble()
    println("Enter arithmetic operation: ")
    var operation= readLine()!!
     */

    var result:Double?

        when(operation){
        "+"-> {
            result= num1+ num2
            println("The result is ${result}")
        }
        "-"->{
            result=num1-num2
            println("The result is ${result}")
        }
        "*"->{
            result=num1*num2
            println("The result is ${result}")
        }
        "/"->{
            if(num2==0.0){
                println("cannot divide by 0, UNDEFINED")
            }else {
                result=num1/num2
                println("The result is ${result}")
            }
        }
        "%"->{
            result=num1%num2
            println("The result is ${result}")
        }
            //if the inputs from user
            /*
        else->{
            println("Enter the correct operation (+, -, *, /, %)")
        }

             */
    }

    println("End of program")
}




