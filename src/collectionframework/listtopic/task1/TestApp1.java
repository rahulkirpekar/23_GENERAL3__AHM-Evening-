package collectionframework.listtopic.task1;

import java.util.Vector;
import java.util.Scanner;

//Student Management Application
//---------------------------------
//1) Add---add()
//2) update--set(index,object);
//3) remove---remove(index);
//
//4) Display All records
//
//5) search by rno / Name	
//
//	lisobj-----student---rno---compare---searchValue
//
//
//6) Sorting---Sorting Techniques
//	1) Ascending Order
//	2) Desecendinh Order
//
//7) Application exit




public class TestApp1 
{
	public static void main(String[] args) 
	{
		Vector<Student> listObj = new Vector<Student>();
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
				System.out.println("1) Add Student---add()                                         ");
				System.out.println("2) update Student--set(index,object);                          ");
				System.out.println("3) remove Student---remove(index);                             ");
				System.out.println("4) Display All records                                 ");
				System.out.println("5) search by rno / Name	                            ");
				System.out.println("6) Application exit									");
				int choice = sc.nextInt();
				
				switch(choice) 
				{
					case 1: Student obj = new Student(); 
							obj.scanData();
							listObj.add(obj);
							System.out.println("Student record successfully Inserted");
							break;

					case 2:
							System.out.println("Enter Rno which you want to Update student : ");
							int searchRno = sc.nextInt();
							boolean flag= false;
							int i = 0;
							for (; i < listObj.size(); i++) 
							{
								Student sobj = listObj.get(i);
								
								if (sobj.getRno()==searchRno) 
								{
									flag= true;
									break;//index---i--4
								}
							}
							if (flag) 
							{
								Student s  = listObj.get(i);
								
								listObj.set(i, s);
								
								System.out.println("Student rno successfully updated from records.");
							} else 
							{
								System.out.println("Student rno not found in student records.");
							}
						
						
							break;
					case 3:
							System.out.println("Enter Name which you want to Delete student : ");
							sc.nextLine();
							String searchName = sc.nextLine();
							flag= false;
							i = 0;
							for (; i < listObj.size(); i++) 
							{
								Student sobj = listObj.get(i);
								
								if (sobj.getName().equals(searchName)) 
								{
									flag= true;
									break;//index---i--4
								}
							}
							if (flag) 
							{
								listObj.remove(i);
								System.out.println("Student rno successfully removed from records.");
							} else 
							{
								System.out.println("Student rno not fount in student records.");
							}

						
						
//							System.out.println("Enter Rno which you want to Delete student : ");
//							int searchRno = sc.nextInt();
//							boolean flag= false;
//							int i = 0;
//							for (; i < listObj.size(); i++) 
//							{
//								Student sobj = listObj.get(i);
//								
//								if (sobj.getRno()==searchRno) 
//								{
//									flag= true;
//									break;//index---i--4
//								}
//							}
//							if (flag) 
//							{
//								listObj.remove(i);
//								System.out.println("Student rno successfully removed from records.");
//							} else 
//							{
//								System.out.println("Student rno not fount in student records.");
//							}
							break;
							
					case 4:	for(i = 0 ; i < listObj.size();i++) 
							{
								Student s = listObj.get(i);
								s.disp();
							}
							break;
					case 5:	System.out.println("Enter Rno which you want to searc student : ");
							searchRno = sc.nextInt();
							flag= false;
							i = 0;
							for (; i < listObj.size(); i++) 
							{
								Student sobj = listObj.get(i);
								
								if (sobj.getRno()==searchRno) 
								{
									flag= true;
									break;//index---i--4
								}
							}
							if (flag) 
							{
								Student searcobj = listObj.get(i);
								searcobj.disp();
							} else 
							{
								System.out.println("Student rno not fount in student records.");
							}
							break;
					case 6: System.out.println("Application will be exit");
							try 
							{
								Thread.sleep(500);
							} catch (InterruptedException e) 
							{
								e.printStackTrace();
							}
							System.exit(0);
							break;
				}
		}		
	}
}