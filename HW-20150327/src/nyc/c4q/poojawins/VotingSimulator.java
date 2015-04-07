package nyc.c4q.poojawins;

public class VotingSimulator {

    public static void main(String[] args) {
        //1. Create an Election object, and given the Election a name
        Election myElection = new Election("OMG ELECTION");

        //2. Create a few Contender objects. Add these to the Election object. Make sure that the contender names are distinct!
        Contender pooja = new Contender("Pooja");
        Contender rob = new Contender("Rob");
        Contender other = new Contender("Other");
        myElection.add(pooja);
        myElection.add(rob);
        myElection.add(other);

        //3. Create a ElectionManager object. Ask it to manage the Election object created above.
        ElectionManager myElectionManager = new ElectionManager();
        myElectionManager.manage(myElection);

        //4. Ask the ElectionManager to initiatePolling
        myElectionManager.initiatePolling();

        //5. Follow the instructions on the console. After each round of polling you will be asked(within the console) whether you want to continue or not.

        //6. Ask the ElectionManager to displayResults
        myElectionManager.displayResults();
    }
}
