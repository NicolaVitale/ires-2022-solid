package it.euris.ires.openclosed;

public class MessageWriter {

  public void writeMessages(
      TextMessage[] texts, AudioMessage[] audios, boolean noAudio, boolean noText) {
    if (!noText) {
      for (TextMessage msg : texts) {
        System.out.println("Message text: " + msg.getText());
      }
    }
    if (!noAudio) {
      for (AudioMessage msg : audios) {
        System.out.println("Audio message: " + msg.getTranscript());
      }
    }
  }
}
