import message.Message;
import officer.*;

public class Main {

    public static void main(String[] args) {

        Message message = new Message("Atakować!", 100, OfficerRank.GENERAL);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergeant.processMessage(message);

    }

}
