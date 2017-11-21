
package bioinformatica2;

public class Bioinformatica2 {

    public static void main(String[] args) 
    {
       generatePatterns("",10);
    }
    public static void generatePatterns(String motif, int length)
    {
        if(length ==1)
        {
            System.out.println(motif+"A");
            System.out.println(motif+"C");
            System.out.println(motif+"G");
            System.out.println(motif+"T");
        }
        else
        {
            generatePatterns( motif + "A",length-1);
            generatePatterns( motif + "C",length-1);
            generatePatterns( motif + "G",length-1);
            generatePatterns( motif + "T",length-1);
        }
    }
}
