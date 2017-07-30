package src;

/**
 *
 * Rivera maquera carlos joel
 *  roger franco ortiz
 */
//nos muestra los intervalos de 2 *2
public class Tablero
{
	private int dim;
	private int[][] M;
	private boolean[][] X;

	public Tablero(int d)
	{
		dim = d;
		M = new int[dim][dim];
		X = new boolean[dim][dim];
	}
	public int getPos(int i, int j)
	{
		return M[i][j];
	}
        
	public boolean esClic(int i, int j)
	{
		return X[i][j];
	}
	public void clic(int i, int j)
	{
		X[i][j] = !X[i][j];
	}
	public int getDim()
	{
		return dim;
	}
	
	
}