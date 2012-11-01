
public class VinhoBranco extends Vinho {
	
	public VinhoBranco(String n, int a, float v) {
		super(n, a, v);
		this.Cor="Branco";
	}
	
	public void maisVelho(int y){
		this.Ano=this.Ano+y;
		this.Valor=(float) (this.Valor*1.10);
	}
	
	public void maisVelho(){
		this.Ano=this.Ano+1;
		this.Valor=(float) (this.Valor*1.10);
	}
}
