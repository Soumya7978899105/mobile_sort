package jsp.com.MobileSort;

import java.util.Comparator;

public class SortByRam implements Comparator {
	
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		RealmeMobiles m1=(RealmeMobiles)o1;
		RealmeMobiles m2=(RealmeMobiles)o2;
		if(m1.Ram>m2.Ram)return 1;
		else if(m1.Ram<m2.Ram)return -1;
		else return 0;
		
	}

}
