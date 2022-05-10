package week1.day1;

public class Mobile {
public void sendMessage() {
	System.out.println("sendMessage to my friend");
}
public void shareDocuments() {
	System.out.println("shareDocuments as a whatsapp");
}
public void voiceCall() {
	System.out.println("voiceCall to my friend");
}
public static void main(String[] args) {
	Mobile mob=new Mobile();
	mob.sendMessage();
	mob.shareDocuments();
	mob.voiceCall();
}
}
