package officer;

import message.Message;

public class Captain extends Officer {

    private static final int CODE =50;
    private static final String NAME ="Kapitan";

    @Override
    public void processMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.CAPTAIN)&& message.getCode()==CODE){
            System.out.println(NAME+ " otrzymał wiadomość: " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
