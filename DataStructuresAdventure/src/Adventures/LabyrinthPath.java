package Adventures;

public class LabyrinthPath {

    private class Node {
        String location;
        Node next;
        Node(String location) {
            this.location = location;
            this.next = null;
        }
    }

    private Node head;

    public LabyrinthPath() {
        head = null;
    }

    public void addLocation(String location) {
        Node newNode = new Node(location); 
        newNode.next = head;              
        head = newNode;                  
    }

    public void removeLastLocation() {
        if (head != null) {
            head = head.next; 
        } else {
            System.out.println("The path is already empty.");
        }
    }

    public boolean hasLoop() {
        if (head == null) {
            return false; 
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;      
            fast = fast.next.next;   

            if (slow == fast) {
                return true; 
            }
        }

        return false; 
    }

    public void printPath() {
        if (head == null) {
            System.out.println("The path is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.location + " -> ");
            current = current.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        LabyrinthPath path = new LabyrinthPath();

        path.addLocation("Entrance");
        path.addLocation("Chamber of Secrets");
        path.addLocation("Tomb of the Pharaoh");

        System.out.println("Current path:");
        path.printPath(); 

        System.out.println("Is there a loop? " + path.hasLoop()); 

        path.removeLastLocation();
        System.out.println("After removing the last visited location:");
        path.printPath(); 

        path.head.next.next = path.head;  
        System.out.println("Is there a loop? " + path.hasLoop()); 
    }
}
