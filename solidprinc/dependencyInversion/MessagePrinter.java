package dependencyInversion;

import java.io.PrintWriter;
import java.io.Writer;

public class MessagePrinter {
	public void msgPrinter(Message msg,String fileName) throws Exception
	{
		JSONFormatter json = new JSONFormatter();
		PrintWriter p = new PrintWriter(fileName);
		p.write(json.formater(msg));

		// here if we want to change formater or awriter metho
		// d, then we need to add extra if check that is not correct way
		// instead of we need to remove dependency of object from here

	}

	public void msgPrinter1(Message msg,Formatter format, Writer w) throws Exception
	{
		w.write(format.formater(msg));

		// here if we want to change formater or awriter method, then we need to add extra if check that is not correct way
		// instead of we need to remove dependency of object from here

	}
}
