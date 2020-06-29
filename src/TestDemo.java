public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(60);
        myLinkedList.addLast(57);
        myLinkedList.addLast(56);
        myLinkedList.addLast(55);
        myLinkedList.addLast(58);
        myLinkedList.display();
        //System.out.println(myLinkedList.contains(57));
        //System.out.println(myLinkedList.size());
        myLinkedList.addIndex(4,59);
       // myLinkedList.display();
        //myLinkedList.remove(55);
        //myLinkedList.display();
        //myLinkedList.remove(59);
        //myLinkedList.display();
        //myLinkedList.remove(57);
        //myLinkedList.display();
        myLinkedList.addLast(56);
        myLinkedList.addLast(56);
        myLinkedList.display();
        myLinkedList.removeAll(56);
        myLinkedList.display();
    }

}