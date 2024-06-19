package ds;

public class LinkedList {
    public class Node{

        String data;
        Node next;

        Node(String newdata){
            data=newdata;
            next=null;
        }
    }

    Node head=null;
    int size=0;

    public void addFirst(String data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head = newNode;
            size++;
        }
    }

    public void addLast(String data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node currentNode=head;
            while(currentNode.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
            size++;
        }
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("Cant be deleted. List id empty");
        }
        else if(head.next==null){
            head=null;
        }
        else{
            head= head.next;
            size--;
        }
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("Cant be deleted. List id empty");
        }
        else if(head.next ==null){
            head=null;
        }
        else{
            Node currentNode=head;
            if(currentNode.next.next==null){
                currentNode.next=null;
            }
            else {
                while (currentNode.next.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = null;
                size--;
            }
        }

    }

    public void print(){
        if(head==null){
            System.out.println("LL is empty.");
        }
        else{
            Node currentNode=head;
            System.out.print(currentNode.data + " >");
            while(currentNode.next!=null){
                currentNode=currentNode.next;
                System.out.print(currentNode.data + " >");
            }
            System.out.println(" End of LL");
        }
    }

    public void reverse(){
        if(head==null || head.next==null){
            System.out.println("List is empty, cant be reversed");
        }

        Node prev= head;
        Node current= head.next;


        while(current.next!=null){
            Node nextNode=current.next;
            current.next=prev;

            prev=current;
            current=nextNode;
        }
        current.next=prev;
        head.next=null;
        head=current;
    }

    public Node reverseRec(Node headd){
        if(headd==null||headd.next==null){
            return headd;
        }
        else{
            Node tempHead = reverseRec(headd.next);
            headd.next.next=headd;
            headd.next=null;

            return tempHead;
        }
    }

    public void printNthElementFromLast(int x){
        int n=size-x+1;
        Node currentNode=head;
        if(n>=0){
            for(int i=0;i<n;i++){
                currentNode=currentNode.next;
            }
            System.out.println("Element is : "+currentNode.data);
        }else{
            System.out.println("List is empty");
        }

    }

    public void checkCyclic(){
        Node slow = head;
        Node fast = head;
        boolean isCyclic = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCyclic = true;
                System.out.println("They are cyclic");
                break;
            }
        }
        if (!isCyclic) {
            System.out.println("They are not cyclic");
        }
    }

    public void checkPalindrome(Node head){
        //find centre
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        Node head2 = reverseRec(mid);
        while(head.next!=mid){

        }


    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.print();
        ll.deleteLast();
        ll.addFirst("test4");
        ll.addFirst("test3");
        ll.addFirst("test2");
        ll.addFirst("test1");
        ll.addFirst("test0");
        ll.print();
        ll.printNthElementFromLast(5);
//        ll.head = ll.reverseRec(ll.head);
//        ll.print();
//        ll.addFirst("test1");
//        ll.print();
//        ll.addFirst("test0");
//        ll.print();
//        ll.addLast("test3");
//        ll.print();
//        ll.addLast("test4");
//        ll.print();
    }
}
