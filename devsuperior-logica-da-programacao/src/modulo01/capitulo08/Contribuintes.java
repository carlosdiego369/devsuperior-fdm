package modulo01.capitulo08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Contribuintes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		relatorioFinal(input);

		input.close();

	}
	
	public static void relatorioFinal(Scanner input) {
		imprimir("Digite os dados do contribuinte: ");
		imprimir("\nRenda anual com salário: ");
		double rendaAnual = input.nextDouble();
		
		imprimir("Renda anual com prestação de serviço: ");
		double rendaAnualPrestacaoDeServico = input.nextDouble();
		
		imprimir("Renda anual com gasto de capital: ");
		double rendaAnualGastoCapital = input.nextDouble();
		
		imprimir("Gastos médicos: ");
		double gastosMedicos = input.nextDouble();
		
		imprimir("Gastos educacionais: ");
		double gastosEducacionais = input.nextDouble();
		
		
		
		imprimir("\nRELATÓRIO");
		
		imprimir("\nImposto sobre salário: ");
		conversor(impostoSobreSalario(rendaAnual));
		imprimir("\nImposto sobre serviços: ");
		conversor(impostoSobreServicos(rendaAnualPrestacaoDeServico));
		imprimir("\nImposto sobre ganho de capital: ");
		conversor(impostoSobreGastosCapital(rendaAnualGastoCapital));
		imprimir("\nImposto bruto total: ");
		conversor(impostoBrutoTotal(rendaAnual, rendaAnualPrestacaoDeServico, rendaAnualGastoCapital));
		imprimir("\nAbatimento: ");
		conversor(abatimento(rendaAnual, rendaAnualPrestacaoDeServico, rendaAnualGastoCapital, gastosMedicos, gastosEducacionais));
		imprimir("\nImposto devido: ");
		conversor(impostoDevido(rendaAnual, rendaAnualPrestacaoDeServico, rendaAnualGastoCapital, gastosMedicos, gastosEducacionais));
	}

	public static double impostoSobreSalario(double rendaAnual) {
		
		double impostoSobreSalario = 0;
		double rendaMensal = calculoDeRendaAnual(rendaAnual);
		
//		if(rendaMensal <= 3000) {
//			imprimir("Isento: ");
//		}else 
			if(rendaMensal > 3000 && rendaMensal <= 5000) {
			impostoSobreSalario = rendaAnual * 10 / 100;
		}else {
			impostoSobreSalario = rendaAnual * 20 / 100;
		}
		return impostoSobreSalario;
	}

	public static double impostoSobreServicos(double rendaAnualPrestacaoDeServico) {
		return rendaAnualPrestacaoDeServico * 15 / 100;
	}

	public static double impostoSobreGastosCapital(double rendaAnualGastoCapital) {
		return rendaAnualGastoCapital * 20 / 100;
	}
	
	public static double impostoBrutoTotal(double rendaAnual, double rendaAnualPrestacaoDeServico, double rendaAnualGastoCapital) {
		double impostoBrutoTotal = (impostoSobreSalario(rendaAnual) +
				  impostoSobreServicos(rendaAnualPrestacaoDeServico) +
				  impostoSobreGastosCapital(rendaAnualGastoCapital));
		return impostoBrutoTotal;
	}
	
	public static double abatimento(double rendaAnual, double rendaAnualPrestacaoDeServico, double rendaAnualGastoCapital, double gastosMedicos, double gastosEducacionais) {
		
		double abatimento;
		double percentualDeImpostos =  impostoSobreSalario(rendaAnual);
		percentualDeImpostos = (gastosMedicos + gastosEducacionais) * 100 / percentualDeImpostos;
		
		if(percentualDeImpostos < 30) {
			abatimento =  gastosMedicos + gastosEducacionais;
		}else {
			abatimento = (impostoBrutoTotal(rendaAnual, rendaAnualPrestacaoDeServico, rendaAnualGastoCapital) * 30) / 100;
		}
		return abatimento;
	}
	
	public static double impostoDevido(double rendaAnual, double rendaAnualPrestacaoDeServico, double rendaAnualGastoCapital, double gastosMedicos, double gastosEducacionais) {
		double impostoDevido = impostoBrutoTotal(rendaAnual, rendaAnualPrestacaoDeServico, rendaAnualGastoCapital) - abatimento(rendaAnual, rendaAnualPrestacaoDeServico, rendaAnualGastoCapital, gastosMedicos, gastosEducacionais);
		return impostoDevido;
	}
	

	public static double calculoDeRendaAnual(double rendaAnual) {
		return rendaAnual / 12;
	}
	
	public static void conversor(double num) {
		DecimalFormat df = new DecimalFormat("##0.00");
		imprimir(df.format(num));
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
