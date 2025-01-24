import java.util.*;

public class tUf {

	public static ArrayList<Integer> findUnion(int a[], int b[]) {

		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> Union = new ArrayList<>();

		for(int x : a)
			set.add(x); // set.add(a[i]) using iteration

		for(int y : b)
			set.add(y); // set.add(b[i]) using iteration

		for(int z : set)
			Union.add(z);
		Collections.sort(Union);
		return Union;
	}

	public static void main (String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[] b = {2,3,4,4,5,11,12};
		ArrayList<Integer> pg = findUnion(a,b);
		System.out.print(pg);
	}
}