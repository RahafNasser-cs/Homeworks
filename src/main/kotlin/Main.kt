fun main(){
        //By @RahafNasser-c
        /*The performance rating here is being entered as a String-the three possible ratings are "Excellent",
        "Good", and "Poor". An employee who is rated excellent will receive a 6% raise, one rated good
        will receive a 4% raise, and one rated poor will receive a 1.5% raise.
        */
    println("This program calc salary raise")
    println("Enter your salary")
    var salary= readLine()?.toDouble()
    println("Enter your performance (Excellent, Good or Poor)")
    var performance= readLine()

    var newSalary:Double?=salary

    when(performance){
        "Excellent"->{
            newSalary=newSalary!!*1.6
            println("Your new salary ${"%.4f".format(newSalary)}")
        }
        "Good"->{
            newSalary=newSalary!!*1.4
            println("Your new salary ${"%.4f".format(newSalary)}")
        }
        "Poor"->{
            newSalary=newSalary!!*1.15
            println("Your new salary ${"%.4f".format(newSalary)}")
        }
        else->{
            println("Please enter the right performance (Excellent, Good or Poor)")
        }

    }

    println("End of program")

}