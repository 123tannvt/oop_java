
package th7bai11.B1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
        DaySo ds1= new DaySo();
        ds1.nhapDaySo();
        ds1.inDaySo();
        ds1.inSoNguyenTo();
        ds1.inSoHoanHao();
        ds1.sapXepTang();
        System.out.println("");
        ds1.sapXepGiam();
        System.out.println("");
        DaySo ds2= new DaySo();
        System.out.println("");
        ds2.nhapDaySo();
        ds2.inDaySo();
        System.out.println("");
        DaySo ds3 = ds1.congDay(ds2);
        ds3.inDaySo();
        
        
    }
}
