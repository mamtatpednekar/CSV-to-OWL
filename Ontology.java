import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import org.apache.jena.ontology.*;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.shared.InvalidPropertyURIException;
import org.apache.jena.vocabulary.XSD;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ontology {
    public static void main(String[] args) throws Exception {
        OntModel m;
        String NS = "http://example.com/Vehicle#";
        m = ModelFactory.createOntologyModel();
//        List<VehicleIncident> vehicleInstance = new ArrayList();
//        Path path = Paths.get("./Electric_Vehicle_Title_and_Registration_Activity.csv");
//        vehicleInstance = readCsvToBeanList(path, VehicleIncident.class, vehicleInstance);
//        List<VehicleIncident> evInstance = new ArrayList();
//        Path path_ev = Paths.get("./Electric_Vehicle_Population_Data(1).csv");
//        evInstance = readCsvToBeanList(path_ev, VehicleIncident.class, evInstance);

        List<VehicleIncident> vehicleInstance = new CsvToBeanBuilder(new FileReader(
                "src//Electric_Vehicle_Title_and_Registration_Activity.csv"))
                .withType(VehicleIncident.class).build().parse();

        List<VehicleIncident> evInstance = new CsvToBeanBuilder(
                new FileReader("src//Electric_Vehicle_Population_Data(1).csv"))
                .withType(VehicleIncident.class).build().parse();

        OntClass Vehicle_Repository = m.createClass(NS + "vehicle_repository/");
        OntClass Vehicle_Data = m.createClass(NS + "vehicle_data/");
        OntClass Vehicle_Registration = m.createClass(NS + "vehicle_registration/");
        OntClass Model_details = m.createClass(NS + "model_details/");
        OntClass Transaction_and_Payment = m.createClass(NS + "transaction_and_payment/");
        OntClass Range_Requirements = m.createClass(NS + "range_requirements/");
        OntClass Mileage = m.createClass(NS + "mileage/");

        Vehicle_Repository.addSubClass(Vehicle_Data);
        Vehicle_Repository.addSubClass(Vehicle_Registration);
        Vehicle_Repository.addSubClass(Model_details);
        Vehicle_Repository.addSubClass(Transaction_and_Payment);
        Vehicle_Repository.addSubClass(Range_Requirements);
        Vehicle_Repository.addSubClass(Mileage);

        OntClass Address = m.createClass(NS + "address");
        OntClass City = m.createClass(NS + "city");
        OntClass County = m.createClass(NS + "county");
        OntClass Zip = m.createClass(NS + "zip");

        Address.addSubClass(City);
        Address.addSubClass(County);
        Address.addSubClass(Zip);

        // Object Properties
        ObjectProperty comprises = m.createObjectProperty(NS + "comprises/");
        ObjectProperty contains = m.createObjectProperty(NS + "contains/");
        ObjectProperty determines = m.createObjectProperty(NS + "determines/");
        ObjectProperty fetches = m.createObjectProperty(NS + "fetches/");
        ObjectProperty interprets = m.createObjectProperty(NS + "interprets/");
        ObjectProperty satisfies = m.createObjectProperty(NS + "satisfies/");
        ObjectProperty vd = m.createObjectProperty(NS + "hasVehicleData/");

        // Domain and Range for object properties
        comprises.addDomain(Vehicle_Repository);
        comprises.addRange(Vehicle_Registration);
        contains.addDomain(Vehicle_Repository);
        contains.addRange(Model_details);
        determines.addDomain(Vehicle_Repository);
        determines.addRange(Vehicle_Data);
        fetches.addDomain(Vehicle_Repository);
        fetches.addRange(Transaction_and_Payment);
        interprets.addDomain(Vehicle_Repository);
        interprets.addRange(Mileage);
        satisfies.addDomain(Vehicle_Repository);
        satisfies.addRange(Range_Requirements);
        vd.addDomain(Vehicle_Repository);
        vd.addRange(Mileage);

        // Data Properties
        DatatypeProperty hasAddress = m.createDatatypeProperty(NS + "hasAddress/");
        hasAddress.addDomain(Vehicle_Registration);
        hasAddress.addRange(XSD.xstring);
        DatatypeProperty hasCity = m.createDatatypeProperty(NS + "hasCity/");
        hasCity.addDomain(Vehicle_Registration);
        hasCity.addRange(XSD.xstring);
        DatatypeProperty hasCounty = m.createDatatypeProperty(NS + "hasCounty/");
        hasCounty.addDomain(Vehicle_Registration);
        hasCounty.addRange(XSD.xstring);
        DatatypeProperty hasZip = m.createDatatypeProperty(NS + "hasZip/");
        hasZip.addDomain(Vehicle_Registration);
        hasZip.addRange(XSD.xstring);
        DatatypeProperty hasBaseMsrp = m.createDatatypeProperty(NS + "hasBaseMsrp/");
        hasBaseMsrp.addDomain(Vehicle_Data);
        hasBaseMsrp.addRange(XSD.integer);
        DatatypeProperty hasCafvEligibity = m.createDatatypeProperty(NS + "hasCafvEligibity/");
        hasCafvEligibity.addDomain(Vehicle_Data);
        hasCafvEligibity.addRange(XSD.xstring);
        DatatypeProperty hasDolTransactionDate = m.createDatatypeProperty(NS + "hasDolTransactionDate/");
        hasDolTransactionDate.addDomain(Vehicle_Registration);
        hasDolTransactionDate.addRange(XSD.dateTime);
        DatatypeProperty hasDolVehicleId = m.createDatatypeProperty(NS + "hasDolVehicleId/");
        hasDolVehicleId.addDomain(Vehicle_Registration);
        hasDolVehicleId.addRange(XSD.integer);
        DatatypeProperty hasLegislativeDistrict = m.createDatatypeProperty(NS + "hasLegislativeDistrict/");
        hasLegislativeDistrict.addDomain(Vehicle_Data);
        hasLegislativeDistrict.addRange(XSD.integer);
        DatatypeProperty hasMake = m.createDatatypeProperty(NS + "hasMake/");
        hasMake.addDomain(Model_details);
        hasMake.addRange(XSD.xstring);
        DatatypeProperty hasModelYear = m.createDatatypeProperty(NS + "hasModelYear/");
        hasModelYear.addDomain(Model_details);
        hasModelYear.addRange(XSD.integer);
        DatatypeProperty hasMSR = m.createDatatypeProperty(NS + "hasMSR/");
        hasMSR.addDomain(Vehicle_Data);
        hasMSR.addRange(XSD.integer);
        DatatypeProperty hasOdometerCode = m.createDatatypeProperty(NS + "hasOdometerCode/");
        hasOdometerCode.addDomain(Mileage);
        hasOdometerCode.addRange(XSD.xstring);
        DatatypeProperty hasOdometerReading = m.createDatatypeProperty(NS + "hasOdometerReading/");
        hasOdometerReading.addDomain(Mileage);
        hasOdometerReading.addRange(XSD.integer);
        DatatypeProperty hasRange = m.createDatatypeProperty(NS + "hasRange/");
        hasRange.addDomain(Vehicle_Data);
        hasRange.addRange(XSD.integer);
        DatatypeProperty hasTransactionType = m.createDatatypeProperty(NS + "hasTransactionType/");
        hasTransactionType.addDomain(Transaction_and_Payment);
        hasTransactionType.addRange(XSD.xstring);
        DatatypeProperty hasTransactionYear = m.createDatatypeProperty(NS + "hasTransactionYear/");
        hasTransactionYear.addDomain(Transaction_and_Payment);
        hasTransactionYear.addRange(XSD.integer);
        DatatypeProperty hasType = m.createDatatypeProperty(NS + "hasType/");
        hasType.addDomain(Vehicle_Data);
        hasType.addRange(XSD.xstring);
        DatatypeProperty hasVehicleLocation = m.createDatatypeProperty(NS + "hasVehicleLocation/");
        hasVehicleLocation.addDomain(Vehicle_Data);
        hasVehicleLocation.addRange(XSD.xstring);
        DatatypeProperty hasVehicleStatus = m.createDatatypeProperty(NS + "hasVehicleStatus/");
        hasVehicleStatus.addDomain(Model_details);
        hasVehicleStatus.addRange(XSD.xstring);
        DatatypeProperty hasVin = m.createDatatypeProperty(NS + "hasVin/");
        hasVin.addDomain(Vehicle_Registration);
        hasVin.addRange(XSD.xstring);
        DatatypeProperty meetsElectricRangeRequirement = m
                .createDatatypeProperty(NS + "meetsElectricRangeRequirement/");
        meetsElectricRangeRequirement.addDomain(Range_Requirements);
        meetsElectricRangeRequirement.addRange(XSD.xboolean);
        DatatypeProperty meetsSaleDateRequirement = m.createDatatypeProperty(NS + "meetsSaleDateRequirement/");
        meetsSaleDateRequirement.addDomain(Range_Requirements);
        meetsSaleDateRequirement.addRange(XSD.xboolean);
        DatatypeProperty meetsSalePriceRequirement = m.createDatatypeProperty(NS + "meetsSalePriceRequirement/");
        meetsSalePriceRequirement.addDomain(Range_Requirements);
        meetsSalePriceRequirement.addRange(XSD.xboolean);
        DatatypeProperty hasElectricFeePaid = m.createDatatypeProperty(NS + "hasElectricFeePaid/");
        hasElectricFeePaid.addDomain(Range_Requirements);
        hasElectricFeePaid.addRange(XSD.xstring);
        DatatypeProperty paidHybridElectricFee = m.createDatatypeProperty(NS + "paidHybridElectricFee/");
        paidHybridElectricFee.addDomain(Transaction_and_Payment);
        paidHybridElectricFee.addRange(XSD.xstring);
        DatatypeProperty hasTransportationFeePaid = m.createDatatypeProperty(NS + "hasTransportationFeePaid/");
        hasTransportationFeePaid.addDomain(Transaction_and_Payment);
        hasTransportationFeePaid.addRange(XSD.xstring);

        for (VehicleIncident v : vehicleInstance) {
            OntClass vehicleIncident = m.getOntClass(NS + "vehicle_repository/");
            OntClass vehicleData = m.getOntClass(NS + "vehicle_data/");
            OntClass vehicleRegis = m.getOntClass(NS + "vehicle_registration/");
            OntClass vehicleModel = m.getOntClass(NS + "model_details/");
            OntClass transAndPay = m.getOntClass(NS + "transaction_and_payment/");
            OntClass rangeReq = m.getOntClass(NS + "range_requirements/");
            OntClass mileage = m.getOntClass(NS + "mileage/");
            Individual vehicleregis = vehicleRegis.createIndividual(NS + v.getDolTransactionDate());
            Individual modeldetails = vehicleModel.createIndividual(NS + v.getVin() + v.getVehicleStatus());
            Individual mileageIns = mileage.createIndividual(NS + v.getOdometerCode());
            Individual incident = vehicleIncident.createIndividual(NS + v.getVin() + v.getDolVehicleId());
            Individual vehicledata = vehicleData.createIndividual(NS + v.getDolVehicleId());
            Individual transaction = transAndPay.createIndividual(NS + v.getDolVehicleId() + v.getTransactionType());
            Individual rangeIns = rangeReq.createIndividual(NS + v.getDolVehicleId() + v.getSaleDateRequirement());

            m.add(incident, m.getProperty(NS + "hasDolVehicleId"), v.getDolVehicleId());
            m.add(incident, m.getProperty(NS + "determines"), vehicledata);
            m.add(incident, m.getProperty(NS + "comprises"), vehicleRegis);
            m.add(incident, m.getProperty(NS + "contains"), modeldetails);
            m.add(incident, m.getProperty(NS + "interprets"), mileageIns);
            m.add(incident, m.getProperty(NS + "fetches"), transaction);
            m.add(incident, m.getProperty(NS + "satisfies"), rangeIns);

            m.add(vehicleregis, m.getProperty(NS + "hasCity"), v.getCity());
            m.add(vehicleregis, m.getProperty(NS + "hasCounty"), v.getCounty());
            m.add(vehicleregis, m.getProperty(NS + "hasZip"), v.getZip());
            m.add(vehicleregis, m.getProperty(NS + "hasDolTransactionDate"), v.getDolTransactionDate());
            m.add(vehicleregis, m.getProperty(NS + "hasDolVehicleId"), v.getDolVehicleId());
            m.add(vehicleregis, m.getProperty(NS + "hasVin"), v.getVin());

            m.add(vehicledata, m.getProperty(NS + "hasBaseMsrp"), v.getBaseMsrp());
            m.add(vehicledata, m.getProperty(NS + "hasLegislativeDistrict"), v.getLegislativeDistrict());
            m.add(vehicledata, m.getProperty(NS + "hasCafvEligibity"), v.getCafvEligibility());
            m.add(vehicledata, m.getProperty(NS + "hasRange"), v.getRange());
            m.add(vehicledata, m.getProperty(NS + "hasTransactionType"), v.getTransactionType());
            m.add(vehicledata, m.getProperty(NS + "hasVehicleLocation"), v.getVehicleLocation());

            m.add(modeldetails, m.getProperty(NS + "hasMake"), v.getMake());
            m.add(modeldetails, m.getProperty(NS + "hasModelYear"), v.getModelYear());
            m.add(modeldetails, m.getProperty(NS + "hasVehicleStatus"), v.getVehicleStatus());

            m.add(mileageIns, m.getProperty(NS + "hasOdometerCode"), v.getOdometerCode());
            m.add(mileageIns, m.getProperty(NS + "hasOdometerReading"), v.getOdometerReading());

            m.add(transaction, m.getProperty(NS + "hasTransactionType"), v.getTransactionType());
            m.add(transaction, m.getProperty(NS + "hasTransactionYear"), v.getTransactionYear());
            m.add(transaction, m.getProperty(NS + "hasPaidHybridElectricFee"), v.getHybridFeePaid());
            m.add(transaction, m.getProperty(NS + "hasTransportationFeePaid"), v.getTransportationFeePaid());

            m.add(rangeIns, m.getProperty(NS + "meetsElectricRangeRequirement"), v.getElectricRangeRequirement());
            m.add(rangeIns, m.getProperty(NS + "meetsSaleDateRequirement"), v.getSaleDateRequirement());
            m.add(rangeIns, m.getProperty(NS + "meetsSalePriceRequirement"), v.getSalePriceRequirement());
            m.add(rangeIns, m.getProperty(NS + "hasElectricFeePaid"), v.getElectricFeePaid());

//			m.add(incident, m.getProperty(NS + "determines"), vehicleModel);
//			m.add(incident, m.getProperty(NS + "determines"), transAndPay);
//			m.add(incident, m.getProperty(NS + "determines"), rangeReq);
//			m.add(incident, m.getProperty(NS + "determines"), mileage);

//			m.add(incident, m.getProperty(NS + "hasModelYear"), v.getModelYear());
//			m.add(incident, m.getProperty(NS + "hasMake"), v.getMake());
//			m.add(incident, m.getProperty(NS + "hasModel"), v.getModel());
//			m.add(incident, m.getProperty(NS + "hasVehicleStatus"), v.getVehicleStatus());
//			m.add(incident, m.getProperty(NS + "hasDolTransactionDate"), v.getDolTransactionDate());
//			m.add(incident, m.getProperty(NS + "hasTransactionType"), v.getTransactionType());
//			m.add(incident, m.getProperty(NS + "hasTransactionYear"), v.getTransactionYear());
//			m.add(incident, m.getProperty(NS + "hasElectricFeePaid"), v.getElectricFeePaid());
//			m.add(incident, m.getProperty(NS + "hasCounty"), v.getCounty());
//			m.add(incident, m.getProperty(NS + "hasCity"), v.getCity());
//			m.add(incident, m.getProperty(NS + "hasZip"), v.getZip());
//			m.add(incident, m.getProperty(NS + "hasRange"), v.getRange());
//			m.add(incident, m.getProperty(NS + "hasBaseMsrp"), v.getBaseMsrp());
//			m.add(incident, m.getProperty(NS + "hasLegislativeDistrict"), v.getLegislativeDistrict());
//			m.add(incident, m.getProperty(NS + "hasCafvEligibity"), v.getCafvEligibility());
//			m.add(incident, m.getProperty(NS + "meetsElectricRangeRequirement"), v.getElectricRangeRequirement());
//			m.add(incident, m.getProperty(NS + "meetsSaleDateRequirement"), v.getSaleDateRequirement());
//			m.add(incident, m.getProperty(NS + "meetsSalePriceRequirement"), v.getSalePriceRequirement());
//			m.add(incident, m.getProperty(NS + "hasOdomoterReading"), v.getOdometerReading());
//			m.add(incident, m.getProperty(NS + "hasOdomoterCode"), v.getOdometerCode());
//			m.add(incident, m.getProperty(NS + "hasTransportationFeePaid"), v.getTransportationFeePaid());
//			m.add(incident, m.getProperty(NS + "paidHybridElectricFee"), v.getHybridFeePaid());
//			m.add(incident, m.getProperty(NS + "determines"), vehicledata);

            // m.add(incident, m.getProperty(NS + "meetsElectricRangeRequirement"),
            // v.getElectricRangeRequirement());

        }

//            Individual Vehicle_Data1 = Vehicle_Data.createIndividual();
//            Individual Vehicle_Registration1 = m.getOntClass(NS + "vehicle_registration/").createIndividual();
//            Individual Model_details1 = m.getOntClass(NS + "model_details/").createIndividual();
//            Individual Transaction_and_Payment1 = m.getOntClass(NS + "transaction_and_payment/").createIndividual();
//            Individual Range_Requirements1 = m.getOntClass(NS + "range_requirements/").createIndividual();
//            Individual Mileage1 = m.getOntClass(NS + "mileage/").createIndividual();
        // Individual Vehicle_Data1 = m.getOntClass(NS +
        // "vehicle_data/").createIndividual();

        // model.instance(VehicleIncident, Vehicle_Registration1.getProperty( NS +
        // "hasAddress/"), v.getAddress()));

//            Vehicle_Registration1.addProperty(hasCity, v.getCity());
//            Vehicle_Registration1.addProperty(hasCounty, v.getCounty());
//            Vehicle_Registration1.addProperty(hasZip, v.getZip());
//            Vehicle_Registration1.addProperty(hasDolTransactionDate, v.getDolTransactionDate());
//            Vehicle_Registration1.addProperty(hasDolVehicleId, v.getDolVehicleId());
//            Vehicle_Registration1.addProperty(hasVin, v.getVin());

//            Model_details1.addProperty(hasMake, v.getMake());
//            Model_details1.addProperty(hasModelYear, v.getModelYear());
//           // Model_details1.addProperty(m.getDatatypeProperty(NS + "hasMake/"), v.getMake());
//            Model_details1.addProperty(hasVehicleStatus, v.getVehicleStatus());

//            Vehicle_Data1.addProperty(hasBaseMsrp, v.getBaseMsrp());
//            Vehicle_Data1.addProperty(hasLegislativeDistrict, v.getLegislativeDistrict());
//            Vehicle_Data1.addProperty(hasCafvEligibity, v.getCafvEligibility());
//            Vehicle_Data1.addProperty(hasMSR, v.getBaseMsrp());
//            Vehicle_Data1.addProperty(hasRange, v.getRange());
//            Vehicle_Data1.addProperty(hasType, v.getTransactionType());
//            Vehicle_Data1.addProperty(hasVehicleLocation, v.getVehicleLocation());

//            m.add(incident,m.getProperty(NS + "hasType/"), v.getTransactionType());
//            m.add(Vehicle_Data1,hasType, v.getTransactionType());
//            m.add(Vehicle_Data1,hasRange, v.getRange());
//            m.add(Vehicle_Data1,hasMSR, v.getBaseMsrp());
//            m.add(Vehicle_Data1,hasCafvEligibity, v.getCafvEligibility());

//            Mileage1.addProperty(hasOdometerCode, v.getOdometerCode());
//            Mileage1.addProperty(hasOdometerReading, v.getOdometerReading());
//
//
//            Transaction_and_Payment1.addProperty(m.getDatatypeProperty(NS + "hasTransactionType/"), v.getTransactionType());
//            Transaction_and_Payment1.addProperty(m.getDatatypeProperty(NS + "hasTransactionYear/"), v.getTransactionYear());
//            Transaction_and_Payment1.addProperty(m.getDatatypeProperty(NS + "paidHybridElectricFee/"), v.getHybridFeePaid());
//            Transaction_and_Payment1.addProperty(hasTransportationFeePaid, v.getTransportationFeePaid());
//
//            Range_Requirements1.addProperty(m.getDatatypeProperty(NS + "meetsElectricRangeRequirement/"), v.getElectricRangeRequirement());
//            Range_Requirements1.addProperty(m.getDatatypeProperty(NS + "meetsSaleDateRequirement/"), v.getSaleDateRequirement());
//            Range_Requirements1.addProperty(m.getDatatypeProperty(NS + "meetsSalePriceRequirement/"), v.getSalePriceRequirement());
//            Range_Requirements1.addProperty(m.getDatatypeProperty(NS + "hasElectricFeePaid/"), v.getElectricFeePaid());

        // incident.addProperty(vd,Vehicle_Data1);
//Ontology.class.getResource(String.valueOf(vehicleInstance)).printModel(VehicleIncident);

        // incident.addProperty(m.getProperty(NS + "vehicle_data/"), Vehicle_Data1);

        // OutputStream out = null;
//        try {
//            out = new FileOutputStream("./OWLCode.owl");
//            out.write();
//            m.write(out, "RDF/XML-ABBREV");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (out != null) {
//                try {
//                    out.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
        // }
        FileWriter out = null;
        // try {
        OutputStream outputStream = new FileOutputStream("./OWLCode1.owl");
        // OutputStream outputStream = new FileOutputStream("./OWLCode.owl");
        m.write(System.out);

        // m.write(outputStream, "RDF/XML-ABBREV");
        // RDFDataMgr.write(outputStream, m, RDFFormat.RDFXML_PLAIN);
        // out = new FileWriter("./OWLCode.owl");
        // m.write(out, "RDF/XML-ABBREV");

//
        try {
            out = new FileWriter("./OWLCode.owl");
            m.write(out, "RDF/XML-ABBREV");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidPropertyURIException e) {
            // e.printStackTrace();
        }
    }

    private static <T> List<VehicleIncident> readCsvToBeanList(Path path, Class clazz, List<VehicleIncident> list)
            throws Exception {
        HeaderColumnNameMappingStrategy ms = new HeaderColumnNameMappingStrategy();
        ms.setType(clazz);

        try (Reader reader = Files.newBufferedReader(path)) {
            CsvToBean cb = new CsvToBeanBuilder(reader).withType(clazz).withMappingStrategy(ms).build();
            list = cb.parse();
        }
        return list;
    }

}
