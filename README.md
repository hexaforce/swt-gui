# swt-gui


## 実行手順
```bash
# build
$ mvn -P macosx clean package
# mvn -P linux clean package

# 実行
$ java -XstartOnFirstThread -jar build/application-jar-with-dependencies.jar
```

```bash

# https://download.eclipse.org/eclipse/downloads/drops4/R-4.26-202211231800/download.php?dropFile=swt-4.26-cocoa-macosx-x86_64.zip

$ mvn install:install-file \
    -Dfile=swt.jar \
    -DgroupId=org.eclipse.swt \
    -DartifactId=cocoa-macosx \
    -Dversion=4.26 \
    -Dpackaging=jar \
    -DgeneratePom=true

# https://download.eclipse.org/eclipse/downloads/drops4/R-4.26-202211231800/download.php?dropFile=swt-4.26-gtk-linux-x86_64.zip

$ mvn install:install-file \
    -Dfile=swt.jar \
    -DgroupId=org.eclipse.swt \
    -DartifactId=gtk-linux \
    -Dversion=4.26 \
    -Dpackaging=jar \
    -DgeneratePom=true

# https://download.eclipse.org/eclipse/downloads/drops4/R-4.26-202211231800/download.php?dropFile=swt-4.26-win32-win32-x86_64.zip

$ mvn install:install-file \
    -Dfile=swt.jar \
    -DgroupId=org.eclipse.swt \
    -DartifactId=win32-win32 \
    -Dversion=4.26 \
    -Dpackaging=jar \
    -DgeneratePom=true

```
