// Kyi Lei Aye
package Lab6;

public class StringKLA {
    public static void main(String[] args) {
        String input  = "Welcome To The COMSC-75 Fall  Course";

        // convert all alphabets to capital letters
        String upper_case_str = input.toUpperCase();
        System.out.print("Upper case: ");
        System.out.println(upper_case_str);

        // convert all alphabets to lower-case letters
        String lower_case_str = input.toLowerCase(); 
        System.out.print("Lower case: ");
        System.out.println(lower_case_str);

        // replace character 'a' of word Fall with character 'u'
        String new_str = input.replace('a', 'u');
        System.out.print("Replace 'a' with 'u' in Fall word: ");
        System.out.println(new_str);

        // print out the len of string
        int str_len = input.length();
        System.out.print("Length of the string: ");
        System.out.println(str_len);

        // print out the index of string Course
        int index = input.indexOf("Course");
        System.out.print("Index of the word 'Course': ");
        System.out.println(index);
    }
}
