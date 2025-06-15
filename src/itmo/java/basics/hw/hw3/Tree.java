package itmo.java.basics.hw.hw3;

class Tree {
    private String name;
    private Integer year;
    private boolean isAlive;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree (String name, Integer year, boolean isAlive){
        this.name = name;
        this.year = year;
        this.isAlive = isAlive;
    }

    public Tree (String name, Integer year){
        this.name = name;
        this.year = year;
    }
}

class Point4Program {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree("Береза",2020,true);
        Tree tree3 = new Tree("Елка",2000);
    }
}
