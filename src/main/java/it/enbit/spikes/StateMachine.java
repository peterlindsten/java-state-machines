package it.enbit.spikes;

public class StateMachine {
    private enum State {
        ON,
        OFF
    }

    private State state;

    public StateMachine() {
        this.state = State.OFF;
    }

    public boolean isOff() {
        return state == State.OFF;
    }

    public boolean isOn() {
        return state == State.ON;
    }

    public void turnOn() throws AlreadyInRequestedStateException {
        if (state == State.ON)
            throw new AlreadyInRequestedStateException();
        else
            state = State.ON;
    }

    public void turnOff() throws AlreadyInRequestedStateException {
        if (state == State.OFF)
            throw new AlreadyInRequestedStateException();
        else
            state = State.OFF;
    }

    public class AlreadyInRequestedStateException extends Exception {

    }
}

