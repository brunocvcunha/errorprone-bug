package org.brunocvcunha.errorprone;

public class App {
    

    public static void main(String[] args) {
        
        Task task = Task.builder().data("userName", "brunocvcunha")
           .data("repository", "errorprone")
           .build();
        
        System.out.println(task);
    }
    
}