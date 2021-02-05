package com.javarush.task.task38.task3804;

public class FactoryException {
    static Throwable getEx (Enum e){
        if(e instanceof ApplicationExceptionMessage){
            return new Exception(e.name().charAt(0) + e.name().substring(1).toLowerCase().replace("_", " "));
        }
        else if(e instanceof DatabaseExceptionMessage){
            return new RuntimeException(e.name().charAt(0) + e.name().substring(1).toLowerCase().replace("_", " "));
        }
        else if(e instanceof UserExceptionMessage){
            return new Error(e.name().charAt(0) + e.name().substring(1).toLowerCase().replace("_", " "));
        }
        else return new IllegalArgumentException();
    }
}
