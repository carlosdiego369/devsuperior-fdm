package modulo01.capitulo04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioImposto {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		imprimir("Renda anual com salário: ");
		double rendaAnualSalario = input.nextDouble();
		imprimir("Renda anual com prestação de serviço: ");
		double rendaAnualPrestacaoServico = input.nextDouble();
		imprimir("Renda anual ganho de capital: ");
		double rendaAnualGanhoCapital = input.nextDouble();
		imprimir("Gastos médicos: ");
		double gastosMedicos = input.nextDouble();
		imprimir("Gastos educacionais: ");
		double gastosEducacionais = input.nextDouble();

		informacaoImpostoSalarial(rendaAnualSalario);
		informacaoImpostoServico(rendaAnualPrestacaoServico);
		informacaoImpostoGanhoCapital(rendaAnualGanhoCapital);
		informacoesDedutivas(rendaAnualSalario, rendaAnualPrestacaoServico, rendaAnualGanhoCapital, gastosMedicos,
				gastosEducacionais);
		informacaoResumo(rendaAnualSalario, rendaAnualPrestacaoServico, rendaAnualGanhoCapital, gastosMedicos,
				gastosEducacionais);

		input.close();

	}

	// Informadores

	public static void informacaoImpostoSalarial(double rendaAnualSalario) {

		imprimir("\nRELATÓRIO DE IMPOSTO DE RENDA");

		imprimir("\n\nCONSOLIDADO DE RENDA:");

		double mensal = calculoRendaMensal(rendaAnualSalario);

		if (mensal < 3000) {
			imprimir("\nImposto sobre salário: Isento");
		} else if (mensal >= 3000 && mensal < 5000) {
			mensal = calculoImpostoSobreSalario(rendaAnualSalario);
			imprimir("\nImposto sobre salário: ");
			conversorDouble(mensal);
		} else {
			mensal = calculoImpostoSobreSalario(rendaAnualSalario);
			imprimir("\nImposto sobre salário: ");
			conversorDouble(mensal);
		}

	}

	public static void informacaoImpostoServico(double rendaAnualPrestacaoServico) {
		double calculadora = calculoImpostoSobrePrestacaoServico(rendaAnualPrestacaoServico);

		imprimir("\nImposto sobre serviços: ");
		conversorDouble(calculadora);
	}

	public static void informacaoImpostoGanhoCapital(double rendaAnualGanhoCapital) {
		double calculadora = calculoImpostoSobreGanhoCapital(rendaAnualGanhoCapital);
		imprimir("\nImposto sobre ganho de capital: ");
		conversorDouble(calculadora);
	}

	public static void informacoesDedutivas(double rendaAnualSalario, double rendaAnualPrestacaoServico,
			double rendaAnualGanhoCapital, double gastosMedicos, double gastosEducacionais) {
		imprimir("\n\nDEDUÇÕES:");

		calculoDeducoes(rendaAnualSalario, rendaAnualPrestacaoServico, rendaAnualGanhoCapital, gastosMedicos,
				gastosEducacionais);
	}

	public static void informacaoResumo(double rendaAnualSalario, double rendaAnualPrestacaoServico,
			double rendaAnualGanhoCapital, double gastosMedicos, double gastosEducacionais) {
		imprimir("\n\nRESUMO:");
		calculoResumo(rendaAnualSalario, rendaAnualPrestacaoServico, rendaAnualGanhoCapital, gastosMedicos,
				gastosEducacionais);
	}

	// Calculos

	public static double calculoImpostoSobreSalario(double rendaAnualSalario) {
		double mensal = calculoRendaMensal(rendaAnualSalario);

		if (mensal >= 3000 && mensal < 5000) {
			rendaAnualSalario = (rendaAnualSalario * 10) / 100;
		} else {
			rendaAnualSalario = (rendaAnualSalario * 20) / 100;
		}
		return rendaAnualSalario;
	}

	public static double calculoImpostoSobrePrestacaoServico(double rendaAnualPrestacaoServico) {
		double calculadora = (rendaAnualPrestacaoServico * 15) / 100;
		return calculadora;
	}

	public static double calculoImpostoSobreGanhoCapital(double rendaAnualGanhoCapital) {
		double calculadora = (rendaAnualGanhoCapital * 20) / 100;
		return calculadora;
	}

	public static double calculoRendaMensal(double rendaAnualSalario) {
		double calculadora = rendaAnualSalario / 12;
		return calculadora;
	}

	public static double calculoDeducoes(double rendaAnualSalario, double rendaAnualPrestacaoServico,
			double rendaAnualGanhoCapital, double gastosMedicos, double gastosEducacionais) {

		double maximoDedutivel = calculoImpostoSobreSalario(rendaAnualSalario)
				+ calculoImpostoSobrePrestacaoServico(rendaAnualPrestacaoServico)
				+ calculoImpostoSobreGanhoCapital(rendaAnualGanhoCapital);

		maximoDedutivel = (maximoDedutivel * 30) / 100;

		imprimir("\nMáximo dedutível: ");
		conversorDouble(maximoDedutivel);

		double gastosDedutiveis = gastosMedicos + gastosEducacionais;
		imprimir("\nGastos dedutíveis: ");
		conversorDouble(gastosDedutiveis);

		return rendaAnualGanhoCapital;
	}

	public static double calculoResumo(double rendaAnualSalario, double rendaAnualPrestacaoServico,
			double rendaAnualGanhoCapital, double gastosMedicos, double gastosEducacionais) {

		double impostoBrutoTotal = calculoImpostoSobreSalario(rendaAnualSalario)
				+ calculoImpostoSobrePrestacaoServico(rendaAnualPrestacaoServico)
				+ calculoImpostoSobreGanhoCapital(rendaAnualGanhoCapital);

		imprimir("\nImposto bruto total: ");
		conversorDouble(impostoBrutoTotal);

		boolean impostoBrutoDevido = gastosMedicos + gastosEducacionais > calculoImpostoSobreSalario(rendaAnualSalario)
				+ calculoImpostoSobrePrestacaoServico(rendaAnualPrestacaoServico)
				+ calculoImpostoSobreGanhoCapital(rendaAnualGanhoCapital);

		double abatimento = 0;

		if (impostoBrutoDevido) {
			abatimento = (impostoBrutoTotal * 30) / 100;
		} else {
			abatimento = gastosMedicos + gastosEducacionais;
		}

		imprimir("\nAbatimento: ");
		conversorDouble(abatimento);

		double impostoDevido = (impostoBrutoTotal - abatimento);
		imprimir("\nImposto devido: ");
		conversorDouble(impostoDevido);

		return impostoBrutoTotal;
	}

	// Conversores

	public static void conversorDouble(double num) {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		imprimir(df.format(num));
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
