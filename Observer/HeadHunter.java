/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author edujg
 */
public class HeadHunter implements Subject {

    private ArrayList<Observer> userList = new ArrayList<Observer>();
    private ArrayList<String> jobs = new ArrayList<String>();

    public HeadHunter() {

    }

    @Override
    public void registerObserver(Observer o) {
        userList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        userList.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o : userList) {
            o.update(this);
        }
    }

    public void addJob(String job) {
        this.jobs.add(job);
        notifyAllObservers();
    }

    public ArrayList<String> getJobs() {
        return jobs;
    }

    public String toString() {
        return "HeadHunter";
    }
}
