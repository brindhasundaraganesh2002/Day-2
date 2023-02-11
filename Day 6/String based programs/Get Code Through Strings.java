import java.io.*;
import java.util.*;
class UserMainCode{
public int getCodeThroughString(String input1){
String word[]=input1.split(" ");  
int sum=0;  
for(int i=0;i<word.length;i++)  
{          
sum+=word[i].length();  
}   
return (1 + (sum-1) %9); 
}}
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
Privacy
