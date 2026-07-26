public class SinglyLinlListEX {

    //Step1: Node class(we store data and reference)
    static class Node {

        int data;//data part
        Node next;//reference ti next node


        //Constructor
        Node(int data){
            this.data = data;
            next = null;

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
    }

    //Step3: Insert at Begining

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    //Step4: Delete by value

    public void delete(int key){

        //If list is empty
        if(head == null){
            System.out.println("List is empty");
            return;

        }
        // If head need to delete
        if(head.data == key){
            head = head.next;
            return;

        }
        Node temp = head;

        while (temp.next != null && temp.next.data != key){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Values not found");
        }else{
            temp.next = temp.next.next;
        }

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
        SinglyLinlListEX list = new SinglyLinlListEX();
        list.insertAtEnd(10);
        list.display();
    }
}
