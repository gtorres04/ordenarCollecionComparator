import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenaSubcuenta="AVAE,ACAO,AVAO,ACAE";
		final String[] subcuentasPermitidas=cadenaSubcuenta.split(",");
		List<Subcuenta> listadoSubcuentas=getListado();
		Comparator<Subcuenta> comparator=new Comparator<Subcuenta>() {
			@Override
			public int compare( Subcuenta o1, Subcuenta o2) {
				for(int i=0;i<subcuentasPermitidas.length;i++){
					
					if(subcuentasPermitidas[i].equals(o2.getId())){
						return 1;
					}
					if(subcuentasPermitidas[i].equals(o1.getId())){
						return -1;
					}
				}
				return 0;
			}
		};
		Collections.sort(listadoSubcuentas,comparator);
		for (Subcuenta subcuenta : listadoSubcuentas) {
			System.out.println(subcuenta);
		}

	}
	public static List<Subcuenta> getListado(){
		List<Subcuenta> listado=new ArrayList<>();
		listado.add(new Subcuenta("ACAO","Aporte Consolidado Afiliado Ordinario"));
		listado.add(new Subcuenta("AVAE","Aporte Voluntario Afiliado Extraordinario"));
		listado.add(new Subcuenta("ACAE","Aporte Consolidado Afiliado Extraordinario"));
		listado.add(new Subcuenta("AVAO","Aporte Voluntario Afiliado Ordinario"));
		return listado;
	}
}
