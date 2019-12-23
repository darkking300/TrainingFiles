import java.util.Scanner;
class Test{
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		String str = scan.nextLine();
		StringBuilder storage = new StringBuilder();
		int vowel = 0;
		int consonant = 0;
		for(int i = str.length() - 1 ;i>=0;i--){
			char ch = str.charAt(i);
			storage.append(ch);
			ch = Character.toLowerCase(ch);
			if( ch >= 97 && ch <=122){
				switch(ch){
					case 'a':case 'e':case 'i': case 'o': case 'u':
						vowel++;
						break;
					default:
						consonant++;	
				
				}
				
			}
			
		
		}
		System.out.println(storage +", the given string contains "+ vowel +" vowels and  "+consonant + " consonants");
		
	
	
	}
}
