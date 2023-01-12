import suporte.resources.ChamadoImp;

public class Teste {
public static void main(String[] args) {
		
		ChamadoImp chamadoImp = new ChamadoImp();
		
		for(int a = 0; a < chamadoImp.consultarTodos().size(); a++) {
			System.out.println(chamadoImp.consultarTodos().get(a).getAssunto());
			System.out.println(chamadoImp.consultarTodos().get(a).getDataChamado());
			System.out.println(chamadoImp.consultarTodos().get(a).getDetalhe());
			System.out.println(chamadoImp.consultarTodos().get(a).getDevResponsavel());
			System.out.println(chamadoImp.consultarTodos().get(a).getSolicitante());
			System.out.println(chamadoImp.consultarTodos().get(a).getSolucaoExterna());
			System.out.println(chamadoImp.consultarTodos().get(a).getSolucaoTecnica());
			System.out.println(chamadoImp.consultarTodos().get(a).getId());
			System.out.println(chamadoImp.consultarTodos().get(a).getStatus());
			System.out.println("");
		}
		
		/*
		System.out.println(chamadoImp.consultarTodos().get(0).getAssunto());
		System.out.println(chamadoImp.consultarTodos().get(0).getDataChamado());
		System.out.println(chamadoImp.consultarTodos().get(0).getDetalhe());
		System.out.println(chamadoImp.consultarTodos().get(0).getDevResponsavel());
		System.out.println(chamadoImp.consultarTodos().get(0).getSolicitante());
		System.out.println(chamadoImp.consultarTodos().get(0).getSolucaoExterna());
		System.out.println(chamadoImp.consultarTodos().get(0).getSolucaoTecnica());
		System.out.println(chamadoImp.consultarTodos().get(0).getId());
		System.out.println(chamadoImp.consultarTodos().get(0).getStatus());
		*/
	}
}
