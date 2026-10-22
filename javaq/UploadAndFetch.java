/*
Question #2
Version-Controlled Storage System 
 
You are building a version-controlled file storage system for a cloud-based document repository. 
Each file can have multiple versions, with each version having a different size. 
 
Your system must support the following operations:
1. UPLOAD <FileName> <Version> <FileSize> 
Add a new file with its version and size in MB. 
 
2. FETCH <FileName> 
Retrieve all files and their versions along with their sizes, sorted in increasing order of the size of
each filename. 
If the file does not exist, return "File Not Found".
Print the file name, version, and file size that are requested by each FETCH operation. Otherwise, print
"File Not Found". 
 
Function Description 
In the provided code snippet, implement the provided storageSystem(...) method to print the file name,
version, and file size that are requested by each FETCH operation. Otherwise, print "File Not Found". You
can write your code in the space below the phrase. “WRITE YOUR LOGIC HERE”. 
 
There will be multiple test cases running, so the Input and Output should match exactly as provided. 
The base Output variable result is set to a default value -404 which can be modified. Additionally, you
can add or remove these output variables. 
Input Format 
The first line contains an integer N, denoting the number of operations. 
The next N lines contain operations in one of the following formats:
UPLOAD <FileName> <Version> <FileSize>
FETCH <FileName>


Sample Input
6                                                 
UPLOAD ReportFile V1 25        
UPLOAD ReportFile V2 30 
UPLOAD ReportFile V3 10 
UPLOAD Notes.txt V1 10 
FETCH ReportFile 
FETCH SummaryData-- denotes N -- denotes operations 
Constraints 
1 <= N <= 100 
1<= FileSize <= 106 
Output Format 
The output contains the result of each FETCH operation in separate lines, denoting the file name,
version, and file size that are requested by each FETCH operation. Otherwise, print "File Not Found". 
Sample Output
ReportFile V1 25 
ReportFile V2 30 
File Not Found


Explanation 
Operation 1: UPLOAD ReportFile V1 25 
→ Upload ReportFile version V1 with size 25. 
Operation 2: UPLOAD ReportFile V2 30 
→ Upload ReportFile version V2 with size 30. 
Operation 3: UPLOAD ReportFile V3 10 
→ Upload ReportFile version V3 with size 10. 
Operation 4: UPLOAD SummaryData V1 10 
→ Upload SummaryData version V1 with size 10. 

Operation 5: FETCH Report.pdf 
→ List all versions of Report.pdf: 
→ Output will be (in increasing order of file Size) 
ReportFile V3 10 
ReportFile V1 25 
ReportFile V2 30 

Operation 5: FETCH Summary.docx
→ SummaryData has not been uploaded. 
→ Output will be "File Not Found" 
 
Hence, the final output is  
ReportFile V3 10 
ReportFile V1 25 
ReportFile V2 30 
File Not Found.




*/
package javaq;

public class UploadAndFetch {

}
