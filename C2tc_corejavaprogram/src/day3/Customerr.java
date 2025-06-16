package day3;

public class Customerr {
int Customerid;
String Customername;
String Customercity;
public int getCustomerid() {
	return Customerid;
}
public void setCustomerid(int customerid) {
	Customerid = customerid;
}
public String getCustomername() {
	return Customername;
}
public void setCustomername(String customername) {
	Customername = customername;
}
public String getCustomercity() {
	return Customercity;
}
public void setCustomercity(String customercity) {
	Customercity = customercity;
}
@Override
public String toString() {
	return "Customerr [Customerid=" + Customerid + ", Customername=" + Customername + ", Customercity=" + Customercity
			+ "]";
}

}
