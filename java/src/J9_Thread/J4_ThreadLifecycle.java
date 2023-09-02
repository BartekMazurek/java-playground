package J9_Thread;

public class J4_ThreadLifecycle {

    // THREAD STATES
    // RETRIEVE THREAD CURRENT STATE BY "STATE" (getState() method) STATIC PROPERTY

    // NEW - already created new thread, not working (method start() should be executed)

    // RUNNABLE -  currently working thread or ready to start working (waiting for resources)

    // BLOCKED - waiting for blocked resources
    // SYNC MONITOR MANAGES THREADS AND PREVENT TO USE RESOURCES (EX. VARIABLES) BY MULTIPLE THREADS

    // WAITING - waiting for other threads to finish their work

    // TIMED_WAITING - asleep thread (ex. by sleep() method)

    // TERMINATED - thread finished work
}
