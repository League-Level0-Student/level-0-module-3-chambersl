package extra;

import javax.swing.JOptionPane;

public class Horoscopes {
	public static void main(String[] args) {

		String sign = JOptionPane.showInputDialog("What is your zodiac sign?");
		if (sign.equalsIgnoreCase("aries")) {
			JOptionPane.showMessageDialog(null,
					"Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		} else if (sign.equalsIgnoreCase("taurus")) {
			JOptionPane.showMessageDialog(null,
					"Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		} else if (sign.equalsIgnoreCase("gemini")) {
			JOptionPane.showMessageDialog(null,
					"Cerebral, chatty, loves learning and education, charming, and adventurous.");
		} else if (sign.equalsIgnoreCase("cancer")) {
			JOptionPane.showMessageDialog(null,
					"A water sign; ruled by the Moon. Emotional, group oriented, seeks security, family.");
		} else {
			JOptionPane.showMessageDialog(null, "I dont know that sign!");
		}
	}
}
