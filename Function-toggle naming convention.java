/*
Example Input/Output 1:
Input:
this_is_variable
Output:
thisIsVariable
Explanation:
The given variable name "this_is_variable" contains '_'.
After modifying the variable name as per the given condition, the variable name becomes "thisIsVariable" Hence the output is thisIsVariable
Example Input/Output 2:
Input:
thisIsVariable
Output:
this_is_variable
*/
public static char[] toggleNamingConvention(char[] str) {
    String s="";
    for(int i=0;i<str.length;i++)
    {
        if(str[i]=='_')
        {
            if(Character.isUpperCase(str[i+1]))
            {
                s+=Character.toLowerCase(str[i+1]);
            }
            else
            {
               s+=Character.toUpperCase(str[i+1]);
            }
            i++;
        }
        else if(Character.isUpperCase(str[i]))
        {
            s+='_';
            s+=Character.toLowerCase(str[i]);
        }
        else
        {
            s+=str[i];
        }
    }
    return s.toCharArray();

}
