# RDF-Doctor

To run RDF-Doctor from command line, use the following command line with the input file location. But the current folder where you are running the RDF-Doctor will be considered as an output folder:
```
java -jar RDFDoctor -i [inputFileLocation]
```
To specifiy the output location for RDF-Doctor, use the following command line:
```
java -jar RDFDoctor -i [inputFileLocation] -o [outputReportsLocation]
```
To specifiy the output location for RDF-Doctor, use the following command line:
```
java -jar RDFDoctor -i [inputFileLocation] -o [outputReportsLocation]
```
To have the output reprot in a JSON format add -j prefix as follows:
```
java -jar RDFDoctor -j -i [inputFileLocation] -o [outputReportsLocation]
```
for Viewing the parse tree use -v prefix as follows:
```
java -jar RDFDoctor -v -i [inputFileLocation] -o [outputReportsLocation]
```
