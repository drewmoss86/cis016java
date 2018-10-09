/**************************************
 * Name: Andrew Moss
 * 
 * Class: CIS 016 - Java
 * 
 * Assignment: StringBuilderClass
 * 
 * Date: 9/19/2018
 * 
 **************************************/

package StringBuilderClass;

import java.io.*;
import java.util.regex.*;
//import java.util.stream.Stream;
public class StringBuilderClass 
{
	/***************************************************
	* isContain  
	*   Preconditions:
	*     sourceStr : string of characters to be analyzed
	*     itemStr   : string to be checked
	*
	*   Postconditions:
	*     Returns true when exact itemStr is found in 
	*       sourceStr, otherwise returns false.
	***************************************************/
	private static boolean isContain(String sourceStr, String itemStr)
	{
		String pattern = "\\b"+itemStr+"\\b";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(sourceStr);
		return m.find();
	}

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		//read in text file
		File file = new File("C:\\Users\\drewc\\Documents\\CIS 016\\Assignment_3\\StringBuilderClass.txt");  
		
		//reads text from a character-input stream. Buffer input from file
		BufferedReader br = new BufferedReader(new FileReader(file));  
		
		//initialize string that will store original text before changes
		String ogStr = br.readLine();  
		
		//take string with original text and remove the commas and replace them with colons
		String itStr = ogStr.replace(',', ':');  
		//take text with commas replaced by colons and replace all uppercase i It w
		String upperCaseStr = itStr.replace("It", "Andrew");  //replace upper-case It with my name
		
		//split upperCaseStr by each word and store in string array
		String[] parts = upperCaseStr.split(" ");
		
		//initialize final string that will store string block to be printed
		String finalReplaceStr = ""; 
 
	    //use for loop to evaluate each word in the text rather than the entire text block. This prevents words that contain "it" to be
		//changed
		for(int i = 0; i < parts.length; i++)
		{
			//if the word being evaluated is an exact match to "it," then replace it with "Andrew" and adds it back to the final string
			if(isContain(parts[i],"it"))
			{
				finalReplaceStr = finalReplaceStr + parts[i].replace("it", "Andrew") + " ";  //replace lower-case it with my name
			}
			
			//if the word being evaluated is an exact match to "its," then replace it with "Andrew's" and adds it back to the final string.
			else if(isContain(parts[i], "its"))
			{
				finalReplaceStr = finalReplaceStr + parts[i].replaceAll("its", "Andrew's") + " ";  //replace possessive its with Andrew's
			}
			
			//else nothing changes and its added back to the final string
			else
			{
				finalReplaceStr = finalReplaceStr + parts[i] + " "; 
			}
		}
		 
		//print final string with changes
		 System.out.print(finalReplaceStr);  
		 
		//close the file
		br.close();

	}

}
