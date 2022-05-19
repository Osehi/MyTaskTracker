package todo

import model.Task
import org.junit.Assert.*
import org.junit.Test


class ToDoTest {

    @Test
    fun read_givenStorageIsEmpty_returnSizeOfStorageAsZero(){
        // SUT
        // Given
        val itemList = mutableListOf<Task>()
        val sut = ToDo(itemList)
        // when
        sut.read()
        // assert
        assertTrue(itemList.size == 0)
    }

    @Test
    fun read_givenStorageWithTaskItems_returnSizeOfStorageIsNotZero(){
        // SUT
        // Given
        val itemList = mutableListOf<Task>()
        val sut = ToDo(itemList)
        val taskOne = Task("one", "fashion", "dress sense session")
        // when
        sut.add(taskOne)
        // assert
        assertTrue(itemList.size != 0)
    }

    @Test
    fun add_givenATaskToAdd_returnTrueWhenSizeOfStorageIsGreaterThanZero(){
        // SUT
        // Given
        val itemList = mutableListOf<Task>()
        val sut = ToDo(itemList)
        val newTask = Task("two", "business", "Scaling Your Business")
        // when
        sut.add(newTask)
        // assert
        assertTrue(itemList.size != 0)
    }



}