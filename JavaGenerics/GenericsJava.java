
class GenericClass<T>
{
    // variable of T type 
    private T data;

    public GenericClass(T data)
    {
        this.data = data;
    }
    
    public T getData()
    {
        return this.data;
    }

}


class Main
{
    public static void main(String[] args)
    {
        GenericClass<String> name = new GenericClass("Pranay");
        System.out.println(name.getData());

        GenericClass<Integer> roll = new GenericClass(12);
        System.out.println(roll.getData());
    }
}

