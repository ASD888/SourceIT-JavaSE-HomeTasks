package com.sourceit.java.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 
 * @author Artur Meshcheriakov
 * 
 *         TASK:
 *         - Create a JAR file containing all your Home Tasks.
 *         Also create a Launcher class to execute selected home task
 */
public class MainLauncher {

    private static ArrayList<String> mainList = new ArrayList<>();

    public static void main(String[] args) {
	createMainList();
	printMainList();
	int mainNumber = 0;

	try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
	    while (true) {
		System.out.println("Enter a number of main method");
		String inputString = reader.readLine();
		if (Integer.parseInt(inputString) > 0 && Integer.parseInt(inputString) < 16) {
		    mainNumber = Integer.parseInt(inputString);
		    break;
		}
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}
	doMain(mainNumber, args);
    }

    private static void createMainList() {
	mainList.add("1. com.sourceit.java.basic.meshcheriakov.ht2(Maze)");
	mainList.add("2. com.sourceit.java.basic.meshcheriakov.ht4(Sorting)");
	mainList.add("3. com.sourceit.java.basic.meshcheriakov.ht6(IceCream)");
	mainList.add("4. com.sourceit.java.basic.meshcheriakov.ht7(MyArrays)");
	mainList.add("5. com.sourceit.java.basic.meshcheriakov.ht8(Workers)");
	mainList.add("6. com.sourceit.java.basic.meshcheriakov.ht10(Bank)");
	mainList.add("7. com.sourceit.java.basic.meshcheriakov.ht13(WTICompany)");
	mainList.add("8. com.sourceit.java.basic.meshcheriakov.ht14(Exceptions)");
	mainList.add("9. com.sourceit.java.basic.meshcheriakov.ht15(IOTextStatistics)");
	mainList.add("10. com.sourceit.java.basic.meshcheriakov.class6(ArrayTask)");
	mainList.add("11. com.sourceit.java.basic.meshcheriakov.class6(FooBar)");
	mainList.add("12. com.sourceit.java.basic.meshcheriakov.class10(Anagram)");
	mainList.add("13. com.sourceit.java.basic.meshcheriakov.class10(Console)");
	mainList.add("14. com.sourceit.java.basic.meshcheriakov.class10(ReverseConsole)");
	mainList.add("15. com.sourceit.java.basic.meshcheriakov.class15(FileChanger)");
    }

    private static void printMainList() {
	for (String x : mainList) {
	    System.out.println(x);
	}
    }

    private static void doMain(int number, String[] args) {
	switch (number) {
	case 1:
	    com.sourceit.java.basic.meshcheriakov.ht2.Launcher.main(args);
	    break;
	case 2:
	    com.sourceit.java.basic.meshcheriakov.ht4.Sorting.main(args);
	    break;
	case 3:
	    com.sourceit.java.basic.meshcheriakov.ht6.Launcher.main(args);
	    break;
	case 4:
	    com.sourceit.java.basic.meshcheriakov.ht7.Launcher.main(args);
	    break;
	case 5:
	    com.sourceit.java.basic.meshcheriakov.ht8.Launcher.main(args);
	    break;
	case 6:
	    com.sourceit.java.basic.meshcheriakov.ht10.Launcher.main(args);
	    break;
	case 7:
	    com.sourceit.java.basic.meshcheriakov.ht13.Launcher.main(args);
	    break;
	case 8:
	    com.sourceit.java.basic.meshcheriakov.ht14.Launcher.main(args);
	    break;
	case 9:
	    com.sourceit.java.basic.meshcheriakov.ht15.textstatistics.TextStatisticsUI.main(args);
	    break;
	case 10:
	    com.sourceit.java.basic.meshcheriakov.class6.arraytask.LoopsAndArray.main(args);
	    break;
	case 11:
	    com.sourceit.java.basic.meshcheriakov.class6.foobartask.FooBar.main(args);
	    break;
	case 12:
	    com.sourceit.java.basic.meshcheriakov.class10.anagram.Anagram.main(args);
	    break;
	case 13:
	    com.sourceit.java.basic.meshcheriakov.class10.console.Console.main(args);
	    break;
	case 14:
	    com.sourceit.java.basic.meshcheriakov.class10.reverseandcase.ReverseConsole.main(args);
	    break;
	case 15:
	    com.sourceit.java.basic.meshcheriakov.class15.FileChanger.main(args);
	    break;
	}
    }
}
