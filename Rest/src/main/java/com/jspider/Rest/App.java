package com.jspider.Rest;

import java.util.List;
import java.util.Scanner;

import com.jspider.dto.ResturantDto;
import com.jspiders.restaurant.entity.RestaurantInfo;
import com.restaurant.repository.RestaurantRepository;
import com.restaurant.repository.ResturantHqlRepository;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		RestaurantRepository repository = new RestaurantRepository();
		Scanner scanner = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Save Restaurant Details");
			System.out.println("2. Get Specific Restaurant Details");
			System.out.println("3. Get All Restaurant Details");
			System.out.println("4. Update Restaurant Details");
			System.out.println("5. Delete Restaurant Details");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
//				System.out.println("Enter id : ");
//				int id = scanner.nextInt();
//				System.out.println("Enter name : ");
//				String name = scanner.next();
//				System.out.println("Enter type : ");
//				String type = scanner.next();
//				System.out.println("Enter address : ");
//				String address = scanner.next();
//				System.out.println("Enter menu : ");
//				String menu = scanner.next();
//				System.out.println("Enter rating : ");
//				String rating = scanner.next();
//				System.out.println("Enter pincode : ");
//				String pincode = scanner.next();
//				RestaurantInfo resturantInfo = new RestaurantInfo();
				RestaurantInfo restaurantInfo = new RestaurantInfo();
//				restaurantInfo.setId(1);
				restaurantInfo.setName("NagaArjuna");
				restaurantInfo.setType("Veg/Non Veg");
				restaurantInfo.setAddress("Marathalli");
				restaurantInfo.setMenu("null");
				restaurantInfo.setRating("4.2");
				restaurantInfo.setPinCode("534402");
				repository.saveRestaurantDetails(restaurantInfo);
				System.out.println(restaurantInfo);
				System.out.println("Successfully Inserted in db ");
				break;
			case 2:
				System.out.println("Enter id : ");
				int id3 = scanner.nextInt();
				RestaurantInfo restaurantDetails = repository.getRestaurantDetails(id3);
				System.out.println("Single data is " + restaurantDetails);
				RestaurantInfo restaurantDetails2 = repository.getRestaurantDetails(id3);
				System.out.println("Single data is " + restaurantDetails);
				RestaurantInfo restaurantDetails3 = repository.getRestaurantDetails(id3);
				System.out.println("Single data is " + restaurantDetails);
				break;
			case 3:
				ResturantHqlRepository resturantHqlRepository=new ResturantHqlRepository();
				resturantHqlRepository.findAll().forEach(each->{
					System.out.println(each);
				});
//				List<RestaurantInfo> getAll=resturantHqlRepository.findAll();
//				getall.forEach(each->{
//					System.out.println(each);
//				});
//				List<RestaurantInfo> get = repository.getAllRestaurantDetails();
//				System.out.println(get);
				break;

			case 4:
				
				ResturantDto resturantDto=new ResturantDto();
				resturantDto.setId(1);
				resturantDto.setAddress("sjdnjks");
				resturantDto.setRating("4.5");
				repository.updateRestaurantDetails(resturantDto);
				
				System.out.println("update successfully");
				break;
			case 5:
				System.out.println("Enter id which you delete : ");
				int id2 = scanner.nextInt();
				repository.deleteRestaurantDetails(id2);
				System.out.println("delete successfully");
				break;
			case 6:
				ResturantHqlRepository resturantHqlRepository2=new ResturantHqlRepository();
//				System.out.println("Enter name which you want : ");
//				String id4 = scanner.nextLine();
				String s="NagaArjuna";
				 List<RestaurantInfo> findByResturantName = resturantHqlRepository2.findByResturantName(s);
				 System.out.println("single by name is :"+findByResturantName);
				
				break;
			case 7:
				//Update byid
				ResturantHqlRepository resturantHqlRepository3=new ResturantHqlRepository();
				ResturantDto resturantDto1=new ResturantDto();
				resturantDto1.setId(124);
				resturantDto1.setAddress("rajajinagar");
				resturantDto1.setPinCode("535546");
				resturantHqlRepository3.UpdateById(resturantDto1);
				
				System.out.println("upadated succssfully");
				break;
			case 9:
				System.out.println("Deleteing by name");
				ResturantHqlRepository resturantHqlRepository4=new ResturantHqlRepository();
				ResturantDto resturantDto2=new ResturantDto();
				resturantDto2.setName("aagan");
				resturantHqlRepository4.deleteByname(resturantDto2);
			case 8:
				System.out.println("Exiting program.");
				System.exit(0);
			default:
				System.out.println("Invalid option. Please try again.");
				break;
			}
		}

	}
}
