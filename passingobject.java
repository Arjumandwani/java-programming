public class passingobject {
    double height;
    double length;
    double width;
    public passingobject(double height,double width,double length)
    {
        this.height=height;
        this.length=length;
        this.width=width;
    
    System.out.println("the volume is" +height*length*width);
    }
    public passingobject(passingobject ob)
    {
   height=ob.height;
   length=ob.length;
   width=ob.width;
   System.out.println("the volume is" +height*length*width);
   
    }
}
