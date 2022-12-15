//Implement a function which convert the given boolean value into its string representation.

//Note: Only valid inputs will be given.



/*********SOLUÇÃO*********/






#include <stdbool.h>

//The returned string should be statically allocated and it won't be freed
const char *boolean_to_string(bool b)
{
  if(b == true){
    return "true";
  }
  else{
    return "false";
  }// your code here
}