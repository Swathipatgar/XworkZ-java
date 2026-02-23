class Hospital {
  public static String[] findDoctorsBySpecialization(String specialization) {
if (specialization == "Cardiac Sciences") {
        String[] cardiacDoctors = {
                "Swathi","Deepika","Arjun","Chaitanya","Shrusti",
                "Kavya","Ananya","Rohan","Rahul","Sneha",
                "Divya","Kiran","Meghana","Aditya","Manoj"
	};
return cardiacDoctors;
        }
else if (specialization == "Dental Science") {
            String[] dentalDoctors = {
                "Priya","Harsha","Anjali","Varun","Lakshmi",
                "Sanjay","Bhavana","Tarun","Rakesh","Shruti",
                "Neha","Suraj","Amit","Pooja","Gagan"
            };
return dentalDoctors;
        }

else if (specialization == "Dermatology") {
            String[] dermatologyDoctors = {
                "Aishwarya","Ritu","Keerthana","Manasa","Madhuri",
                "Pranav","Sahana","Yashaswini","Rohit","Chandana",
                "Akshay","Lokesh","Nandini","Tejaswini","Ganesh"
            };
return dermatologyDoctors;
        }

else if (specialization == "Diabetology/Endocrinology") {
            String[] diabetesDoctors = {
                "Ramesh","Sunitha","Aparna","Vivek","Anusha",
                "Siddharth","Harini","Mahesh","Preethi","Ajay",
                "Sandhya","Naveen","Karthik","Bhavya","Darshan"
            };
return diabetesDoctors;
        }
else if (specialization == "ENT") {
            String[] entDoctors = {
                "Lavanya","Prakash","Snehal","Vinay","Rekha",
                "Suresh","Anita","Vishal","Pavitra","Rachana",
                "Sanketh","Divakar","Anand","Ritesh","Ankita"
            };
return entDoctors;
        }
else if (specialization == "Emergency and Trauma") {
            String[] emergencyDoctors = {
                "Shyam","Raghu","Monika","Dheeraj","Harshita",
                "Nitin","Charan","Pavani","Abhishek","Vaishnavi",
                "Ranjith","Suhas","Anirudh","Sanjana","Mithun"
            };
return emergencyDoctors;
        }

else if (specialization == "Foetal Medicine") {
            String[] foetalDoctors = {
                "Lakshmi","Kavitha","Meera","Aparajita","Sunil",
                "Praveen","Geetha","Anmol","Shreya","Vikas",
                "Harsh","Divyansh","Nayana","Tanya","Arvind"
            };
return foetalDoctors;
        }

else if (specialization == "Gastroenterology and Hepatobiliary Sciences") {
            String[] gastroDoctors = {
                "Mohan","Krupa","Teja","Rupesh","Bharti",
                "Ajith","Reshma","Prithvi","Deepak","Shalini",
                "Anvi","Mitali","Kishore","Ritika","Gautham"
            };
return gastroDoctors;
        }

else if (specialization == "General Surgery") {
            String[] surgeryDoctors = {
                "Vani","Prasad","Nikita","Anshul","Varsha",
                "Devika","Sonal","Aman","Shivani","Harshit",
                "Preetam","Neeraj","Manvi","Abhay","Gayathri"
            };
return surgeryDoctors;
        }

 else if (specialization == "Haematology") {
            String[] haematologyDoctors = {
                "Samar","Raghav","Nisha","Arpita","Smita",
                "Prerna","Adarsh","Lohith","Asha","Yogesh",
                "Manan","Sujatha","Devendra","Naveena","Akash"
            };
return haematologyDoctors;
        }

 else if (specialization == "Infectious Diseases") {
            String[] infectiousDoctors = {
                "Hemant","Nivedita","Ritvik","Sagar","Aditi",
                "Lokendra","Harika","Bhargav","Ishita","Tejal",
                "Rohini","Pratap","Sudeep","Vineet","Pallavi"
            };
return infectiousDoctors;
        }

else if (specialization == "Infertility medicine") {
            String[] infertilityDoctors = {
                "Yash","Aniket","Charitha","Girish","Tanvi",
                "Haroon","Manya","Sathvik","Keerti","Ravina",
                "Prisha","Vaibhav","Shravan","Deepthi","Veda"
            };
return infertilityDoctors;
        }

else if (specialization == "Internal Medicine") {
            String[] internalDoctors = {
                "Srinivas","Sudha","Mahendra","Harshad","Vijay",
                "Arun","Pavithra","Kunal","Akhil","Devanshi",
                "Preeti","Rashmi","Deepika","Kavya","Ananya"
            };
return internalDoctors;
        }
else if (specialization == "Mental Health and Behavioural Sciences") {
			String[] mentalHealthDoctors = {
        "Kiran","Pavitra","Rachana","Sanketh","Divakar",
        "Meghana","Ananya","Rahul","Sneha","Varun",
        "Aditi","Rohit","Harsha","Deepika","Preeti"
		};
return mentalHealthDoctors;
		}

else if (specialization == "Nephrology") {
		String[] nephrologyDoctors = {
        "Anand","Pooja","Ritesh","Ankita","Shyam",
        "Tejas","Lavanya","Arjun","Bhavya","Manoj",
        "Nikhil","Shruti","Kavya","Darshan","Sahana"
		};
return nephrologyDoctors;
		}

else if (specialization == "Neurointerventional Radiology") {
		String[] neuroInterventionalDoctors = {
        "Raghu","Monika","Dheeraj","Harshita","Nitin",
        "Charan","Vaishnavi","Ranjith","Suhas","Anirudh",
        "Sanjana","Mithun","Lokesh","Keerthi","Aditya"
		};
return neuroInterventionalDoctors;
		}

else if (specialization == "Neurology") {
    String[] neurologyDoctors = {
        "Charan","Pavani","Abhishek","Vaishnavi","Ranjith",
        "Tejaswini","Ganesh","Snehal","Vishal","Rekha",
        "Anita","Prakash","Divya","Kiran","Meghana"
    };
 return neurologyDoctors;
}

else if (specialization == "Neurosurgery") {
    String[] neurosurgeryDoctors = {
        "Suhas","Anirudh","Sanjana","Rakesh","Mithun",
        "Akhil","Devika","Sonal","Harshit","Preetam",
        "Neeraj","Manvi","Abhay","Gayathri","Samar"
    };
 return neurosurgeryDoctors;
}

else if (specialization == "Obstetrics and Gynaecology") {
    String[] obgDoctors = {
        "Lakshmi","Kavitha","Meera","Aparajita","Sunil",
        "Geetha","Shreya","Anusha","Harini","Pavithra",
        "Rashmi","Deepika","Ananya","Sneha","Bhavya"
    };
    return obgDoctors;
}

else if (specialization == "Oncology") {
    String[] oncologyDoctors = {
        "Praveen","Geetha","Anmol","Shreya","Vikas",
        "Harsh","Divyansh","Arvind","Tejal","Ritika",
        "Gautham","Mohan","Krupa","Ajith","Reshma"
    };
    return oncologyDoctors;
}

else if (specialization == "Ophthalmology") {
    String[] ophthalmologyDoctors = {
        "Harsh","Divyansh","Nayana","Tanya","Arvind",
        "Pooja","Kunal","Devanshi","Prakash","Rupali",
        "Sandeep","Aniket","Charitha","Tanvi","Haroon"
    };
    return ophthalmologyDoctors;
}

else if (specialization == "Organ Transplant") {
    String[] organTransplantDoctors = {
        "Mohan","Krupa","Tejas","Deepak","Shalini",
        "Ritika","Anvi","Kishore","Snehal","Prasad",
        "Nikita","Varsha","Devika","Sonal","Aman"
    };
    return organTransplantDoctors;
}

else if (specialization == "Orthopaedics") {
    String[] orthopaedicsDoctors = {
        "Ajith","Reshma","Prithvi","Deepak","Shalini",
        "Harshit","Preetam","Neeraj","Manvi","Abhay",
        "Gayathri","Samar","Raghav","Nisha","Smita"
    };
    return orthopaedicsDoctors;
}

else if (specialization == "Paediatrics") {
    String[] paediatricsDoctors = {
        "Anvi","Rohan","Mitali","Kishore","Ritika",
        "Lavanya","Tejas","Nandini","Ganesh","Shruti",
        "Lokesh","Keerthi","Aditya","Manoj","Bhavana"
    };
    return paediatricsDoctors;
}

else if (specialization == "Physiotherapy and Rehabilitation") {
    String[] physioDoctors = {
        "Gautham","Snehal","Vani","Prasad","Nikita",
        "Anshul","Varsha","Devika","Sonal","Harshit",
        "Preetam","Manvi","Gayathri","Samar","Raghav"
    };
    return physioDoctors;
}

else if (specialization == "Plastic and Reconstructive Surgery") {
    String[] plasticDoctors = {
        "Anshul","Varsha","Devika","Ritesh","Sonal",
        "Aman","Shivani","Harshit","Preetam","Divakar",
        "Neeraj","Manvi","Abhay","Gayathri","Samar"
    };
    return plasticDoctors;
}

else if (specialization == "Pulmonology") {
    String[] pulmonologyDoctors = {
        "Aman","Shivani","Harshit","Preetam","Divakar",
        "Rashmi","Deepika","Ananya","Rahul","Sneha",
        "Kiran","Meghana","Aditya","Manoj","Lavanya"
    };
    return pulmonologyDoctors;
}

else if (specialization == "Radiology") {
    String[] radiologyDoctors = {
        "Neeraj","Manvi","Abhay","Gayathri","Samar",
        "Raghav","Nisha","Arpita","Vivek","Smita",
        "Prerna","Adarsh","Lohith","Asha","Yogesh"
    };
    return radiologyDoctors;
}

else if (specialization == "Rheumatology") {
    String[] rheumatologyDoctors = {
        "Raghav","Nisha","Arpita","Vivek","Smita",
        "Prerna","Adarsh","Lohith","Asha","Yogesh",
        "Manan","Sujatha","Devendra","Naveena","Akash"
    };
    return rheumatologyDoctors;
}

else if (specialization == "Support Specialties") {
    String[] supportDoctors = {
        "Prerna","Adarsh","Lohith","Asha","Yogesh",
        "Hemant","Nivedita","Ritvik","Sagar","Anusha",
        "Kiran","Aditi","Pranav","Harika","Bhargav"
    };
    return supportDoctors;
}

else if (specialization == "Thoracic Surgery") {
    String[] thoracicDoctors = {
        "Manan","Sujatha","Devendra","Naveena","Akash",
        "Tejas","Rohini","Pratap","Vineet","Pallavi",
        "Yash","Aniket","Charitha","Girish","Tanvi"
    };
    return thoracicDoctors;
}

else if (specialization == "Transfusion Medicine") {
    String[] transfusionDoctors = {
        "Hemant","Nivedita","Ritvik","Sagar","Anusha",
        "Pranav","Lokendra","Harika","Bhargav","Ishita",
        "Tejal","Rohini","Pratap","Vineet","Pallavi"
    };
    return transfusionDoctors;
}

else if (specialization == "Urology") {
    String[] urologyDoctors = {
        "Kiran","Aditi","Pranav","Lokendra","Harika",
        "Bhargav","Ishita","Tejal","Rohini","Pratap",
        "Sudeep","Rashmi","Vineet","Pallavi","Yash"
    };
    return urologyDoctors;
}

else if (specialization == "Endocrine Surgery") {
    String[] endocrineDoctors = {
        "Bhargav","Ishita","Tejal","Rohini","Pratap",
        "Sudeep","Rashmi","Vineet","Pallavi","Yash",
        "Aniket","Charitha","Girish","Tanvi","Haroon"
    };
    return endocrineDoctors;
}

else if (specialization == "Vascular Surgery") {
    String[] vascularDoctors = {
        "Sudeep","Rashmi","Vineet","Pallavi","Yash",
        "Aniket","Charitha","Girish","Tanvi","Haroon",
        "Divakar","Manya","Arjun","Sathvik","Keerti"
    };
    return vascularDoctors;
}

else if (specialization == "Liver Transplant and Hepatobiliary Sciences") {
    String[] liverDoctors = {
        "Aniket","Charitha","Girish","Tanvi","Haroon",
        "Divakar","Manya","Arjun","Sathvik","Keerti",
        "Shravan","Deepthi","Anmol","Veda","Srinivas"
    };
    return liverDoctors;
}

else if (specialization == "Palliative Medicine") {
    String[] palliativeDoctors = {
        "Divakar","Manya","Arjun","Sathvik","Keerti",
        "Shravan","Deepthi","Anmol","Veda","Srinivas",
        "Sudha","Mahendra","Nikita","Harshad","Vijay"
    };
    return palliativeDoctors;
}

else if (specialization == "Medical Genetics") {
    String[] geneticsDoctors = {
        "Ravina","Karthik","Prisha","Rohit","Vaibhav",
        "Shravan","Deepthi","Anmol","Veda","Srinivas",
        "Sudha","Mahendra","Nikita","Harshad","Vijay"
    };
    return geneticsDoctors;
}

else if (specialization == "Pain and Palliative Medicine") {
    String[] painDoctors = {
        "Shravan","Deepthi","Anmol","Veda","Srinivas",
        "Sudha","Mahendra","Nikita","Harshad","Vijay",
        "Arun","Pavithra","Ritesh","Snehal","Kunal"
    };
    return painDoctors;
}

else if (specialization == "Geriatric Medicine") {
    String[] geriatricDoctors = {
        "Sudha","Mahendra","Nikita","Harshad","Vijay",
        "Arun","Pavithra","Ritesh","Snehal","Kunal",
        "Akhil","Devanshi","Prakash","Rupali","Sandeep"
    };
    return geriatricDoctors;
}

else if (specialization == "Critical Care") {
    String[] criticalDoctors = {
        "Arun","Pavithra","Ritesh","Snehal","Kunal",
        "Akhil","Devanshi","Prakash","Rupali","Sandeep",
        "Rohit","Harsha","Deepika","Preeti","Ananya"
    };
    return criticalDoctors;
}

else if (specialization == "Nuclear Medicine") {
    String[] nuclearDoctors = {
        "Akhil","Devanshi","Prakash","Rupali","Sandeep",
        "Rohit","Harsha","Deepika","Preeti","Ananya",
        "Rahul","Sneha","Kiran","Meghana","Aditya"
    };
    return nuclearDoctors;
}
        return null;
    }
	public static void getDoctors(String[] doctors) {
           
            System.out.println("fetching doctors....");
			 System.out.println("--------------------------------");
            for (String doctor : doctors) {
                System.out.println(doctor);

            }
           
            System.out.println("Above are the doctors List");
			 System.out.println("--------------------------------");
        }
}