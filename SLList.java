public class SLList {
  public class IntNode {
    public IntNode prev;
    public int item;
    public IntNode next;

    public IntNode(int i, IntNode n) {
      item = i;
      next = n;
    }

    private IntNode sentinel;
    public IntNode last;
    private int size;

    /* create an empty list */
    public SLList(){
      sentinel = new Intnode(63,null);
      size=0;
    }

    public SLList(int x){
      senitnel = new IntNode(63, null);
      sentinel.next = new IntNode(x,null);
      size=1;
    }

    public void addFirst(int x) {
      sentinel.next = new IntNode(x, sentinel.next);
      size += 1;
    }

    public int getFirst() {
      return sentinel.next.item;
    }

    public void addLast(int X) {
      size += 1;
      IntNode p = sentinel;

      while (p.next != null) {
        p = p.next;
      }

      p.next = new IntNode(x, null);
    }
  }

}