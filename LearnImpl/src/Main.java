import com.lyb.learnimpl.ExpireDateMerchandise;
import com.lyb.learnimpl.GamePointCard;
import com.lyb.learnimpl.Merchandise;
import com.lyb.learnimpl.VirtualMerchandise;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date producedDate = new Date();
        Date expireDate = new Date(producedDate.getTime()+365L*24*3600*1000);
        GamePointCard gamePointCard = new GamePointCard("gamePD1","001",300,100,producedDate,expireDate);
        System.out.println(gamePointCard);

        ExpireDateMerchandise expireDateMerchandise = gamePointCard;
        VirtualMerchandise virtualMerchandise = gamePointCard;
        Merchandise merchandise = gamePointCard;
//        expireDateMerchandise = (ExpireDateMerchandise) merchandise;
//        virtualMerchandise = (VirtualMerchandise) merchandise;
        System.out.println(expireDateMerchandise.getExpiredDate());
        System.out.println(expireDateMerchandise.testDefault());
    }
}