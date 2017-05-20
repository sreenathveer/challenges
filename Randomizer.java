import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;

public class Randomizer extends Random{
	
	private static final long serialVersionUID = 1L;
	public int[] generateRandom(int n, int size) {
	    if (size > n) {
	      size = n;
	    }

	    PriorityQueue<Integer> queue=new PriorityQueue<Integer>();  

	    for (int i = 0; i < size; i++) {
	      while (true) {
	        Integer value = new Integer(nextInt(n));

	        if (!queue.contains(value)) {
	          queue.add(value);
	          break;
	        }
	      }
	    }

	    int[] array = new int[queue.size()];

	    Iterator itr = queue.iterator();

	    for (int i = 0; i < array.length; i++) {
	      array[i] = ((Integer) itr.next()).intValue();
	      //System.out.println(array[i]);
	    }
	    return array;
	}
	private void getPrimary(int[] array) {
		Map<String,String> map = new HashMap<String,String>();
		for(int i=0;i<array.length;i++){
			int number = array[i];
			boolean isPrime=true;
			if(number==1 || number == 0){
				isPrime = false;
			}
			for(int j=2; j<=number/2; j++){
	            if(number % j == 0){
	            	isPrime = false;     
	            	break;
	            }
	        }
			 if(isPrime){
				 map.put(String.valueOf(number), "true");
			 }else{
				 map.put(String.valueOf(number), "false");
			 }
			 
		}
		
		for(Map.Entry m:map.entrySet()){  
			
			   System.out.println(m.getKey()+" "+m.getValue());  
		}  
		
	}
	public static void main(String[] args){
		Randomizer ran = new Randomizer();
		int[] array = ran.generateRandom(10, 100);
		
		ran.getPrimary(array);
		
		
	}
	
}
