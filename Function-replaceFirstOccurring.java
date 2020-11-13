/*
Input:
Skill7E3Rack57TOO
Output:
Skikk7E7Sikk77SEE
*/
public static void replaceByFirstOccurring(char[] str) {
    char firstDigit='*',firstLowerConso='&',firstUpperConso='!',firstLowerVowel='@',firstUpperVowel='#';
    for(int i=0;i<str.length;i++)
    {
        if(Character.isDigit(str[i]) && firstDigit=='*')
        {
            firstDigit=str[i];
        }
        else if(isVowel(str[i]))
        {
            if(Character.isUpperCase(str[i]) && firstUpperVowel=='#')
            {
                firstUpperVowel=str[i];
            }
            else if(Character.isLowerCase(str[i]) && firstLowerVowel=='@')
            {
                firstLowerVowel=str[i];
            }
        }
        else if(!isVowel(str[i]))
        {
            if(Character.isUpperCase(str[i]) && firstUpperConso=='!')
            {
                firstUpperConso=str[i];
            }
            else if(Character.isLowerCase(str[i]) && firstLowerConso=='&')
            {
                firstLowerConso=str[i];
            }
        }
    }
    for(int i=0;i<str.length;i++)
    {
        if(Character.isDigit(str[i]))
        {
            str[i]=firstDigit;
        }
        else if(Character.isLowerCase(str[i]) && isVowel(str[i]))
        {
            str[i]=firstLowerVowel;
        }
        else if(Character.isUpperCase(str[i]) && isVowel(str[i]))
        {
            str[i]=firstUpperVowel;
        }
        else if(Character.isLowerCase(str[i]) && (!isVowel(str[i])))
        {
            str[i]=firstLowerConso;
        }
        else if(Character.isUpperCase(str[i]) && (!isVowel(str[i])))
        {
            str[i]=firstUpperConso;
        }
    }

}
public static boolean isVowel(char ch)
{
    ch=Character.toLowerCase(ch);
    return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
}
