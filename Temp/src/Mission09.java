import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Mission09
{
	public static void main (String[]args)
	{
		Scanner in = new Scanner (System.in);
		File f;
		Scanner fileIn;
		PrintWriter fileOut;
		PrintWriter fileOutDecrypt;

		String fileName = "";
		String userAnswer = "";
		String line = "";

		try
		{
			//Get file name from the user
			System.out.println ("Please enter the name of the file.");
			fileName = in.nextLine ();

			//Get user input for encryption or decryption
			System.out.println ("Would you like to encrypt or decyrpt the file?");
			userAnswer = in.nextLine ();

			//Build the File and attach a Scanner to it
			f = new File (fileName);
			fileIn = new Scanner (f);

			//Loop through the file
			if (userAnswer.equalsIgnoreCase ("Encrypt"))
			{
				fileOut = new PrintWriter ("Encrypted.txt");

				while (fileIn.hasNextLine ())
				{
					line = fileIn.nextLine ();

					for (int i = 0; i < line.length (); i++)
					{
						Character c = ' ';
						char ch = line.charAt (i);

						if (c.isLetter (ch))
						{
							if (ch == 'z')
								ch = 'a';

							else
								ch++;
						}

						fileOut.print(ch + " ");
					}

				}

			}

			if (userAnswer.equalsIgnoreCase ("Decrypt"))
			{
				fileOut = new PrintWriter ("Decrypted.txt");

				while (fileIn.hasNextLine())
				{
					line = fileIn.nextLine();

					for (int i = 0; i < line.length (); i--)
					{
						Character x = ' ';
						char cha = line.charAt (i);

						if (x.isLetter (cha))
						{
							if (cha == 'z')
								cha = 'a';

							else
								cha--;

							fileOut.print(cha + " ");
						}

						fileOut.close();
					}
				}

			}

		}

		catch (FileNotFoundException e)
		{
			System.out.println("Sorry that file cannot be found. Please enter another file.");
		}

	}

}