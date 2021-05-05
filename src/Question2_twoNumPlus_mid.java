public class Question2_twoNumPlus_mid {

    public Node twoNumPlus(Node l1, Node l2){
        Node node = new Node(0);
        Node p = l1 ;
        Node q = l2 ;
        Node curr = node ;
        int carry = 0 ;
        while(p!=null||q!=null){
            int x = (p!=null)?p.data:0;
            int y = (q!=null)?p.data:0;
            int sum = x + y + carry ;
            carry =sum/10;
            curr.next = new Node(sum%10);
            curr =curr.next;
            if (p!=null)p=p.next;
            if (q!=null)q=q.next;
        }
        if(carry>0){
            curr.next = new Node(carry);
        }
      return node.next;

    }
    public class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data = data ;
        }

        public int getData() {
            return data;
        }
    }
}
