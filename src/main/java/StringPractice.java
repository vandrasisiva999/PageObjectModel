import java.io.BufferedReader;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringPractice {

	public static void main(String[] args) throws IOException {
		
		/*
		 * //1)------- No of Vowels and No of Consonants String Str1 = "my home is very biGAA1";
		 * int vCount =0, cCount=0; Str1 = Str1.toLowerCase();
		 * System.out.println("the string length is : "+Str1.length());
		 * 
		 * for (int i=0;i<Str1.length();i++) {
		 * 
		 * if(Str1.charAt(i)=='a' || Str1.charAt(i)=='e' || Str1.charAt(i)=='i' ||
		 * Str1.charAt(i)=='o' || Str1.charAt(i)=='u') { vCount++; } else if
		 * (Str1.charAt(i)>='a' && Str1.charAt(i)<='z') { cCount++; } }
		 * 
		 * System.out.println("The vowels count in given string is	"+vCount);
		 * System.out.println("The consonanats count in given string is	"+cCount);
		 * 
		 * 
		 */
	
		/*
		 * //2)------ Replace all spaces in string String str1 =
		 * "I need to remove all the spaces in this string"; String str2
		 * ="Replace spaces in this string with -"; char ch='-'; str1 =
		 * str1.replaceAll("\\s+", "");
		 * System.out.println("The new string after removing the spaces is "+str1);
		 * System.out.println(str2); str2 = str2.replace(' ', ch);
		 * System.out.println("The new string after replacing space with new char is  "
		 * +str2);
		 * 
		 */
	
		/*
		 * //3)------- swapping two strings without using third variable String str1
		 * ="My Dad", str2="is super hero";
		 * System.out.println("The string values before swapping are   :"+str1+" "+str2)
		 * ; str1 =str1+str2; str2 =str1.substring(0, (str1.length()-str2.length()));
		 * str1=str1.substring(str2.length());
		 * System.out.println("The string values after swapping are  :"+str1+" "+str2);
		 * 
		 * 
		 */
		
		/*
		 * //4)------- Reading input file and counting words in it String line; int
		 * count=0; FileReader file = new FileReader("test2.txt"); BufferedReader br =
		 * new BufferedReader(file);
		 * 
		 * while((line =br.readLine())!=null) {
		 * 
		 * String words[]=line.split(" "); count = count + words.length; }
		 * //System.out.println("The file is being read from the location  :"+file.
		 * getCanonicalPath());
		 * System.out.println("the number of words in given file are   :"+count);
		 * br.close();
		 * 
		 */
	
		
		/*
		 * //5)---------- Anagram program String str1 = "Anagram ", str2 ="agraman ";
		 * str1 = str1.toLowerCase(); str2 = str2.toLowerCase();
		 * 
		 * if (str1.length()!=str2.length()) {
		 * 
		 * System.out.println("The two strings are NOT anagram"); } else { char[]
		 * string1 = str1.toCharArray(); char[] string2 = str2.toCharArray();
		 * 
		 * Arrays.sort(string1); Arrays.sort(string2);
		 * 
		 * if (Arrays.equals(string1, string2) == true) {
		 * 
		 * System.out.println("The two strings are Anagram"); } else {
		 * System.out.println("The two strings are NOT anagram"); }
		 * 
		 * 
		 * }
		 */
		
		/*
		//6)-------------- Copy elements from one array o another array
		int[] arr1 = new int[] {1,2,3,4,5,6,7,8,9};
		int[] arr2 = new int[arr1.length];
		int[] arr3 = new int[arr1.length];
		System.out.println("The Original array elements are.....");
		for (int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
			}
		System.out.println("The elements copied to new array are");
		for (int i=0;i<arr1.length;i++) {
			arr2[i] = arr1[i];
			//arr3[i] = arr2[i]+arr1[i];
			System.out.print(arr2[i]+" ");
			//System.out.println(arr3[i]+" ");
		}
			*/
		
		
		  //7)--------Find frequency of elements in Array, remove duplicate and print array elements 
		  int[] arr4=new int[] {1,2,1,3,4,5,3,2,1,5,6,5,6,3,7,7}; int[]
		  fr = new int[arr4.length]; int visited=-1;
		  
		  for(int i=0;i<arr4.length;i++) { int count =1; for(int
		  j=i+1;j<arr4.length;j++) {
		  
		  if (arr4[i]==arr4[j]) { count++; fr[j]= visited; } }
		  
		  if (fr[i]!= visited) System.out.println(arr4[i]+"  "+count);
		  
		  
		  
		  }
		 
		
		
	}
}

	
