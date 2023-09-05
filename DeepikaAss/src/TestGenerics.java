interface GenDemo<T>
{
    void addFirst(T element);
    void append(T element);
    boolean searchElement(T element);
}
class Stack<T> implements GenDemo<T>
{
    T[] a;
    int index=-1;
    public Stack(T[] a) { this.a=a;}
    public boolean isFull()
    {
        return index==9;
    }
    public boolean isEmpty()
    {
        return index==-1;
    }
    public void push(T element)
    {
        if(!isFull())
            a[++index]=element;
        else 
            throw new RuntimeException("stack overflow :- cannot insert more elements");
    }
    public T pop()
    {
        if(!isEmpty())
            return a[index--];

        throw new RuntimeException("stack underflow :- cannot remove elements");
    }
    public void addFirst(T element)
    {
    	a[0]=element;
    	
    }
    public void append(T element)
    {
    	if(!isFull())
            a[a.length-1]=element;
    	else 
            throw new RuntimeException("stack overflow :- cannot insert more elements");
    }
    public boolean searchElement(T element)
    {
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i]==element)
    		{
    			
    			return true;
    		}
    	}
    	return false;
    	
    }
   
}
class StringStack implements GenDemo<String>
{
	String[] a;
    int index=-1;
    public StringStack(String[] a) { this.a=a;}
    public boolean isFull()
    {
        return index==9;
    }
    public boolean isEmpty()
    {
        return index==-1;
    }
    public void push(String element)
    {
        if(!isFull())
            a[++index]=element;
        else 
            throw new RuntimeException("stack overflow :- cannot insert more elements");
    }
    public String pop()
    {
        if(!isEmpty())
            return a[index--];

        throw new RuntimeException("stack underflow :- cannot remove elements");
    }
    public void addFirst(String element)
    {
    	a[0]=element;
    }
    public void append(String element)
    {
    	if(!isFull())
            a[a.length-1]=element;
    	else 
            throw new RuntimeException("stack overflow :- cannot insert more elements");
    }
    public boolean searchElement(String element)
    {
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i]==element)
    		{
    			
    			return true;
    		}
    	}
    	return false;
    	
    }
	
}
class TestGenerics
{
	public static void main(String args[])
	{
		Stack<Integer> st=new Stack<Integer>(new Integer[10]);
		st.push(1);
		st.push(2);
		st.addFirst(7);
		st.append(8);
		System.out.println(st.pop());
		System.out.println(st.searchElement(7));
		System.out.println("---------------");
		Stack<Double> std=new Stack<Double>(new Double[10]);
		std.push(11.0);
		std.push(22.4);
		std.addFirst(7.8);
		std.append(8.6);
		System.out.println(std.pop());
		System.out.println(std.searchElement(7.8));
		System.out.println("---------------");
		StringStack  ss=new StringStack (new String[10]);
		ss.push("hi");
		ss.push("hello");
		st.addFirst(7);
		ss.append("deepika");
		System.out.println(ss.pop());
		System.out.println(ss.searchElement("deepika"));
		
	}
	
}
