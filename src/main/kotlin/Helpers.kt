fun studentInfo(firstName:String, lastName:String, GPA:Double, major:String){
    println(firstName+" "+lastName+" |\t"+GPA+" |\t"+major)
    addNumberOfStudents()
}

fun startProgram(){
    println("\nWelcome to the students record!\n")
    println("Student name |\t GPA |\t Major \t ")
    println("------------------------------------------")
}

fun endProgram(){
    println("\n-Changes saved.")
}

fun addNumberOfStudents(){
    student++
}
fun numberOfStudents(){
    println("------------------------------------------\n")
    println("-Number of students is $student")
}