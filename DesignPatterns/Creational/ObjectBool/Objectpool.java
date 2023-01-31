package Creational.ObjectBool;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class Objectpool<T extends Poolable> {
	BlockingQueue<T> i;
	Objectpool(int n , Supplier<T> creator)
	{
		i = new LinkedBlockingQueue<>();
		for(int j = 0; j < n; j++){
			i.offer(creator.get());
		}
	}

	public T get()
	{
		try
		{
			i.take();
		}catch (Exception e)
		{

		}
		return null;
	}

	public void release(T obj)
	{
		obj.reset();
    i.add(obj);
	}
}
