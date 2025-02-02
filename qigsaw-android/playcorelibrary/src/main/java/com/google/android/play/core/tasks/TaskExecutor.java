package com.google.android.play.core.tasks;

import android.support.annotation.NonNull;

import java.util.concurrent.Executor;

public class TaskExecutor implements Executor {

    @Override
    public final void execute(@NonNull Runnable command) {
        command.run();
    }
}
