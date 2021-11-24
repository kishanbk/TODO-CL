package com.company;

import java.util.ArrayList;

public class TodoFunction {

    private ArrayList<String> todoList = new ArrayList<String>();

    //Add list item

    public void addItem(String item){
        todoList.add(item);
    }

    //Remove list item

    public void removeItem(int index){
        String myItem = todoList.get(index);
        todoList.remove(index);
    }

    //Print the entire list

    public void printTodoList(){
        System.out.println("Todo list consist of: "+ todoList.size()+ " items");
        for(int i =0; i< todoList.size(); i++){
            System.out.println("Item at position "+(i+1)+ " is " + todoList.get(i));
        }
    }

    //Update the list

    public void updateTodo(int index, String list){
        todoList.set(index, list);
        System.out.println("Updation Completed at position "+ index+1);
    }

    //Search in list

    public String findItem(String searchItem){
        int index = todoList.indexOf(searchItem);

        if(index == -1){
            return null;
        }else{
            return todoList.get(index);
        }
    }
}
