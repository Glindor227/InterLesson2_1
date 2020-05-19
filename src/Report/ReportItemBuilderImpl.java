package Report;

public class ReportItemBuilderImpl implements ReportItemBuilder{
    @Override
    public ReportItem addItem(String description, float amount) {
        return new ReportItemImpl(description,amount);
    }
}
