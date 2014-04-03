
public class Matrix {

	private double[][] matrixArray;
	int i;
	int j;

	public Matrix(Matrix matrix){
		this.matrixArray = matrix.matrixArray;
	}

	public Matrix(double gelenArray[][]){
		this.matrixArray = gelenArray;
	}

	public Matrix(int x, int y){
		this.matrixArray = new double[x][y];
		i = x;
		j = y;
	}

	public Matrix createCopy(Matrix matrix){
		Matrix yedekMatrix =  matrix;
		return yedekMatrix;
	}

	public void setElement(int i, int j, double gelenSayi){
		matrixArray[i-1][j-1] = gelenSayi;
	}

	public double getElement(int i, int j){
		return matrixArray[i-1][j-1];
	}

	public int getRowCount(){
		return j;
	}

	public int getColCount(){
		return i;
	}	

	public void print(){

		for (int a = 0; a < i; a++) {
			for (int b = 0; b < j; b++) {
				System.out.print(matrixArray[a][b] + "   ");
			}
			System.out.println();
		}

	}

	public void add(Matrix eklenecekMatris){
		if(this.i != eklenecekMatris.i && this.j != eklenecekMatris.j)
			System.out.println("Toplamak istediğiniz matrislerin i ve j leri "
					+ "birbirine eşit değildir. ");
			
			
			for (int a = 0; a < i; a++) {
				for (int b = 0; b < j; b++) {
					this.matrixArray[a][b] += eklenecekMatris.matrixArray[a][b];
				}
			}

	}
	
	public void add(double eklenecekSayi){
		for (int a = 0; a < i; a++) {
			for (int b = 0; b < j; b++) {
				this.matrixArray[a][b] += eklenecekSayi;
			}
		}
	}

}
