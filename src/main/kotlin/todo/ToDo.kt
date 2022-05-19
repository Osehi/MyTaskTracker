package todo

import model.Task
import java.util.Scanner

class ToDo(
    val allTasks: MutableList<Task>
): ToDoOperations {

    override fun read() {
        if (allTasks.isEmpty()){
           println("No task, please add task")
        } else {
            for (i in allTasks.indices){
                if (allTasks[i].isTaskDone){
                    println("#${i + 1}* ${allTasks[i].taskName}")
                }
                if (!allTasks[i].isTaskDone){
                    println("\"#${i + 1} ${allTasks[i].taskName}\"")
                }
            }
        }

    }

    override fun add(task:Task) {
        allTasks.add(task)
    }

    override fun delete(item:String) {
        for (taskItemIndex in allTasks.indices){
            if (allTasks[taskItemIndex].taskName == item){
                allTasks.remove(allTasks[taskItemIndex])
            }
        }
    }

    override fun updateTaskCompletionStatus(taskName:String) {
        for (taskItem in allTasks){
            if (taskItem.taskName == taskName){
                taskItem.isTaskDone = true
            }
        }
    }
}