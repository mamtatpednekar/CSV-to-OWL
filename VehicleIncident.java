import com.opencsv.bean.CsvBindByName;

public class VehicleIncident {

    @CsvBindByName(column = "VIN (1-10)")
    private String hasVin;

    @CsvBindByName(column = "County")
    private String hasCounty;

    @CsvBindByName(column = "City")
    private String hasCity;

    @CsvBindByName(column = "ZIP Code")
    private String hasZip;

    @CsvBindByName(column = "Model Year")
    private String hasModelYear;

    @CsvBindByName(column = "Make")
    private String hasMake;

    @CsvBindByName(column = "Model")
    private String hasModel;

    // @csvBindByName(column = "Electric Vehicle Type\n")
    // private String has;

    @CsvBindByName(column = "Clean Alternative Fuel Vehicle (CAFV) Eligibility\n")
    private String hasCafvEligibility;

    @CsvBindByName(column = "Electric Range")
    private String hasRange;

    @CsvBindByName(column = "Base MSRP")
    private String hasBaseMsrp;

    @CsvBindByName(column = "Legislative District")
    private String hasLegislativeDistrict;

    @CsvBindByName(column = "DOL Vehicle ID")
    private String hasDolVehicleId;

    @CsvBindByName(column = "Vehicle Location")
    private String hasVehicleLocation;

    @CsvBindByName(column = "New or Used Vehicle")
    private String hasVehicleStatus;

    @CsvBindByName(column = "DOL Transaction Date")
    private String hasDolTransactionDate;

    @CsvBindByName(column = "Transaction Type\n")
    private String hasTransactionType;

    @CsvBindByName(column = "Transaction Year")
    private String hasTransactionYear;

    @CsvBindByName(column = "Electric Vehicle Fee Paid\n")
    private String hasElectricFeePaid;

    @CsvBindByName(column = "Meets 2019 HB 2042 Electric Range Requirement\n")
    private String hasElectricRangeRequirement;

    @CsvBindByName(column = "Meets 2019 HB 2042 Sale Date Requirement\n")
    private String hasSaleDateRequirement;

    @CsvBindByName(column = "Meets 2019 HB 2042 Sale Price/Value Requirement\n")
    private String hasSalePriceRequirement;

    @CsvBindByName(column = "Odometer Reading")
    private String hasOdometerReading;

    @CsvBindByName(column = "Odometer Code\n")
    private String hasOdometerCode;

    @CsvBindByName(column = "Transportation Electrification Fee Paid\n")
    private String hasTransportationFeePaid;

    @CsvBindByName(column = "Hybrid Vehicle Electrification Fee Paid\n")
    private String hasHybridFeePaid;

    public String getVin() {
        hasVin = null == hasVin ? "VIN" : hasVin;
        return hasVin;
    }

    public String getCounty() {
        hasCounty = null == hasCounty ? "County" : hasCounty;
        return hasCounty;
    }

    public String getCity() {
        hasCity = null == hasCity ? "City" : hasCity;
        return hasCity;
    }

    public String getZip() {
        hasZip = null == hasZip ? "Zip" : hasZip;
        return hasZip;
    }

    public String getModelYear() {
        hasModelYear = null == hasModelYear ? "VIN" : hasModelYear;
        return hasModelYear;
    }

    public String getVehicleLocation() {
        hasVehicleLocation = null == hasVehicleLocation ? "VIN" : hasVehicleLocation;
        return hasVehicleLocation;
    }

    public String getMake() {
        hasMake = null == hasMake ? "VIN" : hasMake;
        return hasMake;
    }

    public String getModel() {
        hasMake = null == hasMake ? "VIN" : hasMake;
        return hasMake;
    }
//    public String getEVehicleType () {
//        hasEVehicleType = null==hasEVehicleType ? "VIN" : hasEVehicleType;
//        return hasEVehicleType;
//    }

    public String getCafvEligibility() {
        hasCafvEligibility = null == hasCafvEligibility ? "VIN" : hasCafvEligibility;
        return hasCafvEligibility;
    }

    public String getRange() {
        hasRange = null == hasRange ? "VIN" : hasRange;
        return hasRange;
    }

    public String getBaseMsrp() {
        hasBaseMsrp = null == hasBaseMsrp ? "VIN" : hasBaseMsrp;
        return hasBaseMsrp;
    }

    public String getLegislativeDistrict() {
        hasLegislativeDistrict = null == hasLegislativeDistrict ? "VIN" : hasLegislativeDistrict;
        return hasLegislativeDistrict;
    }

    public String getDolVehicleId() {
        hasDolVehicleId = null == hasDolVehicleId ? "VIN" : hasDolVehicleId;
        return hasDolVehicleId;
    }

    public String getDolTransactionDate() {
        hasDolTransactionDate = null == hasDolTransactionDate ? "VIN" : hasDolTransactionDate;
        return hasDolTransactionDate;
    }

