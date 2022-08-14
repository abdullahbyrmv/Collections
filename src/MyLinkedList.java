public class MyLinkedList {
    private Node lastElement;

    class Node{

        private Object obj;
        private Node nextElement;
        public Node(Object obj){
        }

        public void setNextElement(Node node){
        }
    }

    public void add(Object obj){
        Node  n = new Node(obj);
        if(lastElement == null){
            lastElement = n;
        } else{
            lastElement.nextElement = n;
            lastElement = n;
        }
    }
}
