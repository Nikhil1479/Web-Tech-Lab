public class MultilevelInheritance {
    public static void main(String[] args) {

        WoodBox w=new WoodBox(8,9, 5, 6);

        w.showProperties();
    }
}
class Plate{
    float width;
    float length;

    Plate(float width,float length){

        this.width=width;
        this.length=length;

    }

}
class Box extends Plate{

    float height;

    Box(float width,float height,float length ){
        super(width, length);
        this.height=height;
    }
}

class WoodBox extends Box{
    float thick;

    WoodBox(float width ,float height,float length,float thick){

        super(width, height, length);
        this.thick=thick;

    }

    void showProperties(){

        System.out.println("Length is"+length);
        System.out.println("Breath is"+width);
        System.out.println("Height is"+height);
        System.out.println("thickness is"+thick);


    }
}
