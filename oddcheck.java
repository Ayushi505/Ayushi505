package basics;

class oddcheck {
        public static void main(String[] args) {
            int a = 10;
            System.out.print("Even Numbers "+ a + " are: ");
            for (int i = 1; i <= a; i++)
                if (i % 2 == 0)
                    System.out.println(i);
        }
    }
