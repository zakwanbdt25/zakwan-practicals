class one {
    public void p_one() {
        System.out.println("Print Super Class");
    }
}

class two extends one {
    public void p_two() {
        System.out.println("Print Sub Class");
    }
}

class three extends two {
    public void p_three() {
        System.out.println("Welcome to Sub Class");
    }
}

class multilevel {
    public static void main(String args[]) {
        three th = new three();
        th.p_one();
        th.p_two();
        th.p_one();
    }
}