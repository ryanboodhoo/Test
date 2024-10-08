public enum Size {
    S ('S'),
    M('M'),
    L('L');


    private char size;

    Size(char size) {
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
}
