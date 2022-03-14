#include <iostream>
#include <string>
#include <fstream>
using namespace std;

// Appends additional configs to ~/.config/gtk-3.0/gtk.css 

static string WDIR="";
static string ORIGINAL_GTK="";

int main(int argc, char *argv[])
{
   if (argc != 2) {cout << "Couldn't determine $USER pathname."; return 1;}
 
   WDIR = argv[1];
   cout << "In: " << WDIR << endl;   
   
// Open both: 1) the appendage file 2) file to be appended
   std::ifstream dataToAdd(WDIR + "/appendData");
   std::ofstream GTK_DIR(WDIR + "/.config/gtk-3.0/gtk.css", std::ios_base::app | std::ios_base::out);

// Append to the gtk.css file the data file       
   if (!GTK_DIR.is_open()) {cout << "Error creating file"; return 1; }
   if (!dataToAdd.is_open()) { cout << "Could not read from source tree. "; return 2; }

   cout << "Appending border colors and states... " << endl;   
   GTK_DIR << dataToAdd.rdbuf();
   
   cout << endl << "Done! Change theme in Openbox to Matcha-Config. " << endl;
   
   return 0;
}
