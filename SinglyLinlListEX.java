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


    public static void main(String[] args) {
        
    }
}
