package todo

import model.Task
import java.util.Scanner

interface ToDoOperations {

    fun read()

    fun add(task:Task)

    fun delete(item:String)

    fun updateTaskCompletionStatus(taskName:String)
}