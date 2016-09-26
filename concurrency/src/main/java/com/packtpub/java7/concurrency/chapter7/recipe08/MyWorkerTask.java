package com.packtpub.java7.concurrency.chapter7.recipe08;

import java.util.Date;
import java.util.concurrent.ForkJoinTask;

public abstract class MyWorkerTask extends ForkJoinTask<Void> {

    private static final long serialVersionUID = 1L;

    private String name;


    public MyWorkerTask(String name) {
        this.name = name;
    }


    @Override
    public Void getRawResult() {
        return null;
    }


    @Override
    protected void setRawResult(Void value) {

    }


    @Override
    protected boolean exec() {
        Date startDate = new Date();
        compute();
        Date finishDate = new Date();
        long diff = finishDate.getTime() - startDate.getTime();
        System.out.printf("MyWorkerTask: %s : %d Milliseconds to complete.\n", name, diff);
        return true;
    }

    public String getName() {
        return name;
    }


    protected abstract void compute();
}