    public String getTransactionType() {
        hasTransactionType = null == hasTransactionType ? "VIN" : hasTransactionType;
        return hasTransactionType;
    }

    public String getTransactionYear() {
        hasTransactionYear = null == hasTransactionYear ? "VIN" : hasTransactionYear;
        return hasTransactionYear;
    }

    public String getElectricFeePaid() {
        hasElectricFeePaid = null == hasElectricFeePaid ? "VIN" : hasElectricFeePaid;
        return hasElectricFeePaid;
    }

    public String getElectricRangeRequirement() {
        hasElectricRangeRequirement = null == hasElectricRangeRequirement ? "VIN" : hasElectricRangeRequirement;
        return hasElectricRangeRequirement;
    }

    public String getSaleDateRequirement() {
        hasSaleDateRequirement = null == hasSaleDateRequirement ? "VIN" : hasSaleDateRequirement;
        return hasSaleDateRequirement;
    }

    public String getSalePriceRequirement() {
        hasSalePriceRequirement = null == hasSalePriceRequirement ? "VIN" : hasSalePriceRequirement;
        return hasSalePriceRequirement;
    }

    public String getOdometerReading() {
        hasOdometerReading = null == hasOdometerReading ? "VIN" : hasOdometerReading;
        return hasOdometerReading;
    }

    public String getOdometerCode() {
        hasOdometerCode = null == hasOdometerCode ? "VIN" : hasOdometerCode;
        return hasOdometerCode;
    }

    public String getTransportationFeePaid() {
        hasTransportationFeePaid = null == hasTransportationFeePaid ? "VIN" : hasTransportationFeePaid;
        return hasTransportationFeePaid;
    }

    public String getHybridFeePaid() {
        hasHybridFeePaid = null == hasHybridFeePaid ? "VIN" : hasHybridFeePaid;
        return hasHybridFeePaid;
    }

    public String getVehLocation() {
        hasVehicleLocation = null == hasVehicleLocation ? "VIN" : hasVehicleLocation;
        return hasVehicleLocation;
    }

    public String getVehicleStatus() {
        hasVehicleStatus = null == hasVehicleStatus ? "VIN" : hasVehicleStatus;
        return hasVehicleStatus;
    }

    public VehicleIncident setHasVin(String hasVin) {
        this.hasVin = hasVin;
        return this;
    }

    public VehicleIncident setHasCounty(String hasCounty) {
        this.hasCounty = hasCounty;
        return this;
    }

    public VehicleIncident setHasCity(String hasCity) {
        this.hasCity = hasCity;
        return this;
    }

    public VehicleIncident setHasZip(String hasZip) {
        this.hasZip = hasZip;
        return this;
    }

    public VehicleIncident setHasModelYear(String hasModelYear) {
        this.hasModelYear = hasModelYear;
        return this;
    }

    public VehicleIncident setHasMake(String hasMake) {
        this.hasMake = hasMake;
        return this;
    }

    public VehicleIncident setHasModel(String hasModel) {
        this.hasModel = hasModel;
        return this;
    }

//    public EV setHasEVehicleType(String hasEVehicleType) {
//        this.hasEVehicleType = hasEVehicleType;
//    }

    public VehicleIncident setHasCafvEligibility(String hasCafvEligibility) {
        this.hasCafvEligibility = hasCafvEligibility;
        return this;
    }

    public VehicleIncident setHasRange(String hasRange) {
        this.hasRange = hasRange;
        return this;
    }

    public VehicleIncident setHasBaseMsrp(String hasBaseMsrp) {
        this.hasBaseMsrp = hasBaseMsrp;
        return this;
    }

    public VehicleIncident setHasLegislativeDistrict(String hasLegislativeDistrict) {
        this.hasLegislativeDistrict = hasLegislativeDistrict;
        return this;
    }

    public VehicleIncident setHasDolVehicleId(String hasDolVehicleId) {
        this.hasDolVehicleId = hasDolVehicleId;
        return this;
    }

    public VehicleIncident setHasVehicleLocation(String hasVehicleLocation) {
        this.hasVehicleLocation = hasVehicleLocation;
        return this;
    }

    public VehicleIncident setHasVehicleStatus(String hasVehicleStatus) {
        this.hasVehicleStatus = hasVehicleStatus;
        return this;
    }

    public VehicleIncident setHasDolTransactionDate(String hasDolTransactionDate) {
        this.hasDolTransactionDate = hasDolTransactionDate;
        return this;
    }

    public VehicleIncident setHasTransactionType(String hasTransactionType) {
        this.hasTransactionType = hasTransactionType;
        return this;
    }

    public VehicleIncident setHasTransactionYear(String hasTransactionYear) {
        this.hasTransactionYear = hasTransactionYear;
        return this;
    }

