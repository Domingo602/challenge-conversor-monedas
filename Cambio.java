public class Cambio {
        private String baseCode;
        private String targetCode;
        private Double conversionRate;
        private Double conversionResult;
        private Double amount;

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String tarjetCode) {
        this.targetCode = tarjetCode;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Double getConversionResult() {
        return conversionResult;
    }

    public void setConversionResult(Double conversionResult) {
        this.conversionResult = conversionResult;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Cambio{" +
                "amount=" + amount +
                ", conversionResult=" + conversionResult +
                ", conversionRate=" + conversionRate +
                ", targetCode='" + targetCode + '\'' +
                ", baseCode='" + baseCode + '\'' +
                '}';
    }
}
