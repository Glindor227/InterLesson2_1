package Report;

class Programm{
	public static void main(String[] args){
		Report report = new Report()
				.calculate(new ReportItemBuilderImpl())
				.addReportOutput(new PrintReport());
		report.output();

		// по идее calculate заного делать не надо - это же один отчет - просто добавляем ему разные стратегии вывода
		report.addReportOutput(new DisplayReport()).output();
	}
}