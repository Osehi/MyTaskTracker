package model

data class Task(
    val taskId: String,
    val taskName:String,
    val description: String,
    var isTaskDone: Boolean = false
)
