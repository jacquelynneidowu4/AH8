class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> boolean linkedListFind(Node<T> head, T target) {

      // todo
        Node<T>ptr=head;
        while(ptr!=null){
            if(ptr.val==target)return true;
            ptr=ptr.next;
        }
      return false;
    }
    public static <T> String getNodeValue(Node<T> head, int index){
        Node<T>ptr=head;
        int count=0;
        while(ptr!=null){
            if(count==index){
                return (String) ptr.val;
            }
            ptr=ptr.next;
            count++;
        }
        return null;

    }
    
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;

        // a -> b -> c -> d

        System.out.println(Source.linkedListFind(a, "c"));
        System.out.println(Source.getNodeValue(a, 4));
        
    }

  }