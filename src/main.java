import java.io.File;
import java.io.IOException;

import java.util.ArrayList;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class main {
	public static ArrayList<cone> cones = new ArrayList<>();
	public static void main(String args[])
			throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
		File yourFile = new File("res/theme.wav");
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		Clip clip;

		stream = AudioSystem.getAudioInputStream(yourFile);
		format = stream.getFormat();
		info = new DataLine.Info(Clip.class, format);
		clip = (Clip) AudioSystem.getLine(info);
		clip.open(stream);
		clip.loop(Integer.MAX_VALUE);
		//Other Code
	}
}
