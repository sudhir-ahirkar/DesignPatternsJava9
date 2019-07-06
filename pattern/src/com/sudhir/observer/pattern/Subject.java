package com.sudhir.observer.pattern;

    public interface Subject {

        public void registeredObserver(Observer observer);
        public void removeObserver(Observer observer);
        public void notifyObserver();
}
