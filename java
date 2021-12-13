Find java version used to compile jar
javap -cp log4j-core-2.5.jar -verbose org.apache.logging.log4j.core.Logger | findstr major

List libs in a one jar
    jar tf jar-file
    
  
