#!/bin/bash

# Extract theme to /usr/share/themes
sudo tar -xf Matcha-Config.tar.xz -C /usr/share/themes

# C program just appends data to gtk.css for border states (active/inactive)
g++ -o configure-theme configure-theme.cpp

# Will pass user path to help C program find files easier
userPath=`echo /home/$USER`

# Temporary buffer for the data being appended to the final file  
cp appendData $userPath

# Run auto append program, passing in user pathname
./configure-theme $userPath

# Cleanup:
rm $userPath/appendData
openbox --reconfigure
