package buoi6;

public class VideoProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encodable encoder = new VideoEncoderH26();
		encoder.enCode();
		Storable database = new splVideoDataBase();
		database.store();
		Sendable send = new GmaillService();
		send.send();
		
	}

}
