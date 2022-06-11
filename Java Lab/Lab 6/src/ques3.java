class Bank{
    double ROI;
    void findROI(){
        System.out.println("ROI="+ROI);
    }
}
class HDFC extends Bank{
    HDFC(){
        ROI=8.1;
    }
    void findROI(){
        System.out.println("ROI of HDFC Bank: "+ROI);
    }
}

class ICICI extends Bank{
    ICICI(){
        ROI=6.5;
    }
    void findROI(){
        System.out.println("ROI of ICICI Bank: "+ROI);
    }

}
class BOI extends Bank{
    BOI(){
        ROI=4.5;
    }
    void findROI(){
        System.out.println("ROI of BOI Bank: "+ROI+"%");
    }

}
public class ques3 {
    public static void main(String[] args){
        HDFC hdfc=new HDFC();
        ICICI icici=new ICICI();
        BOI boi=new BOI();
        Bank ref;
        ref=hdfc;
        ref.findROI();
        ref=icici;
        ref.findROI();
        ref=boi;
        ref.findROI();
    }
}