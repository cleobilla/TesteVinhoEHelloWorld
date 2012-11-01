
public class VinhoTinto extends Vinho {
	
	public VinhoTinto(String n, int a, float v) {
		super(n, a, v);
		this.Cor="COlorado.";
	}

	public void aumentaValor(float x){
		float taxa=10/100;
		this.Valor=(this.Valor+x)*(1+taxa);
	}

}
