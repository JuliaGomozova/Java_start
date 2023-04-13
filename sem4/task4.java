public static List<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
    List<Integer> result = new ArrayList<>();
    int temp = 0;
    int n = d1.size();
    for (int i = 0; i < n; i++){
        int n1 = d1.removeFirst();
        int n2 = d2.removeFirst();
        int sum = n1 + n2;
        if (sum >= 10){
            result.add(sum%10 + temp++);
        }else{
            result.add(sum + temp);
            temp = 0;
        }
    }
    result.add(temp);
    return result;
}