
class Hello{
    public static void main(String args[])
    {

        // String name = "Karthick";
        // //name = name + " reddy";
        // name  = "Katrf";
        // System.out.println(name);

        //String name = new String("Karthick");
        String name = "Karthick";
        //name = name + " Reddy";
        String name1 = "Karthick";
        System.out.println("Orginal :  "+ name);
        //System.out.println("Hello!! "+ name);
        // System.out.println(name.charAt(1));
        // System.out.println(name.concat(" Khan"));
        System.out.println(name.hashCode());
        System.out.println("Orginal :  "+ name1);
        System.out.println(name1.hashCode());

        StringBuffer sb = new StringBuffer("Java Programming");
        System.out.println(sb);
        System.out.println(sb.hashCode());
        sb = sb.append( " languahe");
        System.out.println(sb);
        System.out.println(sb.hashCode());

        String value ="hello";
        value = value.concat("world");
       
        System.out.println(value);
        
    } 
}




