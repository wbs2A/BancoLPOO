package controller;

public abstract class DAO{
	

	/**
 * Metodo para deserializar
 * 
 */
public  Object deserializar(String path) throws Exception
{
	FileInputStream inFile = new FileInputStream(path);
	Object o;
	try (ObjectInputStream d = new ObjectInputStream(inFile))
	{
		o = d.readObject();
	}
	return o;
}



/**
 * 
 * Metodo para serializar
 * 
 */
public  void serializar(String path, Object obj) throws Exception
{
	FileOutputStream outFile = new FileOutputStream(path);
	try (ObjectOutputStream s = new ObjectOutputStream(outFile))
	{
		s.writeObject(obj);
	}

}

	abstract void create();
	abstract Object read();
	abstract void update();
	abstract void delete();
}
