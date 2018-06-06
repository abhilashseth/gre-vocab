import java.io.*;
import sun.audio.*;

/**
 * A simple Java sound file example (i.e., Java code to play a sound file).
 * AudioStream and AudioPlayer code comes from a javaworld.com example.
 * @author alvin alexander, devdaily.com.
 */
@SuppressWarnings("restriction")
public class JavaAudioPlaySoundExample
{
    static void play(AudioStream str)
    {
        AudioPlayer.player.start(str);
    }
    public static void main(String[] args)
            throws Exception
    {
        // open the sound file as a Java input stream
        String gongFile = "/home/abh/Downloads/abundant.wav";///home/abh/Downloads/VOCAB/BOX 2/abstruse--_gb_1.mp3

        InputStream in = new FileInputStream(gongFile);
        AudioStream str =new AudioStream(in);
        // play the audio clip with the audioplayer class
        for(int i=0;i<3;i++)
        {
            play(str);

        }

        AudioPlayer.player.start(str);
        AudioPlayer.player.start(str);
    }
}