class NegativeNumberException extends Exception{

    public NegativeNumberException(){
        super();
    }

    public String toString() {
        return "Negative Number Found";
    }
}