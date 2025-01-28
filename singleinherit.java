class employee {
    int sal = 60000;
}

class engineering extends employee {
    int ben = 2000;
}

class singleinherit {
    public static void main(String args[]) {
        engineering e = new engineering();
        System.out.println("Salary:" + e.sal);
        System.out.println("Benifit:" + e.ben);
    }
}