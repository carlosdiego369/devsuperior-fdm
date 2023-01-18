package modulo04.capitulo15.labs.model.entities;

import java.util.Date;

public class Locadora {

	private String modelCar;
	private Date withdraw;
	private Date devolution;
	private Double valueForHour;
	private Double valueForDay;

	public Locadora() {
	}

	public Locadora(String modelCar, Date withdraw, Date devolution, Double valueForHour, Double valueForDay) {
		this.modelCar = modelCar;
		this.withdraw = withdraw;
		this.devolution = devolution;
		this.valueForHour = valueForHour;
		this.valueForDay = valueForDay;
	}

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public Date getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(Date withdraw) {
		this.withdraw = withdraw;
	}

	public Date getDevolution() {
		return devolution;
	}

	public void setDevolution(Date devolution) {
		this.devolution = devolution;
	}

	public Double getValueForHour() {
		return valueForHour;
	}

	public void setValueForHour(Double valueForHour) {
		this.valueForHour = valueForHour;
	}

	public Double getValueForDay() {
		return valueForDay;
	}

	public void setValueForDay(Double valueForDay) {
		this.valueForDay = valueForDay;
	}

	@SuppressWarnings("deprecation")
	public long basicPayment() {
		long minutes = devolution.getMinutes() - withdraw.getMinutes();
		long days = devolution.getDate() - withdraw.getDate();
//				TimeUnit.DAYS.convert(minutes, TimeUnit.MINUTES);

		long hour = devolution.getHours() - withdraw.getHours();

		if (days == 0 && hour < 12) {
			double conversion = (hour * 60) + minutes;
			double round = (hour + 1) - conversion;
			hour = (long) ((conversion + round) * valueForHour);
		} else if (days > 0 && minutes > 0) {
			hour = (long) ((days + 1) * valueForDay);
		} else {
			hour = (long) (days * valueForDay);
		}
		return hour;
	}

	public double tax() {
		if (basicPayment() < 100) {
			return basicPayment() * 0.20;
		} else {
			return basicPayment() * 0.15;
		}
	}

	public double total() {
		return basicPayment() + tax();
	}
}
