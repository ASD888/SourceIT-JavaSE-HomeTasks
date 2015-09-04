package com.sourceit.java.basic.meshcheriakov.lesson19.lab.functions.behavior;

/**
 * 
 * @author Artur Meshcheriakov
 */
public interface IFunctions {
    boolean getWebPageContent(String webAddress);

    String[] getFunctions();

    void printCommands(String[] functionsArray);

    void executeCommand(int choise);
}