import model.Task

fun main(args: Array<String>) {
    // knowledge bank
    // The system should automatically create an id for the tasks

    // I am a user and I have a task to create
    // by command first before cli
    // CREATE
    val taskOne = Task("one", "exercise", "Dogging at 5am")
    // create multiple task and store it on a data structure and see if you can read from it
    val taskTwo = Task("two", "fashion", "Learn To Dress As A Man")
    val taskThree = Task("three", "Hygiene", "Environmental Sanitation")
    val taskFour = Task("four", "Relationship", "Building Communication Skills")
    val taskFive = Task("five", "Parenting", "Kalu Parenting Session")
    // add all these to a mutablelist
    val allTask = mutableListOf<Task>()
    allTask.add(taskOne)
    allTask.add(taskTwo)
    allTask.add(taskThree)
    allTask.add(taskFour)
    allTask.add(taskFive)
    // print out all the tasks
    println(allTask)
    // READ
    // use forloop to print out task name
    /*
    for (i in allTask.indices){
        println("#${i + 1} ${allTask[i].taskName}")
    }

     */
    read(allTask)
    println("")
//    print("")
    // DELETE FROM THE STORAGE
    // what do I use as a key to identify my item, I want to eliminate
    // create a method, that uses the name to search if item is present, if present, remove from storage.
    // call the delete function
    // what is my selection
    val itemSelected = "Parenting"
    delete(itemSelected, allTask)
    // read the storage
    read(allTask)

    // update
    // this update is designed to
}

fun read(tasks:MutableList<Task>){
    for (i in tasks.indices){
        println("#${i + 1} ${tasks[i].taskName}")
    }
}

/**
 * delete function
 */
fun delete(item:String, tasks:MutableList<Task>){
    // search for this item in the given list
    // use a forloop and search the item
    for (taskItemIndex in tasks.indices){
        if (tasks[taskItemIndex].taskName == item){
            // remove item from the storage
            // get the index of this item
            val taskIndex = taskItemIndex
            // remove the item from storage
            tasks.remove(tasks[taskItemIndex])

        }
    }
}