    public VehicleIncident setHasElectricFeePaid(String hasElectricFeePaid) {
        this.hasElectricFeePaid = hasElectricFeePaid;
        return this;
    }

    public VehicleIncident setHasElectricRangeRequirement(String hasElectricRangeRequirement) {
        this.hasElectricRangeRequirement = hasElectricRangeRequirement;
        return this;
    }

    public VehicleIncident setHasSaleDateRequirement(String hasSaleDateRequirement) {
        this.hasSaleDateRequirement = hasSaleDateRequirement;
        return this;
    }

    public VehicleIncident setHasSalePriceRequirement(String hasSalePriceRequirement) {
        this.hasSalePriceRequirement = hasSalePriceRequirement;
        return this;
    }

    public VehicleIncident setHasOdometerReading(String hasOdometerReading) {
        this.hasOdometerReading = hasOdometerReading;
        return this;
    }

    public VehicleIncident setHasOdometerCode(String hasOdometerCode) {
        this.hasOdometerCode = hasOdometerCode;
        return this;
    }

    public VehicleIncident setHasTransportationFeePaid(String hasTransportationFeePaid) {
        this.hasTransportationFeePaid = hasTransportationFeePaid;
        return this;
    }

    public VehicleIncident setHasHybridFeePaid(String hasHybridFeePaid) {
        this.hasHybridFeePaid = hasHybridFeePaid;
        return this;
    }

    @Override
    public String toString() {
        return "VehicleIncident{" + "hasVin='" + hasVin + '\'' + ", hasCounty='" + hasCounty + '\'' + ", hasCity='"
                + hasCity + '\'' + ", hasZip='" + hasZip + '\'' + ", hasModelYear='" + hasModelYear + '\''
                + ", hasMake='" + hasMake + '\'' + ", hasModel='" + hasModel + '\'' + ", hasCafvEligibility='"
                + hasCafvEligibility + '\'' + ", hasRange='" + hasRange + '\'' + ", hasBaseMsrp='" + hasBaseMsrp + '\''
                + ", hasLegislativeDistrict='" + hasLegislativeDistrict + '\'' + ", hasDolVehicleId='" + hasDolVehicleId
                + '\'' + ", hasVehicleLocation='" + hasVehicleLocation + '\'' + ", getHasLegislativeDistrict='" + '\''
                + ", hasVehicleStatus='" + hasVehicleStatus + '\'' + ", hasDolTransactionDate='" + hasDolTransactionDate
                + '\'' + ", hasTransactionType='" + hasTransactionType + '\'' + ", hasTransactionYear='"
                + hasTransactionYear + '\'' + ", hasElectricFeePaid='" + hasElectricFeePaid + '\''
                + ", hasElectricRangeRequirement='" + hasElectricRangeRequirement + '\'' + ", hasSaleDateRequirement='"
                + hasSaleDateRequirement + '\'' + ", hasSalePriceRequirement='" + hasSalePriceRequirement + '\''
                + ", hasOdometerReading='" + hasOdometerReading + '\'' + ", hasOdometerCode='" + hasOdometerCode + '\''
                + ", hasTransportationFeePaid='" + hasTransportationFeePaid + '\'' + ", hasHybridFeePaid='"
                + hasHybridFeePaid + '\'' + '}';
    }
//	EV evObject = getEv(hasDolVehicleId).setHasVin(hasVin).setHasCounty(hasCounty).setHasCity(hasCity).setHasZip(hasZip)
//			.setHasModelYear(hasModelYear).setHasMake(hasMake).setHasModel(hasModel)
//			.setHasCafvEligibility(hasCafvEligibility).setHasRange(hasRange).setHasBaseMsrp(hasBaseMsrp)
//			.setHasLegislativeDistrict(hasLegislativeDistrict).setHasVehicleLocation(hasVehicleLocation)
//			.setHasVehicleStatus(hasVehicleStatus).setHasDolTransactionDate(hasDolTransactionDate)
//			.setHasTransactionType(hasTransactionType).setHasTransactionYear(hasTransactionYear)
//			.setHasElectricFeePaid(hasElectricFeePaid).setHasElectricRangeRequirement(hasElectricRangeRequirement)
//			.setHasSaleDateRequirement(hasSaleDateRequirement).setHasSalePriceRequirement(hasSalePriceRequirement)
//			.setHasOdometerReading(hasOdometerReading).setHasOdometerCode(hasOdometerCode)
//			.setHasTransportationFeePaid(hasTransportationFeePaid).setHasHybridFeePaid(hasHybridFeePaid);

//	evVehicle.put(hasDolVehicleId, evObject);

//	private static EV getEv(String ID) {
//		return evVehicle.containsKey(ID) ? evVehicle.get(ID) : EV.create(ID);
//	}
}
