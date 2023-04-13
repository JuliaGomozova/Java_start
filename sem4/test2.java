List<String> listSt = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();

        for(int i =0; i < n; i++){
            String temp = iScanner.next();
            if (temp.equals("push")){
                String st = iScanner.next();
                listSt.add(st);
            } else if (temp.equals("pop")) {
                System.out.println("Взял " + listSt.get(i-1));
                listSt.remove(i-1);
            }

        }
        for (String item:listSt) {
            System.out.print(item + " ");
        }
//        System.out.println(listSt);