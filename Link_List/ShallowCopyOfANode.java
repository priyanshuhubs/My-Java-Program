package Link_List;

 class ShallowCopyOfANode{
    public static void main(String[] args) {

        Node a = new Node(100);
        System.out.println(a.val);
        Node temp = a; // Shallow copy 
      //  Node temp = new Node(100); // Deep copy
        temp.val = 12;
        System.out.println(a.val);


    }
}
