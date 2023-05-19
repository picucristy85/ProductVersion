public class ProductVersion
{
    public static void main(String[] args)
    {
        String input = "{\"2.5.0 - dev.1\", \"2.4.2 - 5354\", \"2.4.2 - test.675\", \"2.4.1 - integration.1\"}";

        //1. eliminam acoladele
        input = input.replace("{", "").replace("}", "'");

        //2. Facem o lista cu versiunile separate prin virgula.
        String[] version = input.split("[,]", -1);

        //2. Parcurgem veriunile si cautam pe cea de production
        for (int i = 0; i < version.length; i++)
        {
            if (!ContineLitere(version[i]))
            {
                System.out.print(version[i]);
                break;
            }
        }

        System.out.println();;

    }

    private static boolean ContineLitere(String cuvant)
    {
        for (int i = 0; i < cuvant.length(); i++)
        {
            if (Character.isLetter(cuvant.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }
}
