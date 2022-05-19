import model.Task
import java.util.Scanner

fun main(args: Array<String>) {

    // add menu
    val scanner = Scanner(System.`in`)
    var isRunning = true
    while (isRunning){
        println(
            "This is a ToDo App\n\t1 View all my tasks\n\t2 Add task\n\t3 Delete tasks\n\t4 Update completed task\n\t5 Exit"
        )
        when(scanner.nextInt()){
            1-> {
                read()
            }
        }
    }

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
    println("----------- print all task")
    println(allTask)
    println("-------- end of all task printing")
    // READ
    // use forloop to print out task name
    /*
    for (i in allTask.indices){
        println("#${i + 1} ${allTask[i].taskName}")
    }

     */
    println("----read all tasks---")
    read(allTask)
    println("")
    println("------end of all task read --------------")
//    print("")
    // DELETE FROM THE STORAGE
    // what do I use as a key to identify my item, I want to eliminate
    // create a method, that uses the name to search if item is present, if present, remove from storage.
    // call the delete function
    // what is my selection
    println("---------- deleting a task-----")
    val itemSelected = "Parenting"
    delete(itemSelected, allTask)
    // read the storage
    read(allTask)
    println("------task has been deleted----")

    // update
    // this update is designed to add an asterik to the number class when the task is done
    // us the task name to update the task by marking it as asterik.
    updateTaskAsCompleted("fashion", allTask)
    println("----")
    read(allTask)
}

fun updateTaskAsCompleted(taskName:String, tasks:MutableList<Task>){
    // search for this item in the given list
    // use forloop and search for the item
    // and set it complete status as true.
    for (taskItem in tasks){
        // first check if the item is there
        if (taskItem.taskName == taskName){
            // set the complete status as true
            taskItem.isTaskDone = true
        }
    }
}

fun read(tasks:MutableList<Task>){
    for (i in tasks.indices){
        // I need to modify the read a bit
        // check for Boolean status
        if (tasks[i].isTaskDone){
            println("#${i + 1}* ${tasks[i].taskName}")
        }
        if (!tasks[i].isTaskDone){
            println("#${i + 1} ${tasks[i].taskName}")
        }

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