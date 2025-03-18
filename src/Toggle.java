import java.util.*;

public class Toggle{
    public static List<Integer> getPossibleDigits(Map<Integer, String> validDigits, String fd) {
        List<Integer> pd = new ArrayList<>();
        
        for (Map.Entry<Integer, String> entry : validDigits.entrySet()) {
            int mismatches = 0;
            String pattern = entry.getValue();
            
            for (int i = 0; i < fd.length(); i++) {
                if (fd.charAt(i) != pattern.charAt(i)) {
                    mismatches++;
                }
            }
            

            if (mismatches <= 1) {
                pd.add(entry.getKey());
            }
        }
        
        return pd;
    }

    public static void solve() 
    {
        Scanner sc = new Scanner(System.in);
        
        List<String> segd = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            segd.add(sc.nextLine().strip());
        }
        

        List<String> codevita = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            codevita.add(sc.nextLine().strip());
        }

        Map<Integer, String> dig = new HashMap<>();
        
        for (int digit = 0; digit < 10; digit++) {
            StringBuilder pattern = new StringBuilder();
            for (int row = 0; row < 3; row++) {
                pattern.append(segd.get(row).substring(digit * 3, (digit + 1) * 3));
            }
            dig.put(digit, pattern.toString());
        }


        List<List<Integer>> possibleNumbers = new ArrayList<>();
        
        for (int i = 0; i < codevita.get(0).length() / 3; i++) {
            StringBuilder fd = new StringBuilder();
            for (int row = 0; row < 3; row++) {
                fd.append(codevita.get(row).substring(i * 3, (i + 1) * 3));
            }
          
  
            List<Integer> matchingDigit = getPossibleDigits(dig, fd.toString());
            
            if (matchingDigit.isEmpty()) {
                System.out.print("Invalid");
                return;
            }
            possibleNumbers.add(matchingDigit);
        }


        int totalSum = 0;
        for (List<Integer> combination : getCombinations(possibleNumbers)) {
            StringBuilder number = new StringBuilder();
            for (int digit : combination) {
                number.append(digit);
            }
            totalSum += Integer.parseInt(number.toString());
        }


        System.out.print(totalSum);
    }

    public static List<List<Integer>> getCombinations(List<List<Integer>> possibleNumbers) {
        List<List<Integer>> result = new ArrayList<>();
        gch(possibleNumbers, 0, new ArrayList<>(), result);
        return result;
    }

    private static void gch(List<List<Integer>> possibleNumbers, int index, List<Integer> sv, List<List<Integer>> result) {
        if (index == possibleNumbers.size()) {
            result.add(new ArrayList<>(sv));
            return;
        }
        for (int digit : possibleNumbers.get(index)) {
            sv.add(digit);
            gch(possibleNumbers, index + 1, sv, result);
            sv.remove(sv.size() - 1);
        }
    }
    public static void main(String[] args) {
        solve();
    }
}
