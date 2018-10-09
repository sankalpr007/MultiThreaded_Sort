public class MergeThread extends Thread{
  int[] a;
  int[] b;
  int[] c;

  public MergeThread(int[] a, int[] b){
    this.a = a;
    this.b = b;
    c = new int[a.length + b.length];
    //run();      //Once this class is a thread remove this call
  }
  public void run(){
    merge();
  }

  private void merge(){
    int aIndex = 0, bIndex = 0, cIndex = 0;
    while(aIndex < a.length && bIndex < b.length)
      if(a[aIndex] < b[bIndex])
        c[cIndex++] = a[aIndex++];
      else
        c[cIndex++] = b[bIndex++];

    while(aIndex < a.length)
      c[cIndex++] = a[aIndex++];
    
    while(bIndex < b.length)
      c[cIndex++] = b[bIndex++];
    
    System.out.println("MergeSort");
  }
 
  public int[] get(){
    return c;
  }
}