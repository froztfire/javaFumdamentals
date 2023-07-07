package org.example.dataTypes;

//There are three classes of ants in our anthill: Queen, Soldier, and Worker.
// There is a single queen for the entire anthill. Her populate method creates tens of soldier ants and hundreds of worker ants.
// Add code to the main method: - send all the worker ants in the workers array to find food (sendForFood method);
// send all the soldier ants in the soldier array into battle (sendInToBattle method);

class Queen {
    public static Worker[] workers;
    public static Soldier[] soldiers;

    public static void main(String[] args) {
        populate();
        for (int i = 0; i < workers.length; i++) {
            Worker worker = workers[i];
            worker.sendForFood();
        }

        for (int i = 0; i < soldiers.length; i++) {
            Soldier soldier = soldiers[i];
            soldier.sendToBattle();
        }
    }

    public static void populate() {
        workers = new Worker[800];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
        }

        soldiers = new Soldier[50];
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i] = new Soldier();
        }
    }
}

class Soldier {
    public void sendToBattle() {
        System.out.println("Send to battle!");
    }
}

class Worker {
    public void sendForFood() {
        System.out.println("Send for food!");
    }
}


