
public abstract class Vinho {
	public String Nome;
	public int Ano; 
	public float Valor;
	public String Cor;
	
	public Vinho(String n, int a, float v){
		this.Nome=n;
		this.Ano=a;
		this.Valor=v;
	}
	
	public void aumentaValor(float x){
		this.Valor=this.Valor+x;
	}

	public void maisVelho(){
		this.Ano=this.Ano+1;
		this.Valor=(float) (this.Valor*1.01);
	}
}
