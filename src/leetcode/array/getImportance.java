package leetcode.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

class Employee{
    public int id;
    public int importance;
    public List<Integer> subordinates;
}

public class getImportance {
    public int getImportance(List<Employee> employees, int id){
        int result = 0;
        Map<Integer,Employee> map = new HashMap<Integer,Employee>();
        for (Employee e:employees){
            map.put(e.id,e);
        }
        Stack<Employee> stack = new Stack<Employee>();
        Employee ee = map.get(id);
        stack.push(ee);
        while(!stack.isEmpty()){
            ee = stack.pop();
            result += ee.importance;
            for(int i = ee.subordinates.size()-1;i>=0;i--){
                stack.push(map.get(ee.subordinates.get(i)));
            }
        }
        return result;
    }
}
