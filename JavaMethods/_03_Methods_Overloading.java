public class _03_Methods_Overloading
{

    static int calArea(int length, int breadth)
    {
        return length + breadth;
    }

    static float calArea(float radius)
    {
        return radius * radius * 3.14f;
    }

    static float calArea(float base, float height)
    {
        return base * height * 0.5f;
    }

    public static void main(String...args)
    {
        // Method overloading in java 
        // Multiple methods or functions can have same names , but different number of parameters
        int rectArea = calArea(12,13);
        float circleArea = calArea(4.5f);
        float triangleArea = calArea(6.6f,8.0f);

        System.out.printf("[+]Area of Rectangle : %d \n", rectArea);
        System.out.printf("[+]Area of Circle    : %f \n", circleArea);
        System.out.printf("[+]Area of Triangle  : %f \n", triangleArea);

    }
}

