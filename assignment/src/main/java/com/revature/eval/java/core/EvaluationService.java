package com.revature.eval.java.core;

import java.time.temporal.Temporal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class EvaluationService extends Exception {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		return null;
	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			// TODO Write an implementation for this method declaration
			if(this.sideOne==this.sideTwo)
				if(this.sideTwo == this.sideThree)
					return true;
			return false;
		}

		public boolean isIsosceles() {
			// TODO Write an implementation for this method declaration
			if(this.sideOne==this.sideThree || this.sideTwo==this.sideThree)
			{
				return true;
			}
			return false;
		}

		public boolean isScalene() {
			// TODO Write an implementation for this method declaration 
			if(this.sideOne!=this.sideTwo || this.sideTwo!= this.sideThree)
			{
				return true;
			}
			return false;
		}

	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
		
		// create arrays to represent letter values
		char[] valueOne = {'A','E','I','O','U','L','N','R','S','T'};
		char[] valueTwo = {'D','G'};
		char[] valueThree = {'C','M','P','B'};
		char[] valueFour = {'F','H','V','W','Y'};
		char[] valueFive = {'K'};
		char[] valueEight = {'X'};
		char[] valueTen = {'Z','Q'};
		
	
		
		// stores the score
		int score=0;
		int j;
		int k;
		// creates an array to hold input values
		char[] inputString=new char[100];
		
		//go through input string an set to inputString array 1 charecter at a time
		for(int i=0; i<string.length();i++)
		{
			inputString[i] = string.charAt(i);
		}
		
		//go through the inputString array 
		
		for( j=0; j<inputString.length;j++)
		{
			for( k=0;k<valueOne.length;k++)// go through valueOne array
			{
				if(Character.toUpperCase(inputString[j])==valueOne[k])// check to see if character at inputString is equal to charecter at valueOne array
				{
					score+=1;//add one to score
				}
			}
		}
		
		for(j=0; j<inputString.length;j++)
		{
			for(k=0;k<valueTwo.length;k++)
			{
				if(Character.toUpperCase(inputString[j])==valueTwo[k])
				{
					score+=2;
				}
			}
		}
		
		
		for(j=0; j<inputString.length;j++)
		{
			for(k=0;k<valueThree.length;k++)
			{
				if(Character.toUpperCase(inputString[j])==valueThree[k])
				{
					score+=3;
				}
			}
		}
		
		
		
		for(j=0; j<inputString.length;j++)
		{
			for(k=0;k<valueFour.length;k++)
			{
				if(Character.toUpperCase(inputString[j])==valueFour[k])
				{
					 
					score+=4;
				}
			}
		}
		
		
		for(j=0; j<inputString.length;j++)
		{
			for(k=0;k<valueFive.length;k++)
			{
				if(Character.toUpperCase(inputString[j])==valueFive[k])
				{
					score+=5;
				}
			}
		}
		
		

		for(j=0; j<inputString.length;j++)
		{
			for(k=0;k<valueEight.length;k++)
			{
				if(Character.toUpperCase(inputString[j])==valueEight[k])
				{
					score+=8;
				}
			}
		}
		
		
		for(j=0; j<inputString.length;j++)
		{
			for(k=0;k<valueTen.length;k++)
			{
				if(Character.toUpperCase(inputString[j])==valueTen[k])
				{
					score+=10;
				}
			}
		}	
		
		return score;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		// TODO Write an implementation for this method declaration
		
		// string replace all 1st arg is regex ^ everything but these charecters.
		String clean = string.replaceAll("[^0-9]", "");
		
		if(clean.length()!=10)
		{
			throw new IllegalArgumentException();
		}

			
		return clean;
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		Map<String, Integer> aMap = new HashMap<>();
		
	
		String[] strSplit = string.split(",?[^a-zA-Z]");	
		
		for(int i=0;i<strSplit.length;i++)
		{
			
			//aMap.put(strSplit[i]);
			if(aMap.containsKey(strSplit[i]))
			{
				aMap.replace(strSplit[i], aMap.get(strSplit[i])+1);
			}else {
				aMap.put(strSplit[i], 1);
			}
		}
		
		
		return aMap ;
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		private int[] list = {1,2,3,4,5,6};
		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			sortedList = new ArrayList<>();
			
			return 0;
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public String toPigLatin(String string) {
		// TODO Write an implementation for this method declaration
		String[] wordSplit = string.split(" ");
		int indexPosition = 0;
		String result ="";
		
		//String[] vowels = {"a","e","i','o','u'};
		
		for(int i=0;i<wordSplit.length;i++)
		{
			if(wordSplit[i].substring(0, 2).compareToIgnoreCase("qu")==0)
			{
				wordSplit[i]=wordSplit[i].substring(2)+"quay";
			}else {
				for(int j=0;j<wordSplit[i].length();j++)
				{
					if(wordSplit[i].substring(j,j+1).matches("[aeiouAEIOU]"))
					{
						indexPosition = j;
						break;
					}
				}
				wordSplit[i] = wordSplit[i].substring(indexPosition)+wordSplit[i].substring(0,indexPosition)+"ay";
			}
			// bring spaces back
			if(wordSplit.length == 1)
			{
				result = result+wordSplit[i];
				System.out.println("here");
			}else {
			result = result+wordSplit[i]+" ";
			}
			System.out.println(wordSplit[0].length());
		}
		

//		
		
		return result;
	}

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		// TODO Write an implementation for this method declaration
		int originalNum;
		
		int count=0;
		ArrayList<Integer> numList = new ArrayList<Integer>();
		String splitNum="";
		splitNum.matches("[0-9]");
		int newNum =0;
		originalNum = input;
		count = originalNum %10;
		Stack<Integer> stack = new Stack<Integer>();
		
		int[] splitString= {};
		
		    
		numList.add(Integer.parseInt(splitNum));
		numList.add(Integer.parseInt(splitNum));
		numList.add(Integer.parseInt(splitNum));
		
		
		
		
		for(int i=0;i<count;i++)
		{
			stack.push( numList.get(i) );
		   
		    newNum += Math.pow(stack.pop(), count);
		   
		}
		
	
		
	
		
		if(originalNum==newNum)
		{
			return true;
		}
		
		return false;
	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		
		ArrayList<Long> result = new ArrayList<Long>();
		long i = 0;
		//start at 2 cause 1 is not a factor
		for(i=2;i<=l;i++)
		{
			
			if(l%i==0)
			{
				long temp = l/i;
				
						
						result.add(temp);
						l=i;
						i--;

				
			}
			
		}

		// TODO Write an implementation for this method declaration
	
		return result;
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	static class RotationalCipher {
		private int key;

		public RotationalCipher(int key) {
			super();
			this.key = key;
		}

		public String rotate(String string) {
			// TODO Write an implementation for this method declaration
			String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
			//int[] phraseKey ={};
			String[] alphabetU = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
			//int[] phraseKey ={};
			ArrayList<Integer> phraseKey = new ArrayList<Integer>();//[6,12,14]
			//String key ="a";
			//int key = 6;
			int keyIndex=0;
			String[] chipher= new String[alphabet.length];
			String[] chipherU= new String[alphabetU.length];
			int count =0;
			String searchKey = string;
			String[] stringSearch = new String[25];
			stringSearch = searchKey.split("[a-zA-Z]{0}");
			String result="";
			StringBuilder input1 = new StringBuilder();
			
			//switch to lowwercase
			searchKey.toLowerCase();
		
			
			//set keyIndex
			for(int i=0;i<alphabet.length;i++)
			{
				//if(key==alphabet[i].ind)
				if(key==i)
				{
					keyIndex = i;
					break;
					//System.out.println(keyIndex);
				}
			}
			
			//add alhpabet at index keyIndex to chiper index 0 and so on
			
				for(int j=0;j<chipher.length-keyIndex;j++)
				{
					if(Character.isUpperCase(searchKey.charAt(0)))
					{
						chipherU[j]= alphabetU[j+keyIndex];
						count++;
					}else {
					chipher[j]= alphabet[j+keyIndex];
					count++;
					}
					//uppercase modifier
					
					
				}
				
				//finish chipher
				for(int i=count;i<chipher.length;i++)
				{
					
					//uppercase modifier
					if(Character.isUpperCase(searchKey.charAt(0)))
					{
						chipherU[i]= alphabetU[i-count];
						
					}else {
						chipher[i]= alphabet[i-count];
					}
					
				}
				
				//set stringSearch to array of input
				for(String str:stringSearch)
				{
					//System.out.print(str);
				}
				
				
				//generate stringkey values
				for(int k=0;k<alphabet.length;k++)
				{
					if(Character.isUpperCase(searchKey.charAt(0)))
					{
						for(int z=0;z<stringSearch.length;z++)
						{
							if(alphabetU[k].equals(stringSearch[z]))
							{
								
								phraseKey.add(k);
								break;
							}
							
							//uppercase modifier
						}	
						//break;
					}else {
						//System.out.println(alphabet[k]);
						for(int z=0;z<stringSearch.length;z++)
						{
							if(alphabet[k].equals(stringSearch[z]))
							{
								
								phraseKey.add(k);
								break;
							}
							
							//uppercase modifier
						}	
					}
					
				}
				
				
				
				for(int a=0;a<chipher.length;a++)
				{
					if(Character.isUpperCase(searchKey.charAt(0)))
					{
						for(int b=0;b<stringSearch.length;b++)
						{
							if(Character.isUpperCase(searchKey.charAt(0)))
							{
								if(chipherU[a].equals(stringSearch[b]))
								{
									result += chipherU[phraseKey.get(b)];
									
									break;
								}
								
							}
							
						
							
						}
						
					}else {
						for(int b=0;b<stringSearch.length;b++)
						{
							if(chipher[a].equals(stringSearch[b]))
							{
								result = chipher[phraseKey.get(b)];
							
								break;
							}
						}
						
					}
				
					
					
				}
				
				
			return result;
		}

	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	public int calculateNthPrime(int i) {
		// TODO Write an implementation for this method declaration
		return 0;
	}

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			// TODO Write an implementation for this method declaration
			ArrayList<Character> encrypted = new ArrayList<Character>();
			//char[]encrypted={};
			char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
								 'n','o','p','q','r','s','t','u','v','w','x','y','z'};
			char[] decodeAlphabet = {'z','y','x','w','v','u','t','s','r','q','p','o','n',
					 'm','l','k','j','i','h','g','f','e','d','c','b','a'};
			int count =0;
			int offset=0;
			ArrayList<Character>deCriptArr= new ArrayList<Character>();
			String decrypted="";
			ArrayList<Integer> decriptMap =new ArrayList<Integer>();
			
			// TODO Write an implementation for this method declaration
			
			//create an array using string
			for(int i=0;i<string.length();i++)
			{
				
				encrypted.add(string.charAt(i));
			}
			
			// go through alphabet array
			for(int i=0;i<encrypted.size();i++)
			{
				//check to see if the encrypted charecter is equal to the alphabet
				for(int j=0;j<alphabet.length;j++)
				{
					if(encrypted.get(i)==alphabet[j])
					{
						count = j;
						decriptMap.add(count);
						//System.out.println(alphabet[i]);
						//System.out.println(j);
					}	
				}

			}
			
			//get the offest number 
			for(int j=count;j<alphabet.length-1;j++){
				offset++;
			}
			//System.out.println(offset);
			
			//get decryption
			for(int j=0;j<decriptMap.size();j++)
			{
					deCriptArr.add(decodeAlphabet[decriptMap.get(j)]);
					decrypted+=deCriptArr.get(j);
			}
			Pattern pattern = Pattern.compile("[a-z]{3,4}+\\s+[a-z]{3,4}\\w[a-z]{3,5}");
			Matcher matcher = pattern.matcher(decrypted);
			

			return decrypted;
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			// TODO Write an implementation for this method declaration
			
			return null;
			
		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isValidIsbn(String string) {
		// TODO Write an implementation for this method declaration
		String ISBN;
		int[] numFormat = new int[10];
		List<String> stringArr = new ArrayList<String>();
		
		int result;
		ISBN = string;
		Pattern pattern = Pattern.compile("[^-A-Z]");
		Matcher matcher = pattern.matcher(ISBN);
		
		while(matcher.find())
		{
			if(matcher.group().length() !=0)
			{
				
				stringArr.add(matcher.group().trim());
			}
		}
		// convert string to array of numbers
		
		for(int i=0;i<stringArr.size();i++)
		{
			numFormat[i] = Integer.parseInt(stringArr.get(i));
		}
		//x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
		 // * 2 + x10 * 1
		result = checkExpression(numFormat[0],numFormat[1],numFormat[2],numFormat[3],numFormat[4],
				numFormat[5],numFormat[6],numFormat[7],numFormat[8],numFormat[9]);
		if(result==0)
		{
			//System.out.println("is valid isbn");
			return true;
		}
		
		//System.out.println(numFormat);
		return false;
	}
	
	public  int checkExpression(int x1,int x2, int x3,int x4,int x5,int x6,int x7,int x8,int x9, int x10)
	{
		int value = (x1*10 + x2*9 + x3*8 + x4*7 +x5*6+ x6*5 + x7*4 + x8*3 + x9*2 + x10*1)%11;
		return value;
	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isPangram(String string) {
		// TODO Write an implementation for this method declaration
		//
		StringBuilder sb = new StringBuilder();
	
		// go through the length of the input string
		for(int i=0;i<string.length();i++)
		{
			//string.substring starts t first index but second argugment never goes out of bound
			String cur = string.substring(i, i+1);
			//if the string matches charecters without spaces
			if(cur.matches("[a-zA-Z]"))
			{
				//string builder index of string == -1 if theres something that already in string builder
				if(sb.indexOf(cur)==-1)
				{
					sb.append(cur);
				}
			}
			
		}
		
		
		return sb.length()==26;
	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	/*public Temporal getGigasecondDate(Temporal given) {
		// TODO Write an implementation for this method declaration
		return null;
	}*/

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) {
		// TODO Write an implementation for this method declaration
		return 0;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isLuhnValid(String string) {
		// TODO Write an implementation for this method declaration
		return false;
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		// TODO Write an implementation for this method declaration
		
		return 0;
	}

}
