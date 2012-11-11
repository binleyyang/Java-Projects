/* Francis Hinson, Binley Yang, Hiroyuki Asaga
 * Lab 17
 * Cats.java, CatsTest.java, lion.jpg, tiger.jpg, panther.jpg, cheetah.jpg, cat.jpg
 * November 11th 2012
 * TAs: Dan Scarafoni & Shuopeng Deng
 * CSC 171
 */

import javax.swing.JFrame;

public class CatsTest {

	public static void main(String[] args) {
		
		Cats Frame = new Cats(); // create LabelFrame
		Frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		Frame.setSize( 800, 800 ); // set frame size
		Frame.setVisible( true ); // display frame

	}

}
