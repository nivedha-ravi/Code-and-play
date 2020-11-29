/*
The encryption algorithm is given below.
- Each alphabet in the message must be shifted by key number of places down the alphabets.
- Each digit in the message must be shifted by key number of places down the digits.
- For all other characters in the message, they remain the same.
Note: The English alphabet set and the digits (0 to 9) must be considered in a cyclic fashion for the encryption.
 Input:
 1
 All is well. #45.9K Tweets
 Output:
 Bmm jt xfmm. #56.0L Uxffut
*/
public static String customCaesarCipher(int key, String message) {
    String s="";
    if(key<0)
    {
        return "INVALID INPUT";
    }
    else
    {
        for(int i=0;i<message.length();i++)
        {
            if(Character.isDigit(message.charAt(i)))
            {
                int num=Character.getNumericValue(message.charAt(i))+key;
                s+=num%10;
            }
            else if(Character.isAlphabetic(message.charAt(i)))
            {
                int num=message.charAt(i)+key;
                if(Character.isLowerCase(message.charAt(i)))
                {
                    if(num>122)
                    {
                        s+=(char)(((num-97)%26)+97);
                    }
                    else
                    {
                        s+=(char)(num);
                    }
                }
                else
                {
                    if(num>90)
                    {
                        s+=(char)(((num-65)%26)+65);
                    }
                    else
                    {
                        s+=(char)(num);
                    }
                }
            }
            else
            {
                s+=message.charAt(i);
            }
        }
    }
    return s;


}
