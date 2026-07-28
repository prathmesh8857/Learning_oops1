public class DoublyLinkListEx {
    static class Node {

        int data;//data part
        Node next;//reference ti next node
        Node prev;


        //Constructor
        Node(int data){
            this.data = data;
            next = null;
            prev = null;

        }
    }
    Node head;//it is used for showing forst node,Nodes are start from here or it is the entry point of nodes.

    //Step2 : Insert at end
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        // time complexity is o of n
        if(head == null){
            head = newNode;
            return;


        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);

        if(head != null){
        newNode.next = head;
        head = newNode;
        }

        head = newNode;
    }

    //Step4: Delete by value

    public void delete(int key){

        //If list is empty
        if(head == null){
            System.out.println("List is empty");
            return;

        }
        Node temp = head;

        // If head need to delete
        if(head.data == key){
            head = head.next;
            return;

        }
        
        while (temp != null && temp.data != key){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Values not found");
            return;
        }
        if(temp.next != null){
            temp.next.prev = temp.prev;
        }
        temp.prev.next = temp.next;

    }
    //step5: Display
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        

    }
    //step6: main mathod


    public static void main(String[] args) {
        DoublyLinkListEx list = new DoublyLinkListEx();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.display();
    }
}


//when to use linklist?
//->frequently insert delete operation
//->detasize change frequently
//->no heavy index is needed

// difference batn arraylist and linklist?
// ArrayList vs LinkedList (Simple Explanation)
// Feature	ArrayList	LinkedList
// Storage	Stores elements in a dynamic array	Stores elements as nodes connected by links
// Access by index	✅ Very fast	❌ Slow
// Insert in middle	❌ Slow	✅ Fast
// Delete in middle	❌ Slow	✅ Fast
// Memory	Uses less memory	Uses more memory (stores links too)
// Best for	Reading/searching data	Frequent insertions and deletions

//
// litcode question no 21 solve


