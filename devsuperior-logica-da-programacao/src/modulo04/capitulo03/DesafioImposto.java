package modulo04.capitulo03;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class DesafioImposto {

	public static void main(String[] args) {
		inputDados();
	}

	public static void inputDados() {

		imprimir("Renda anual com salário: ");
		double rendaAnualSalario = inputNum();

		imprimir("Renda anual com prestação de serviço: ");
		double rendaAnualPrestacaoServico = inputNum();

		imprimir("Renda anual com ganho de capital: ");
		double rendaAnualCapital = inputNum();

		imprimir("Gastos médicos: ");
		double gastosMedicos = inputNum();

		imprimir("Gastos educacionais: ");
		double gastosEducacionais = inputNum();

		relatorioDeImpostoDeRenda(rendaAnualSalario, rendaAnualPrestacaoServico, rendaAnualCapital, gastosMedicos,
				gastosEducacionais);
	}

	public static void relatorioDeImpostoDeRenda(double rendaAnualSalario, double rendaAnualPrestacaoServico,
			double rendaAnualCapital, double gastosMedicos, double gastosEducacionais) {

		DecimalFormat df = new DecimalFormat("##0.00");

		String info = "";

		info += "\nRELATÓRIO DE IMPOSTO DE RENDA" + "\n\nCONSOLIDADO DE RENDA:" + "\nImposto sobre salário: ";
		if (verificadorDeSalarioMensal(rendaAnualSalario) < 3000) {
			info += "Isento";
		} else {
			info += df.format(verificadorDeImpostoSobreSalario(rendaAnualSalario));
		}
		info += "\nImpostos sobre serviços: " + df.format(verificadorDeImpostoSobreServicos(rendaAnualPrestacaoServico))
				+ "\nImpostos sobre ganho de capital: "
				+ df.format(verificadorDeImpostoSobreGanhoCapital(rendaAnualCapital)) +

				("\n\nDEDUÇÕES:") + ("\nMáximo dedutível: ")
				+ df.format(verificadorDeMaximoDedutiveis(rendaAnualSalario, rendaAnualPrestacaoServico,
						rendaAnualCapital, gastosMedicos, gastosEducacionais))
				+ ("\nGastos dedutíveis: ")
				+ df.format(verificadorDeGastosDedutiveis(gastosMedicos, gastosEducacionais)) +

				"\n\nRESUMO:" + "\nImposto bruto total: " + df.format(verificadorImpostoBrutoTotal(rendaAnualSalario,
						rendaAnualPrestacaoServico, rendaAnualCapital, gastosMedicos, gastosEducacionais))
				+ "\nAbatimentro: "
				+ df.format(verificadorAbatimento(rendaAnualSalario, rendaAnualPrestacaoServico, rendaAnualCapital,
						gastosMedicos, gastosEducacionais))
				+ "\nImposto devido: " + df.format(verificadorImpostoDevido(rendaAnualSalario,
						rendaAnualPrestacaoServico, rendaAnualCapital, gastosMedicos, gastosEducacionais));

		imprimir(info);
	}

	public static double verificadorDeSalarioMensal(double rendaAnualSalario) {
		double salarioMensal = rendaAnualSalario / 12;
		return salarioMensal;
	}

	public static double verificadorDeImpostoSobreSalario(double rendaAnualSalario) {

		verificadorDeSalarioMensal(rendaAnualSalario);

		if (verificadorDeSalarioMensal(rendaAnualSalario) >= 3000
				&& verificadorDeSalarioMensal(rendaAnualSalario) <= 5000) {
			rendaAnualSalario = (rendaAnualSalario * 10) / 100;
		} else if (verificadorDeSalarioMensal(rendaAnualSalario) > 5000) {
			rendaAnualSalario = (rendaAnualSalario * 20) / 100;
		}

		return rendaAnualSalario;
	}

	public static double verificadorDeImpostoSobreServicos(double rendaAnualPrestacaoServico) {

		rendaAnualPrestacaoServico = (rendaAnualPrestacaoServico * 15) / 100;

		return rendaAnualPrestacaoServico;
	}

	public static double verificadorDeImpostoSobreGanhoCapital(double rendaAnualCapital) {

		rendaAnualCapital = (rendaAnualCapital * 20) / 100;

		return rendaAnualCapital;
	}

	public static double verificadorDeMaximoDedutiveis(double rendaAnualSalario, double rendaAnualPrestacaoServico,
			double rendaAnualCapital, double gastosMedicos, double gastosEducacionais) {

		double maximoDedutivel = verificadorDeImpostoSobreSalario(rendaAnualSalario)
				+ verificadorDeImpostoSobreServicos(rendaAnualPrestacaoServico)
				+ verificadorDeImpostoSobreGanhoCapital(rendaAnualCapital);

		maximoDedutivel = (maximoDedutivel * 30) / 100;

		return maximoDedutivel;
	}

	public static double verificadorDeGastosDedutiveis(double gastosMedicos, double gastosEducacionais) {

		double totalGastosDedutiveis = gastosMedicos + gastosEducacionais;

		return totalGastosDedutiveis;
	}

	public static double verificadorImpostoBrutoTotal(double rendaAnualSalario, double rendaAnualPrestacaoServico,
			double rendaAnualCapital, double gastosMedicos, double gastosEducacionais) {

		double impostoBrutoTotal = verificadorDeImpostoSobreSalario(rendaAnualSalario)
				+ verificadorDeImpostoSobreServicos(rendaAnualPrestacaoServico)
				+ verificadorDeImpostoSobreGanhoCapital(rendaAnualCapital);

		return impostoBrutoTotal;
	}

	public static double verificadorAbatimento(double rendaAnualSalario, double rendaAnualPrestacaoServico,
			double rendaAnualCapital, double gastosMedicos, double gastosEducacionais) {
		double abatimento;
		boolean validacaoAbatimentro = ((verificadorDeGastosDedutiveis(gastosMedicos, gastosEducacionais) * 100) / 
				verificadorImpostoBrutoTotal(rendaAnualSalario, rendaAnualPrestacaoServico, rendaAnualCapital, 
						gastosMedicos, gastosEducacionais)) > 30;
		
		if(validacaoAbatimentro) {
			abatimento = verificadorDeMaximoDedutiveis(rendaAnualSalario, rendaAnualPrestacaoServico,
					rendaAnualCapital, gastosMedicos, gastosEducacionais);
		}else {
			abatimento = verificadorDeGastosDedutiveis(gastosMedicos, gastosEducacionais);
		}
		
		return abatimento;
	}

	public static double verificadorImpostoDevido(double rendaAnualSalario, double rendaAnualPrestacaoServico,
			double rendaAnualCapital, double gastosMedicos, double gastosEducacionais) {

		double impostoDevido = verificadorImpostoBrutoTotal(rendaAnualSalario, rendaAnualPrestacaoServico,
				rendaAnualCapital, gastosMedicos, gastosEducacionais)
				- verificadorAbatimento(rendaAnualSalario, rendaAnualPrestacaoServico, rendaAnualCapital, gastosMedicos,
						gastosEducacionais);

		return impostoDevido;
	}

	public static double inputNum() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		return num;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}
}
