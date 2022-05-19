import model.Task
import todo.ToDo
import java.util.Scanner

fun main(args: Array<String>) {

    val allTasks = mutableListOf<Task>()
    val myToDo = ToDo(allTasks)

    // add menu
    val scanner = Scanner(System.`in`)
    var isRunning = true
    while (isRunning){
        println(
            "This is a ToDo App\n\t1 View all my tasks\n\t2 Add task\n\t3 Delete tasks\n\t4 Update completed task\n\t5 Exit"
        )
        when(scanner.nextInt()){
            1-> {

                myToDo.read()
            }
            2 -> {
                println("Please enter the following details to create a task")
                println("TaskId")
                val taskId = scanner.nextLine()
                scanner.nextLine()
                println("TaskName")
                val taskName = scanner.nextLine()
                println("TaskDescription")
                val taskDescription = scanner.nextLine()
                myToDo.add(Task(taskId, taskName, taskDescription))
            }
            3 -> {
                println("Please enter taskName")
                val taskName = scanner.next()
                myToDo.delete(taskName)
            }
            4 -> {
                println("Please enter task you wan to update")
                val taskToUpdate = scanner.next()
                myToDo.updateTaskCompletionStatus(taskToUpdate)
            }
            5 -> {
                isRunning = false
            }
        }
    }


}

