import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayOfArray {

	public static void main (String [] args) {
		String [] arrStr = {"cat", "rain","wait", "freeze","dog", "neeraj"};
		Map<Integer, List> strLnMap = new HashMap<Integer, List >();
		
		for(String str:arrStr) {
			int size = str.length();
			if(strLnMap.containsKey(size)) {
				strLnMap.get(size).add(str);
			} else {
				List<String> lstStr = new ArrayList<String>();
				lstStr.add(str);
				strLnMap.put(size, lstStr);
			}
		}
		
		List<List> resultLst = new ArrayList<List>();
		Iterator<Integer> itr = strLnMap.keySet().iterator();
		while(itr.hasNext()) {
			Integer size = itr.next();
			resultLst.add(strLnMap.get(size));
		}
		
		System.out.println(resultLst);
	}
}
