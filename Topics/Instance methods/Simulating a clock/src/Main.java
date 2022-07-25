class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        if(minutes>1 || minutes<59) {

            minutes += 1;
        }



    }
}