# Compile source code

Run the following commands in cmd

```shell
  dir /s /B *.java > sources.txt
  javac -cp ".;./atdd-v2-trainee-all.jar" -encoding utf8 -d "./classes" @sources.txt
```

# Run tests

Run the following commands in cmd

```shell
  java -cp ".;./atdd-v2-trainee-all.jar;./resources;./classes" io.cucumber.core.cli.Main ./resources/ui/login.feature --glue "com.odde.atddv2.nodeps"
```

