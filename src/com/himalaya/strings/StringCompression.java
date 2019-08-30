
/**
* StringCompression.java
*
*
* @author Tarakeshwar Sriram 
* @since 2019-08-30
*/

class StringCompression{


	public static void main(String[] args) {
		
		compress("Aaaaabbbbbccd");
		compress("Algebra");
	}

	private static String compress(String uncompressedString){

		if(compressCount(uncompressedString) >= uncompressedString.length()){
			System.out.println("length of compressed string is greater than length of" + uncompressedString);
			return uncompressedString;
		}

		StringBuffer compressedString = new StringBuffer();

		char last = uncompressedString.charAt(0);
		int count = 1;

		for(int i=0; i< uncompressedString.length(); i++){

			if(last == uncompressedString.charAt(i)){
				count++;
			}
			else{
				compressedString.append(last);
				compressedString.append(count);
				last = uncompressedString.charAt(i);
				count = 1;
			}
		}

		compressedString.append(last);
		compressedString.append(count);

		System.out.println("compressed " + uncompressedString  + "=>" +  compressedString);
		return compressedString.toString();
	}



	private static int compressCount(String uncompressedString){

		int size = 0 ;
		char last = uncompressedString.charAt(0);
		int count = 0;

		for(int i=0; i < uncompressedString.length(); i++){

			if(last == uncompressedString.charAt(i)){
				count++;
			}
			else{
				last = uncompressedString.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}

		size += 1 + String.valueOf(count).length();
		return count;
	}
}