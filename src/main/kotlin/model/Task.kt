package model

data class Task(
    val taskId: String,
    val taskName:String,
    val description: String,
    val isTaskDone: Boolean = false
)
