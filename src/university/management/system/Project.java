
package university.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Project extends JFrame implements ActionListener{
    Project()
    {
        setSize(1540,850);
        // add image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        // create menu bar
        // 1.New Information
        JMenuBar mb=new JMenuBar();
        JMenu newInformation=new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        //create Menu Item
        // FacultyInfo
        JMenuItem facultyInfo =new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        //StudentInfo
        JMenuItem StudentInfo =new JMenuItem("New Student Information");
        StudentInfo.setBackground(Color.WHITE);
        StudentInfo.addActionListener(this);
        newInformation.add(StudentInfo);
        //2. View Details
        
        JMenu details=new JMenu("View Details");
        details.setForeground(Color.RED);
        mb.add(details);
        //create Menu Item
        // FacultyDetails
        JMenuItem facultyDetails =new JMenuItem("View  Faculty Details");
        facultyDetails.setBackground(Color.WHITE);
        facultyDetails.addActionListener(this);
        details.add(facultyDetails);
        //StudentDetails
        JMenuItem StudentDetails =new JMenuItem("View Student Details");
        StudentDetails.setBackground(Color.WHITE);
        StudentDetails.addActionListener(this);
        details.add(StudentDetails);
        //3.Leave
        JMenu leave=new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);
        //create Menu Item
        // FacultyLeave
        JMenuItem facultyLeave =new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.WHITE);
        facultyLeave.addActionListener(this);
        leave.add(facultyLeave);
        //StudentLeave
        JMenuItem StudentLeave =new JMenuItem("Student Leave");
        StudentLeave.setBackground(Color.WHITE);
        StudentLeave.addActionListener(this);
        leave.add(StudentLeave);
        //3.Leave Details
        JMenu leaveDetails=new JMenu("Leave Details");
        leaveDetails.setForeground(Color.RED);
        mb.add(leaveDetails);
        //create Menu Item
        // FacultyLeave Details
        JMenuItem facultyLeaveDetails =new JMenuItem("Faculty Leave Details");
        facultyLeaveDetails.setBackground(Color.WHITE);
         facultyLeaveDetails.addActionListener(this);
        leaveDetails.add(facultyLeaveDetails);
        //StudentLeaveDetails
        JMenuItem StudentLeaveDetails =new JMenuItem("Student Leave Details");
        StudentLeaveDetails.setBackground(Color.WHITE);
        StudentLeaveDetails.addActionListener(this);
        leaveDetails.add(StudentLeaveDetails);
        // Exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLUE);
        mb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.WHITE);
       examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        // UpdateInfo
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.RED);
        mb.add(updateInfo);
        
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
       updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);
        
        // fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
         feeform.addActionListener(this);
        fee.add(feeform);
        
        // Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.RED);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);
        
        // about
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLUE);
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        
        // exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        setJMenuBar(mb);
        
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
         new Project();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        
        if (msg.equals("Exit"))
        {
            setVisible(false);
        } else if (msg.equals("Calculator")) 
        {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e)
            {
                
            }
        } else if (msg.equals("Notepad")) 
        {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) 
            {
                
            }
        } else if(msg.equals("New Faculty Information"))
        {
            new AddTeacher();
        }
        else if(msg.equals("New Student Information"))
        {
            new AddStudent();
        }
        else if(msg.equals("View  Faculty Details"))
        {
           
            new TeacherDetails();
        }
        else if(msg.equals("View Student Details"))
        {
            new StudentDetails();
        }
        else if(msg.equals("Student Leave"))
        {
             new StudentLeave();
        }
        else if(msg.equals("Faculty Leave"))
        {
             new TeacherLeave();
        }
        else if(msg.equals("Faculty Leave Details"))
        {
               new TeacherLeaveDetails();
        }
        else if(msg.equals("Student Leave Details"))
        {
              new StudentLeaveDetails();
        }
        else if(msg.equals("Update Faculty Details"))
        {
              new UpdateTeacher();
        }
         else if(msg.equals("Update Student Details"))
        {
              new UpdateStudent();
        }
         else if(msg.equals("Enter Marks"))
        {
              new EnterMarks();
        }
        else if(msg.equals("Examination Results"))
        {
              new ExaminationDetails();
        }
        else if(msg.equals("Fee Structure"))
        {
              new FeeStructure();
        }
        else if(msg.equals("Student Fee Form"))
        {
              new StudentFeeForm();
        }
         else if(msg.equals("About"))
        {
              new About();
        }
    }
 }
