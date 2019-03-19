
package projecttm;


public class CommonData extends Date{
      protected String name;
      protected String description;
      protected long size;
      protected Address address = new Address(null);
      protected String cDate;
      protected String mDate;
      protected DataFormats format;

    public CommonData(int day, int month, int year) {
        super(day, month, year);
    }
      
      
      
      
      
      
      
      
      
}
