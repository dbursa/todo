#Everything below is in app folder

#Manifest (AndroidManifest.xml file)
 - general app configuration
 - some users permission will be there also

#java
 - first com file is important, there is app logic
 - MainActivity is entrypoint for android project
 - class MainActivity is called after app launch
 - its same like main() function for Kotlin

#java (generated)
 - something like public folder in web development
 - there are generated files

#res
1. drawable
 - folder for images/icons

2. layout
 - like html but in xml format

3. mipmap
 - launcher icons (mostly for deploy to Google play)

4. values
 - global variables for colors/strings/styles

#gradle scripts
 - build system for android
 - something like webpack/vite...
 - most important are build.gradle files (something like package.json)


##ACTIVITIES AND THEIR LIFECYCLE
 - activity is one app screen (one activity == one screen)
 - every activity is in java/com/...

#Activity stack
 - vicemene to jsou prekryvajici se layouty
 - pr. Kliknu na btn, ktery me presmeruje na dalsi screenu, na te kliknu jeste na jeden -> stack vypada: treti obrazovka - druha - prvni. Kdyz jdu zpet na druhou obrazovku (kliknu zpet), stack vypada: druha obrazovka - prvni

#ViewBinding
 - Abychom nemuseli hledat views pres findViewById
 - Musim pridat buildFeatures a viewBinding v app/build.gradle
 - tim si zpristupnim viewBinding v projektu