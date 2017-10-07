package easy;

public class StudentAttendanceRecord1_551 {
/*
You are given a string representing an attendance record for a student. The record only contains the following three characters:

'A' : Absent.
'L' : Late.
'P' : Present.
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

Example 1:
Input: "PPALLP"
Output: True
Example 2:
Input: "PPALLL"
Output: False

 */
    public static void main(String[] args) {
        StudentAttendanceRecord1_551 sattend = new StudentAttendanceRecord1_551();
        sattend.checkRecord("PPALLL");
    }
    public boolean checkRecord(String s) {
        int isDoubleLL =0;
        int aCount = 0;
        char []arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            char singleChar =arr[i];
            if(i+2<s.length()){
                if(arr[i] == 'L'
                        && arr[i+1] == 'L'
                        &&arr[i+2] == 'L'){
                    return false;
                }
            }
            if(singleChar == 'A'){
                aCount++;
            }
        }
        if(aCount>1)
            return false;
        else
            return true;

    }
}
