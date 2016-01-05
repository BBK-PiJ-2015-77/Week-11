public class Comparator<R extends Comparable<R> > {
	//Check 'Comparable' in the java api to find out what it does
	public R getMax(R n, R m){
		
	//	if (n.compareTo(m)> 0) {
	//		return n;
	//	} else {
	//		return m;
	//	}
		
		return (n.compareTo(m) > 0 ? n : m);
	}
}