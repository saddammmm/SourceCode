import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
 class permutations<T> {
    public static void main(String args[]) {
        int n,m,test;
        permutations<Integer> obj = new permutations<Integer>();
        Collection<Integer> input = new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        test=sc.nextInt();
        
        for (int l = 0; l < test; l++) {
            int k = 0;
        
        n=sc.nextInt();
        m=sc.nextInt();
        for (int i = 0; i < n; i++) {
            input.add(0);
        }
        for (int i = 0; i < m; i++) {
            input.add(1);
        }
        
        

        Collection<List<Integer>> output = obj.permute(input);
        
        Set<List<Integer>> pnr = null;
        
            pnr = new HashSet<List<Integer>>();
            for(List<Integer> integers : output){
            pnr.add(integers.subList(0, integers.size()));
                
                
            }
            
            
           
            for (List<Integer> list : pnr) {
                if(list.get(0)==1)
                {
                    k++;
                }
                
            
            
        }
        System.out.println(k);
        input.clear();
        }
        
    }
    public Collection<List<T>> permute(Collection<T> input) {
        Collection<List<T>> output = new ArrayList<List<T>>();
        if (input.isEmpty()) {
            output.add(new ArrayList<T>());
            return output;
        }
        List<T> list = new ArrayList<T>(input);
        T head = list.get(0);
        List<T> rest = list.subList(1, list.size());
        for (List<T> permutations : permute(rest)) {
            List<List<T>> subLists = new ArrayList<List<T>>();
            for (int i = 0; i <= permutations.size(); i++) {
                List<T> subList = new ArrayList<T>();
                subList.addAll(permutations);
                subList.add(i, head);
                subLists.add(subList);
            }
            output.addAll(subLists);
        }
        return output;
    }
}

