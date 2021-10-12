fun main(){
        //By @RahafNasser-c
        /*The performance rating here is being entered as a String-the three possible ratings are "Excellent",
        "Good", and "Poor". An employee who is rated excellent will receive a 6% raise, one rated good
        will receive a 4% raise, and one rated poor will receive a 1.5% raise.
        */
    println("This program calc salary raise")
    println("Enter your salary")
    var salary= readLine()?.toDouble()
    println("Enter your performance rating (1=excellent, 2=good, and 3=poor)")
    var performance= readLine()

    var newSalary:Double?=salary

    if(performance.equals("1")){
        newSalary=newSalary!!*1.6
        println("Your new salary ${"%.4f".format(newSalary)}")
    }else if(performance.equals("2")){
        newSalary=newSalary!!*1.4
        println("Your new salary ${"%.4f".format(newSalary)}")
    }else if(performance.equals("3")){
        newSalary=newSalary!!*1.15
        println("Your new salary ${"%.4f".format(newSalary)}")
    }else{
        println("Please enter the right performance rating (1=excellent, 2=good, and 3=poor)")
    }

    //By using when statement
    /*
    when(performance){
        "1"->{
            newSalary=newSalary!!*1.6
            println("Your new salary ${"%.4f".format(newSalary)}")
        }
        "2"->{
            newSalary=newSalary!!*1.4
            println("Your new salary ${"%.4f".format(newSalary)}")
        }
        "3"->{
            newSalary=newSalary!!*1.15
            println("Your new salary ${"%.4f".format(newSalary)}")
        }
        else->{
            println("Please enter the right performance rating (1=excellent, 2=good, and 3=poor)")
        }

    }
    */

    println("End of program")

}