fun main(){
    println("Story Maker 3000")
    println("----------------")
    val userName = getString("Please enter a person's name: ")
    val gender = getString("Is this person a he or she?: ")
    val otherName = getString("Please enter a another person's name: ")
    val firstVerb = getString("Please enter a verb ending in 'ing': ")
    val secondVerb = getString("Please enter a verb ending in 'ed': ")
    val newObject =  getString("Please enter an object: ")
    val animal = getString("Please enter an animal: ")

    println("Okay here is your story......")
    println()
    println("$userName was walking down the road when $gender bumped into\n" +
            "$otherName who was $firstVerb a $newObject.\n" +
            "'Woah, dude! Those are some awesome skills!', said $userName as he $secondVerb.")
}


fun getString(prompt: String): String{
    var userInput: String
    while (true){
        print(prompt)
        userInput = readln()
        if (userInput.isNotBlank()) break
    }
    return userInput
}