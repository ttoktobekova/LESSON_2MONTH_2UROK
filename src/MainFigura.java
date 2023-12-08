public  abstract  class MainFigura  {
    private  String name;
    public  abstract int calculateParemetr();

    public MainFigura(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
