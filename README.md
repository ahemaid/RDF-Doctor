# RDF-Doctor
Over the years, the demand for the interoperability support between diverse applications has significantly increased.  Typically, the Resource Definition Framework
(RDF) is utilized for interoperability support and allows for the representation of
knowledge and data from various domains.  Moreover, vast amounts of data from
heterogeneous data sources are continuously published in the RDF format.  Therefore, the RDF documents should be syntactically correct in order to enable software
agents for further processing.  Albeit, a number of approaches have been proposed
for  ensuring  error-free  RDF  documents,  but  these  approaches  are  commonly  not
able to identify all syntax errors at the same time by failing on the first encountered
error.

RDF-Doctor,  a  holistic  approach  for  detecting  and  resolving
syntactic  errors  in  an  autonomous  fashion.   First,  we  define  a  comprehensive  list
of errors that can be detected along with the customized error messages to allow
users  for  better  understanding  of  the  actual  errors.   Next,  special  methods  are
developed to automatically correct syntax errors.  Finally, for a particular number
of errors, customized and meaningful messages are delivered to users to facilitate the
manual corrections process.  The results from empirical evaluations provide concrete
evidence that the presented approach is able to effectively detect a wide range of
syntax errors and correct a subset of them

***How to run RDF-Doctor as a standalone version 

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
For Viewing the parse tree use -v prefix as follows:
```
java -jar RDFDoctor -v -i [inputFileLocation] -o [outputReportsLocation]
```
For Activation of auto correction use -c prefix as follows:
```
java -jar RDFDoctor -c -i [inputFileLocation] -o [outputReportsLocation]
```
