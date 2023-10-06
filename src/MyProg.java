import java.lang.reflect.*;

public class MyProg
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class c = Class.forName("NewClass");

        System.out.println(c.toGenericString());
        System.out.println("{");

        Field[] fields = c.getDeclaredFields();
        for (Field field : fields)
        {
            int mod = field.getModifiers();
            if (mod != 0)
                System.out.print("\t" + Modifier.toString(mod) + " ");
            else
                System.out.print("\t");
            System.out.println(field.getType() + " " + field.getName());
        }

        Constructor[] ca = c.getConstructors();
        for(Constructor cons: ca)
        {
            System.out.println("\t" + cons);
        }

        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods)
        {
            int mod = method.getModifiers();
            System.out.print("\t" + Modifier.toString(mod) + " " + method.getGenericReturnType());
            System.out.print(" " + method.getName() + "(");
            Parameter[] params = method.getParameters();
            for (int i = 0; i < params.length; i++)
            {
                if (i == params.length - 1)
                    System.out.print(params[i]);
                else
                    System.out.print(params[i] + ", ");
            }
            System.out.print(")");
            Type[] exceptions = method.getGenericExceptionTypes();
            for (int i = 0; i < exceptions.length; i++)
            {
                if (i == 0)
                    System.out.print(" Exception(s): " + exceptions[i] + ", ");
                else if (i < exceptions.length - 1)
                    System.out.print(exceptions[i] + ", ");
                else
                    System.out.print(exceptions[i]);
            }
            System.out.println();
        }
        System.out.println("}");
    }
}
