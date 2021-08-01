Registration of local Notes.jar
===============================
Please use a command like:

	mvn install:install-file -DgroupId=com.ibm -DartifactId=domino-api-binaries -Dversion=11.0.0 -Dpackaging=jar -Dfile=/opt/hcl/domino/notes/latest/linux/jvm/lib/ext/Notes.jar

to register your own local copy of Notes.jar as a local Maven plugin. Please change "/opt/hcl/domino/notes/latest" to reflect your installation directory of Domino.

