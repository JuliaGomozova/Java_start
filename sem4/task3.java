
public static boolean checkOn(Deque<Integer> deque){
            while (deque.size() > 1){
                if (deque.removeFirst() == deque.removeLast()){

                }else {
                    return false;
                }
            }
        return true;
    }
Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,3,2,1));
        System.out.print(checkOn(deque));