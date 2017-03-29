package pl.pg.asobecki.wai.jaxws;

public class Main {

    public static void main(String[] args) {
	    FirstWebServiceImplService firstWebServiceImplService = new FirstWebServiceImplService();
        FirstWebService service = firstWebServiceImplService.getFirstWebServiceImplPort();
        System.out.println(service.getFirstWebServiceAsString("test string"));
    }
}
