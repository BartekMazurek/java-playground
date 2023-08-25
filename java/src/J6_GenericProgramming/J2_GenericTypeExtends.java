package J6_GenericProgramming;

import java.util.ArrayList;

class Participant {
    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Employee extends Participant {

    public Employee(String name) {
        super(name);
    }
}

class Organization<T extends Participant> {
    private ArrayList<T> participants = new ArrayList<>();

    public void addParticipant(T participant) {
        this.participants.add(participant);
    }

    public ArrayList<T> getParticipants() {
        return this.participants;
    }
}

public class J2_GenericTypeExtends {
    public static void main(String[] args) {

        Organization organization = new Organization();
        organization.addParticipant(new Participant("Participant1"));
        organization.addParticipant(new Participant("Participant2"));
        organization.addParticipant(new Participant("Participant3"));

        ArrayList<Participant> participants = organization.getParticipants();

        for (Participant participant: participants) {
            System.out.println(participant.getName());
        }
    }
}
