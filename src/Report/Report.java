package Report;

import java.util.*;
class Report{
	private List<ReportItem> items;	// Отчетные данные(теперь содержат интерфейсы, на случай если реализация будет менятся)
	private StrategyReport reportPrint=null;
	// расчет отчетных данных(строк) я вынес в отдельный метод(класс), который передаю сюда через интерфейс.
	// это конечно спорно, но мне кажется оправдано - реализация данного класса(Report) не зависит от структуры строки.
	public Report calculate(ReportItemBuilder calculater){
		items =  new ArrayList<ReportItem>();
		items.add(calculater.addItem("First", (float)5));
		items.add(calculater.addItem("Second", (float)6));
		return this;
	}
	// тут очевидные улучшения - реализация назаначения отчета(принтер или дисплей) должна передоваться извне абстракцией.
	public Report addReportOutput(StrategyReport report){
		reportPrint = report;
		return this;
	}
	
	public void output(){
		if (reportPrint!=null)
			reportPrint.output(items);
	}
}