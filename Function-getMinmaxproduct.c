int getMinMaxProduct(int a,int b,int c)
{
    int max=(a>b)?((a>c)?a:c):(b>c)?b:c;
    int min=(a<b)?((a<c)?a:c):(b<c)?b:c;
    return min*max;

}
