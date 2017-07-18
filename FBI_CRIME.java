// ORM class for table 'FBI_CRIME'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Apr 26 08:35:08 PDT 2017
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FBI_CRIME extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer ID;
  public Integer get_ID() {
    return ID;
  }
  public void set_ID(Integer ID) {
    this.ID = ID;
  }
  public FBI_CRIME with_ID(Integer ID) {
    this.ID = ID;
    return this;
  }
  private String Case_Number;
  public String get_Case_Number() {
    return Case_Number;
  }
  public void set_Case_Number(String Case_Number) {
    this.Case_Number = Case_Number;
  }
  public FBI_CRIME with_Case_Number(String Case_Number) {
    this.Case_Number = Case_Number;
    return this;
  }
  private String Date;
  public String get_Date() {
    return Date;
  }
  public void set_Date(String Date) {
    this.Date = Date;
  }
  public FBI_CRIME with_Date(String Date) {
    this.Date = Date;
    return this;
  }
  private String Block;
  public String get_Block() {
    return Block;
  }
  public void set_Block(String Block) {
    this.Block = Block;
  }
  public FBI_CRIME with_Block(String Block) {
    this.Block = Block;
    return this;
  }
  private String IUCR;
  public String get_IUCR() {
    return IUCR;
  }
  public void set_IUCR(String IUCR) {
    this.IUCR = IUCR;
  }
  public FBI_CRIME with_IUCR(String IUCR) {
    this.IUCR = IUCR;
    return this;
  }
  private String Primary_Type;
  public String get_Primary_Type() {
    return Primary_Type;
  }
  public void set_Primary_Type(String Primary_Type) {
    this.Primary_Type = Primary_Type;
  }
  public FBI_CRIME with_Primary_Type(String Primary_Type) {
    this.Primary_Type = Primary_Type;
    return this;
  }
  private String Description;
  public String get_Description() {
    return Description;
  }
  public void set_Description(String Description) {
    this.Description = Description;
  }
  public FBI_CRIME with_Description(String Description) {
    this.Description = Description;
    return this;
  }
  private String Location_Description;
  public String get_Location_Description() {
    return Location_Description;
  }
  public void set_Location_Description(String Location_Description) {
    this.Location_Description = Location_Description;
  }
  public FBI_CRIME with_Location_Description(String Location_Description) {
    this.Location_Description = Location_Description;
    return this;
  }
  private String Arrest;
  public String get_Arrest() {
    return Arrest;
  }
  public void set_Arrest(String Arrest) {
    this.Arrest = Arrest;
  }
  public FBI_CRIME with_Arrest(String Arrest) {
    this.Arrest = Arrest;
    return this;
  }
  private String Domestic;
  public String get_Domestic() {
    return Domestic;
  }
  public void set_Domestic(String Domestic) {
    this.Domestic = Domestic;
  }
  public FBI_CRIME with_Domestic(String Domestic) {
    this.Domestic = Domestic;
    return this;
  }
  private String Beat;
  public String get_Beat() {
    return Beat;
  }
  public void set_Beat(String Beat) {
    this.Beat = Beat;
  }
  public FBI_CRIME with_Beat(String Beat) {
    this.Beat = Beat;
    return this;
  }
  private String District;
  public String get_District() {
    return District;
  }
  public void set_District(String District) {
    this.District = District;
  }
  public FBI_CRIME with_District(String District) {
    this.District = District;
    return this;
  }
  private String Ward;
  public String get_Ward() {
    return Ward;
  }
  public void set_Ward(String Ward) {
    this.Ward = Ward;
  }
  public FBI_CRIME with_Ward(String Ward) {
    this.Ward = Ward;
    return this;
  }
  private String Community_Area;
  public String get_Community_Area() {
    return Community_Area;
  }
  public void set_Community_Area(String Community_Area) {
    this.Community_Area = Community_Area;
  }
  public FBI_CRIME with_Community_Area(String Community_Area) {
    this.Community_Area = Community_Area;
    return this;
  }
  private String FBI_Code;
  public String get_FBI_Code() {
    return FBI_Code;
  }
  public void set_FBI_Code(String FBI_Code) {
    this.FBI_Code = FBI_Code;
  }
  public FBI_CRIME with_FBI_Code(String FBI_Code) {
    this.FBI_Code = FBI_Code;
    return this;
  }
  private String X_Coordinate;
  public String get_X_Coordinate() {
    return X_Coordinate;
  }
  public void set_X_Coordinate(String X_Coordinate) {
    this.X_Coordinate = X_Coordinate;
  }
  public FBI_CRIME with_X_Coordinate(String X_Coordinate) {
    this.X_Coordinate = X_Coordinate;
    return this;
  }
  private String Y_Coordinate;
  public String get_Y_Coordinate() {
    return Y_Coordinate;
  }
  public void set_Y_Coordinate(String Y_Coordinate) {
    this.Y_Coordinate = Y_Coordinate;
  }
  public FBI_CRIME with_Y_Coordinate(String Y_Coordinate) {
    this.Y_Coordinate = Y_Coordinate;
    return this;
  }
  private Integer Year;
  public Integer get_Year() {
    return Year;
  }
  public void set_Year(Integer Year) {
    this.Year = Year;
  }
  public FBI_CRIME with_Year(Integer Year) {
    this.Year = Year;
    return this;
  }
  private String Updated_On;
  public String get_Updated_On() {
    return Updated_On;
  }
  public void set_Updated_On(String Updated_On) {
    this.Updated_On = Updated_On;
  }
  public FBI_CRIME with_Updated_On(String Updated_On) {
    this.Updated_On = Updated_On;
    return this;
  }
  private String Latitude;
  public String get_Latitude() {
    return Latitude;
  }
  public void set_Latitude(String Latitude) {
    this.Latitude = Latitude;
  }
  public FBI_CRIME with_Latitude(String Latitude) {
    this.Latitude = Latitude;
    return this;
  }
  private String Longitude;
  public String get_Longitude() {
    return Longitude;
  }
  public void set_Longitude(String Longitude) {
    this.Longitude = Longitude;
  }
  public FBI_CRIME with_Longitude(String Longitude) {
    this.Longitude = Longitude;
    return this;
  }
  private String Location;
  public String get_Location() {
    return Location;
  }
  public void set_Location(String Location) {
    this.Location = Location;
  }
  public FBI_CRIME with_Location(String Location) {
    this.Location = Location;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof FBI_CRIME)) {
      return false;
    }
    FBI_CRIME that = (FBI_CRIME) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.Case_Number == null ? that.Case_Number == null : this.Case_Number.equals(that.Case_Number));
    equal = equal && (this.Date == null ? that.Date == null : this.Date.equals(that.Date));
    equal = equal && (this.Block == null ? that.Block == null : this.Block.equals(that.Block));
    equal = equal && (this.IUCR == null ? that.IUCR == null : this.IUCR.equals(that.IUCR));
    equal = equal && (this.Primary_Type == null ? that.Primary_Type == null : this.Primary_Type.equals(that.Primary_Type));
    equal = equal && (this.Description == null ? that.Description == null : this.Description.equals(that.Description));
    equal = equal && (this.Location_Description == null ? that.Location_Description == null : this.Location_Description.equals(that.Location_Description));
    equal = equal && (this.Arrest == null ? that.Arrest == null : this.Arrest.equals(that.Arrest));
    equal = equal && (this.Domestic == null ? that.Domestic == null : this.Domestic.equals(that.Domestic));
    equal = equal && (this.Beat == null ? that.Beat == null : this.Beat.equals(that.Beat));
    equal = equal && (this.District == null ? that.District == null : this.District.equals(that.District));
    equal = equal && (this.Ward == null ? that.Ward == null : this.Ward.equals(that.Ward));
    equal = equal && (this.Community_Area == null ? that.Community_Area == null : this.Community_Area.equals(that.Community_Area));
    equal = equal && (this.FBI_Code == null ? that.FBI_Code == null : this.FBI_Code.equals(that.FBI_Code));
    equal = equal && (this.X_Coordinate == null ? that.X_Coordinate == null : this.X_Coordinate.equals(that.X_Coordinate));
    equal = equal && (this.Y_Coordinate == null ? that.Y_Coordinate == null : this.Y_Coordinate.equals(that.Y_Coordinate));
    equal = equal && (this.Year == null ? that.Year == null : this.Year.equals(that.Year));
    equal = equal && (this.Updated_On == null ? that.Updated_On == null : this.Updated_On.equals(that.Updated_On));
    equal = equal && (this.Latitude == null ? that.Latitude == null : this.Latitude.equals(that.Latitude));
    equal = equal && (this.Longitude == null ? that.Longitude == null : this.Longitude.equals(that.Longitude));
    equal = equal && (this.Location == null ? that.Location == null : this.Location.equals(that.Location));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof FBI_CRIME)) {
      return false;
    }
    FBI_CRIME that = (FBI_CRIME) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.Case_Number == null ? that.Case_Number == null : this.Case_Number.equals(that.Case_Number));
    equal = equal && (this.Date == null ? that.Date == null : this.Date.equals(that.Date));
    equal = equal && (this.Block == null ? that.Block == null : this.Block.equals(that.Block));
    equal = equal && (this.IUCR == null ? that.IUCR == null : this.IUCR.equals(that.IUCR));
    equal = equal && (this.Primary_Type == null ? that.Primary_Type == null : this.Primary_Type.equals(that.Primary_Type));
    equal = equal && (this.Description == null ? that.Description == null : this.Description.equals(that.Description));
    equal = equal && (this.Location_Description == null ? that.Location_Description == null : this.Location_Description.equals(that.Location_Description));
    equal = equal && (this.Arrest == null ? that.Arrest == null : this.Arrest.equals(that.Arrest));
    equal = equal && (this.Domestic == null ? that.Domestic == null : this.Domestic.equals(that.Domestic));
    equal = equal && (this.Beat == null ? that.Beat == null : this.Beat.equals(that.Beat));
    equal = equal && (this.District == null ? that.District == null : this.District.equals(that.District));
    equal = equal && (this.Ward == null ? that.Ward == null : this.Ward.equals(that.Ward));
    equal = equal && (this.Community_Area == null ? that.Community_Area == null : this.Community_Area.equals(that.Community_Area));
    equal = equal && (this.FBI_Code == null ? that.FBI_Code == null : this.FBI_Code.equals(that.FBI_Code));
    equal = equal && (this.X_Coordinate == null ? that.X_Coordinate == null : this.X_Coordinate.equals(that.X_Coordinate));
    equal = equal && (this.Y_Coordinate == null ? that.Y_Coordinate == null : this.Y_Coordinate.equals(that.Y_Coordinate));
    equal = equal && (this.Year == null ? that.Year == null : this.Year.equals(that.Year));
    equal = equal && (this.Updated_On == null ? that.Updated_On == null : this.Updated_On.equals(that.Updated_On));
    equal = equal && (this.Latitude == null ? that.Latitude == null : this.Latitude.equals(that.Latitude));
    equal = equal && (this.Longitude == null ? that.Longitude == null : this.Longitude.equals(that.Longitude));
    equal = equal && (this.Location == null ? that.Location == null : this.Location.equals(that.Location));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Case_Number = JdbcWritableBridge.readString(2, __dbResults);
    this.Date = JdbcWritableBridge.readString(3, __dbResults);
    this.Block = JdbcWritableBridge.readString(4, __dbResults);
    this.IUCR = JdbcWritableBridge.readString(5, __dbResults);
    this.Primary_Type = JdbcWritableBridge.readString(6, __dbResults);
    this.Description = JdbcWritableBridge.readString(7, __dbResults);
    this.Location_Description = JdbcWritableBridge.readString(8, __dbResults);
    this.Arrest = JdbcWritableBridge.readString(9, __dbResults);
    this.Domestic = JdbcWritableBridge.readString(10, __dbResults);
    this.Beat = JdbcWritableBridge.readString(11, __dbResults);
    this.District = JdbcWritableBridge.readString(12, __dbResults);
    this.Ward = JdbcWritableBridge.readString(13, __dbResults);
    this.Community_Area = JdbcWritableBridge.readString(14, __dbResults);
    this.FBI_Code = JdbcWritableBridge.readString(15, __dbResults);
    this.X_Coordinate = JdbcWritableBridge.readString(16, __dbResults);
    this.Y_Coordinate = JdbcWritableBridge.readString(17, __dbResults);
    this.Year = JdbcWritableBridge.readInteger(18, __dbResults);
    this.Updated_On = JdbcWritableBridge.readString(19, __dbResults);
    this.Latitude = JdbcWritableBridge.readString(20, __dbResults);
    this.Longitude = JdbcWritableBridge.readString(21, __dbResults);
    this.Location = JdbcWritableBridge.readString(22, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Case_Number = JdbcWritableBridge.readString(2, __dbResults);
    this.Date = JdbcWritableBridge.readString(3, __dbResults);
    this.Block = JdbcWritableBridge.readString(4, __dbResults);
    this.IUCR = JdbcWritableBridge.readString(5, __dbResults);
    this.Primary_Type = JdbcWritableBridge.readString(6, __dbResults);
    this.Description = JdbcWritableBridge.readString(7, __dbResults);
    this.Location_Description = JdbcWritableBridge.readString(8, __dbResults);
    this.Arrest = JdbcWritableBridge.readString(9, __dbResults);
    this.Domestic = JdbcWritableBridge.readString(10, __dbResults);
    this.Beat = JdbcWritableBridge.readString(11, __dbResults);
    this.District = JdbcWritableBridge.readString(12, __dbResults);
    this.Ward = JdbcWritableBridge.readString(13, __dbResults);
    this.Community_Area = JdbcWritableBridge.readString(14, __dbResults);
    this.FBI_Code = JdbcWritableBridge.readString(15, __dbResults);
    this.X_Coordinate = JdbcWritableBridge.readString(16, __dbResults);
    this.Y_Coordinate = JdbcWritableBridge.readString(17, __dbResults);
    this.Year = JdbcWritableBridge.readInteger(18, __dbResults);
    this.Updated_On = JdbcWritableBridge.readString(19, __dbResults);
    this.Latitude = JdbcWritableBridge.readString(20, __dbResults);
    this.Longitude = JdbcWritableBridge.readString(21, __dbResults);
    this.Location = JdbcWritableBridge.readString(22, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(ID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Case_Number, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Date, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Block, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(IUCR, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Primary_Type, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Description, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Location_Description, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Arrest, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Domestic, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Beat, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(District, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Ward, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Community_Area, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FBI_Code, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(X_Coordinate, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Y_Coordinate, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Year, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Updated_On, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Latitude, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Longitude, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Location, 22 + __off, 12, __dbStmt);
    return 22;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(ID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Case_Number, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Date, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Block, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(IUCR, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Primary_Type, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Description, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Location_Description, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Arrest, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Domestic, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Beat, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(District, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Ward, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Community_Area, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FBI_Code, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(X_Coordinate, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Y_Coordinate, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Year, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Updated_On, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Latitude, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Longitude, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Location, 22 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ID = null;
    } else {
    this.ID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Case_Number = null;
    } else {
    this.Case_Number = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Date = null;
    } else {
    this.Date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Block = null;
    } else {
    this.Block = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.IUCR = null;
    } else {
    this.IUCR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Primary_Type = null;
    } else {
    this.Primary_Type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Description = null;
    } else {
    this.Description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Location_Description = null;
    } else {
    this.Location_Description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Arrest = null;
    } else {
    this.Arrest = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Domestic = null;
    } else {
    this.Domestic = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Beat = null;
    } else {
    this.Beat = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.District = null;
    } else {
    this.District = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Ward = null;
    } else {
    this.Ward = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Community_Area = null;
    } else {
    this.Community_Area = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FBI_Code = null;
    } else {
    this.FBI_Code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.X_Coordinate = null;
    } else {
    this.X_Coordinate = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y_Coordinate = null;
    } else {
    this.Y_Coordinate = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Year = null;
    } else {
    this.Year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Updated_On = null;
    } else {
    this.Updated_On = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Latitude = null;
    } else {
    this.Latitude = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Longitude = null;
    } else {
    this.Longitude = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Location = null;
    } else {
    this.Location = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ID);
    }
    if (null == this.Case_Number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Case_Number);
    }
    if (null == this.Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Date);
    }
    if (null == this.Block) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Block);
    }
    if (null == this.IUCR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IUCR);
    }
    if (null == this.Primary_Type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Primary_Type);
    }
    if (null == this.Description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Description);
    }
    if (null == this.Location_Description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Location_Description);
    }
    if (null == this.Arrest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Arrest);
    }
    if (null == this.Domestic) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Domestic);
    }
    if (null == this.Beat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Beat);
    }
    if (null == this.District) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, District);
    }
    if (null == this.Ward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Ward);
    }
    if (null == this.Community_Area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Community_Area);
    }
    if (null == this.FBI_Code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FBI_Code);
    }
    if (null == this.X_Coordinate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, X_Coordinate);
    }
    if (null == this.Y_Coordinate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Y_Coordinate);
    }
    if (null == this.Year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Year);
    }
    if (null == this.Updated_On) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Updated_On);
    }
    if (null == this.Latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Latitude);
    }
    if (null == this.Longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Longitude);
    }
    if (null == this.Location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Location);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ID);
    }
    if (null == this.Case_Number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Case_Number);
    }
    if (null == this.Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Date);
    }
    if (null == this.Block) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Block);
    }
    if (null == this.IUCR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IUCR);
    }
    if (null == this.Primary_Type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Primary_Type);
    }
    if (null == this.Description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Description);
    }
    if (null == this.Location_Description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Location_Description);
    }
    if (null == this.Arrest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Arrest);
    }
    if (null == this.Domestic) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Domestic);
    }
    if (null == this.Beat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Beat);
    }
    if (null == this.District) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, District);
    }
    if (null == this.Ward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Ward);
    }
    if (null == this.Community_Area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Community_Area);
    }
    if (null == this.FBI_Code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FBI_Code);
    }
    if (null == this.X_Coordinate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, X_Coordinate);
    }
    if (null == this.Y_Coordinate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Y_Coordinate);
    }
    if (null == this.Year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Year);
    }
    if (null == this.Updated_On) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Updated_On);
    }
    if (null == this.Latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Latitude);
    }
    if (null == this.Longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Longitude);
    }
    if (null == this.Location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Location);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":"" + ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Case_Number==null?"null":Case_Number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Date==null?"null":Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Block==null?"null":Block, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IUCR==null?"null":IUCR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Primary_Type==null?"null":Primary_Type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Description==null?"null":Description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Location_Description==null?"null":Location_Description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Arrest==null?"null":Arrest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Domestic==null?"null":Domestic, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Beat==null?"null":Beat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(District==null?"null":District, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Ward==null?"null":Ward, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Community_Area==null?"null":Community_Area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBI_Code==null?"null":FBI_Code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(X_Coordinate==null?"null":X_Coordinate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y_Coordinate==null?"null":Y_Coordinate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Year==null?"null":"" + Year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Updated_On==null?"null":Updated_On, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Latitude==null?"null":Latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Longitude==null?"null":Longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Location==null?"null":Location, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":"" + ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Case_Number==null?"null":Case_Number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Date==null?"null":Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Block==null?"null":Block, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IUCR==null?"null":IUCR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Primary_Type==null?"null":Primary_Type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Description==null?"null":Description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Location_Description==null?"null":Location_Description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Arrest==null?"null":Arrest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Domestic==null?"null":Domestic, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Beat==null?"null":Beat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(District==null?"null":District, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Ward==null?"null":Ward, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Community_Area==null?"null":Community_Area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBI_Code==null?"null":FBI_Code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(X_Coordinate==null?"null":X_Coordinate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y_Coordinate==null?"null":Y_Coordinate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Year==null?"null":"" + Year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Updated_On==null?"null":Updated_On, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Latitude==null?"null":Latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Longitude==null?"null":Longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Location==null?"null":Location, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ID = null; } else {
      this.ID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Case_Number = null; } else {
      this.Case_Number = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Date = null; } else {
      this.Date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Block = null; } else {
      this.Block = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.IUCR = null; } else {
      this.IUCR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Primary_Type = null; } else {
      this.Primary_Type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Description = null; } else {
      this.Description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Location_Description = null; } else {
      this.Location_Description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Arrest = null; } else {
      this.Arrest = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Domestic = null; } else {
      this.Domestic = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Beat = null; } else {
      this.Beat = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.District = null; } else {
      this.District = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Ward = null; } else {
      this.Ward = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Community_Area = null; } else {
      this.Community_Area = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FBI_Code = null; } else {
      this.FBI_Code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.X_Coordinate = null; } else {
      this.X_Coordinate = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Y_Coordinate = null; } else {
      this.Y_Coordinate = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Year = null; } else {
      this.Year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Updated_On = null; } else {
      this.Updated_On = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Latitude = null; } else {
      this.Latitude = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Longitude = null; } else {
      this.Longitude = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Location = null; } else {
      this.Location = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ID = null; } else {
      this.ID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Case_Number = null; } else {
      this.Case_Number = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Date = null; } else {
      this.Date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Block = null; } else {
      this.Block = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.IUCR = null; } else {
      this.IUCR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Primary_Type = null; } else {
      this.Primary_Type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Description = null; } else {
      this.Description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Location_Description = null; } else {
      this.Location_Description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Arrest = null; } else {
      this.Arrest = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Domestic = null; } else {
      this.Domestic = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Beat = null; } else {
      this.Beat = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.District = null; } else {
      this.District = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Ward = null; } else {
      this.Ward = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Community_Area = null; } else {
      this.Community_Area = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FBI_Code = null; } else {
      this.FBI_Code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.X_Coordinate = null; } else {
      this.X_Coordinate = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Y_Coordinate = null; } else {
      this.Y_Coordinate = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Year = null; } else {
      this.Year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Updated_On = null; } else {
      this.Updated_On = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Latitude = null; } else {
      this.Latitude = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Longitude = null; } else {
      this.Longitude = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Location = null; } else {
      this.Location = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    FBI_CRIME o = (FBI_CRIME) super.clone();
    return o;
  }

  public void clone0(FBI_CRIME o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("Case_Number", this.Case_Number);
    __sqoop$field_map.put("Date", this.Date);
    __sqoop$field_map.put("Block", this.Block);
    __sqoop$field_map.put("IUCR", this.IUCR);
    __sqoop$field_map.put("Primary_Type", this.Primary_Type);
    __sqoop$field_map.put("Description", this.Description);
    __sqoop$field_map.put("Location_Description", this.Location_Description);
    __sqoop$field_map.put("Arrest", this.Arrest);
    __sqoop$field_map.put("Domestic", this.Domestic);
    __sqoop$field_map.put("Beat", this.Beat);
    __sqoop$field_map.put("District", this.District);
    __sqoop$field_map.put("Ward", this.Ward);
    __sqoop$field_map.put("Community_Area", this.Community_Area);
    __sqoop$field_map.put("FBI_Code", this.FBI_Code);
    __sqoop$field_map.put("X_Coordinate", this.X_Coordinate);
    __sqoop$field_map.put("Y_Coordinate", this.Y_Coordinate);
    __sqoop$field_map.put("Year", this.Year);
    __sqoop$field_map.put("Updated_On", this.Updated_On);
    __sqoop$field_map.put("Latitude", this.Latitude);
    __sqoop$field_map.put("Longitude", this.Longitude);
    __sqoop$field_map.put("Location", this.Location);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("Case_Number", this.Case_Number);
    __sqoop$field_map.put("Date", this.Date);
    __sqoop$field_map.put("Block", this.Block);
    __sqoop$field_map.put("IUCR", this.IUCR);
    __sqoop$field_map.put("Primary_Type", this.Primary_Type);
    __sqoop$field_map.put("Description", this.Description);
    __sqoop$field_map.put("Location_Description", this.Location_Description);
    __sqoop$field_map.put("Arrest", this.Arrest);
    __sqoop$field_map.put("Domestic", this.Domestic);
    __sqoop$field_map.put("Beat", this.Beat);
    __sqoop$field_map.put("District", this.District);
    __sqoop$field_map.put("Ward", this.Ward);
    __sqoop$field_map.put("Community_Area", this.Community_Area);
    __sqoop$field_map.put("FBI_Code", this.FBI_Code);
    __sqoop$field_map.put("X_Coordinate", this.X_Coordinate);
    __sqoop$field_map.put("Y_Coordinate", this.Y_Coordinate);
    __sqoop$field_map.put("Year", this.Year);
    __sqoop$field_map.put("Updated_On", this.Updated_On);
    __sqoop$field_map.put("Latitude", this.Latitude);
    __sqoop$field_map.put("Longitude", this.Longitude);
    __sqoop$field_map.put("Location", this.Location);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("ID".equals(__fieldName)) {
      this.ID = (Integer) __fieldVal;
    }
    else    if ("Case_Number".equals(__fieldName)) {
      this.Case_Number = (String) __fieldVal;
    }
    else    if ("Date".equals(__fieldName)) {
      this.Date = (String) __fieldVal;
    }
    else    if ("Block".equals(__fieldName)) {
      this.Block = (String) __fieldVal;
    }
    else    if ("IUCR".equals(__fieldName)) {
      this.IUCR = (String) __fieldVal;
    }
    else    if ("Primary_Type".equals(__fieldName)) {
      this.Primary_Type = (String) __fieldVal;
    }
    else    if ("Description".equals(__fieldName)) {
      this.Description = (String) __fieldVal;
    }
    else    if ("Location_Description".equals(__fieldName)) {
      this.Location_Description = (String) __fieldVal;
    }
    else    if ("Arrest".equals(__fieldName)) {
      this.Arrest = (String) __fieldVal;
    }
    else    if ("Domestic".equals(__fieldName)) {
      this.Domestic = (String) __fieldVal;
    }
    else    if ("Beat".equals(__fieldName)) {
      this.Beat = (String) __fieldVal;
    }
    else    if ("District".equals(__fieldName)) {
      this.District = (String) __fieldVal;
    }
    else    if ("Ward".equals(__fieldName)) {
      this.Ward = (String) __fieldVal;
    }
    else    if ("Community_Area".equals(__fieldName)) {
      this.Community_Area = (String) __fieldVal;
    }
    else    if ("FBI_Code".equals(__fieldName)) {
      this.FBI_Code = (String) __fieldVal;
    }
    else    if ("X_Coordinate".equals(__fieldName)) {
      this.X_Coordinate = (String) __fieldVal;
    }
    else    if ("Y_Coordinate".equals(__fieldName)) {
      this.Y_Coordinate = (String) __fieldVal;
    }
    else    if ("Year".equals(__fieldName)) {
      this.Year = (Integer) __fieldVal;
    }
    else    if ("Updated_On".equals(__fieldName)) {
      this.Updated_On = (String) __fieldVal;
    }
    else    if ("Latitude".equals(__fieldName)) {
      this.Latitude = (String) __fieldVal;
    }
    else    if ("Longitude".equals(__fieldName)) {
      this.Longitude = (String) __fieldVal;
    }
    else    if ("Location".equals(__fieldName)) {
      this.Location = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("ID".equals(__fieldName)) {
      this.ID = (Integer) __fieldVal;
      return true;
    }
    else    if ("Case_Number".equals(__fieldName)) {
      this.Case_Number = (String) __fieldVal;
      return true;
    }
    else    if ("Date".equals(__fieldName)) {
      this.Date = (String) __fieldVal;
      return true;
    }
    else    if ("Block".equals(__fieldName)) {
      this.Block = (String) __fieldVal;
      return true;
    }
    else    if ("IUCR".equals(__fieldName)) {
      this.IUCR = (String) __fieldVal;
      return true;
    }
    else    if ("Primary_Type".equals(__fieldName)) {
      this.Primary_Type = (String) __fieldVal;
      return true;
    }
    else    if ("Description".equals(__fieldName)) {
      this.Description = (String) __fieldVal;
      return true;
    }
    else    if ("Location_Description".equals(__fieldName)) {
      this.Location_Description = (String) __fieldVal;
      return true;
    }
    else    if ("Arrest".equals(__fieldName)) {
      this.Arrest = (String) __fieldVal;
      return true;
    }
    else    if ("Domestic".equals(__fieldName)) {
      this.Domestic = (String) __fieldVal;
      return true;
    }
    else    if ("Beat".equals(__fieldName)) {
      this.Beat = (String) __fieldVal;
      return true;
    }
    else    if ("District".equals(__fieldName)) {
      this.District = (String) __fieldVal;
      return true;
    }
    else    if ("Ward".equals(__fieldName)) {
      this.Ward = (String) __fieldVal;
      return true;
    }
    else    if ("Community_Area".equals(__fieldName)) {
      this.Community_Area = (String) __fieldVal;
      return true;
    }
    else    if ("FBI_Code".equals(__fieldName)) {
      this.FBI_Code = (String) __fieldVal;
      return true;
    }
    else    if ("X_Coordinate".equals(__fieldName)) {
      this.X_Coordinate = (String) __fieldVal;
      return true;
    }
    else    if ("Y_Coordinate".equals(__fieldName)) {
      this.Y_Coordinate = (String) __fieldVal;
      return true;
    }
    else    if ("Year".equals(__fieldName)) {
      this.Year = (Integer) __fieldVal;
      return true;
    }
    else    if ("Updated_On".equals(__fieldName)) {
      this.Updated_On = (String) __fieldVal;
      return true;
    }
    else    if ("Latitude".equals(__fieldName)) {
      this.Latitude = (String) __fieldVal;
      return true;
    }
    else    if ("Longitude".equals(__fieldName)) {
      this.Longitude = (String) __fieldVal;
      return true;
    }
    else    if ("Location".equals(__fieldName)) {
      this.Location = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
