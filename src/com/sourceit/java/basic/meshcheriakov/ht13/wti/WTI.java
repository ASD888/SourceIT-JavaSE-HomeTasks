package com.sourceit.java.basic.meshcheriakov.ht13.wti;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

import com.sourceit.java.basic.meshcheriakov.ht13.workers.Worker;

/**
 * 
 * @author Artur Meshcheriakov
 */
public class WTI {

    private ArrayList<Worker> workersList = new ArrayList<>();
    private HashSet<String> workersNameSet = new HashSet<>();
    private HashMap<String, Integer> popularNamesMap = new HashMap<>();
    private ArrayDeque<Worker> workersTicketsQueue = new ArrayDeque<>();

    private int countName(String name) {
	int result = 0;
	for (Worker x : workersList) {
	    if (x.getFirstName().equals(name)) {
		result++;
	    }
	}
	return result;
    }

    public void addNewEmployee(Worker worker) {
	workersList.add(worker);
	workersNameSet.add(worker.getFirstName());
	workersTicketsQueue.offer(worker);
    }

    public void kickEmployee(Worker worker) {
	if (workersList.contains(worker)) {
	    workersList.remove(workersList.indexOf(worker));
	} else {
	    System.out.println("Employee not found");
	}
    }

    public Worker choseEmployeeForPrize() {
	Worker result = null;
	if (!workersList.isEmpty()) {
	    result = workersList.get(new Random().nextInt(workersList.size()));
	}
	return result;
    }

    public Set<String> getWorkersNameSet() {
	return workersNameSet;
    }

    public void giveNameForToy(String name) {
	if (workersNameSet.contains(name)) {
	    workersNameSet.remove(name);
	}
    }

    public Map<String, Integer> getNamePopularity() {
	for (Worker x : workersList) {
	    if (countName(x.getFirstName()) > 1) {
		popularNamesMap.put(x.getFirstName(), countName(x.getFirstName()));
	    }
	}
	return popularNamesMap;
    }

    public Queue<Worker> getTicketsQueue() {
	return workersTicketsQueue;
    }

    public void giveTicket() {
	if (!workersTicketsQueue.isEmpty()) {
	    Worker result = workersTicketsQueue.poll();
	    workersTicketsQueue.offer(result);
	} else {
	    System.out.println("Queue is empty");
	}
    }
}
