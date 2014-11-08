
public enum testingEnum {
    True,
    False;

    static testingEnum [] testIngEnumValues = testingEnum.values();
    static int length = testIngEnumValues.length;
    static String testEnumValueString [] = new String[length];
    
    public static String[] getTestingEnumValues(){
    	
    	for(int i=0;i<testIngEnumValues.length;i++){
    		System.out.println(" Array length "+length);
    		String val = testIngEnumValues[i].name().toLowerCase();
    		System.out.println("printng the value from testingENum   " +val);
    		testEnumValueString[i]=val;
    	}
    	return testEnumValueString;
    }
    
}
