# Bank-Management-System
Bank Management System in Java Swing

# Start
mysql: docker-compose up -d

# import data for mysql of docker
docker exec -i bank_schema-db mysql -u user1 -p'123@123' bank_schema < data.sql

# Build and run
* javac -d out -cp "BM_System/libs/*" $(find BM_System/src -name "*.java")
* java -cp "out:BM_System/libs/*" def_pkg.BM_System

# Build file jar
* Tạo thư mục tmp_jar
  - mkdir -p tmp_jar/META-INF
  - cp -r out/* tmp_jar/
* Giải nén tất cả JARs vào thư mục tmp_jar 
  - for jar in BM_System/libs/*.jar; do
    unzip -o $jar -d tmp_jar
    done
* Tạo file MANIFEST.MF
  - echo "Main-Class: def_pkg.BM_System" > tmp_jar/META-INF/MANIFEST.MF
*  Đóng gói lại thành .jar
  - jar cvfm BankSystem.jar tmp_jar/META-INF/MANIFEST.MF -C tmp_jar .

# Run file jar
  - java -jar BankSystem.jar



# run file jar



#### Tool and Technologies Used:
* Java
* Java Swing
* MySQL
* Eclipse
* iText Java Library (PDF Creation)
