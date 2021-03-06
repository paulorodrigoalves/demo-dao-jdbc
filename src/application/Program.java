package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("\n====  Teste 1: Testando a função findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n====  Teste 2: Testando a função findByDepartment ====");
        Department dp = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(dp);

        for (Seller sl : list) {
            System.out.println(sl);
        }

        System.out.println("\n====  Teste 3: Testando a função findAll ====");
        list = sellerDao.findAll();
        for (Seller sl : list) {
            System.out.println(sl);
        }

        System.out.println("\n====  Teste 4: Testando a função insert ====");
        Seller newSeller = new Seller(null, "Paulo", "paulrodrigo@gmail.com", new Date(), 4000.0, dp);
        sellerDao.insert(newSeller);
        System.out.println("Inserção com sucesso, Id: " + newSeller.getId());

        System.out.println("\n====  Teste 5: Testando a função update ====");
        seller = sellerDao.findById(1);
        seller.setName("Ana Alves");
        sellerDao.update(seller);
        System.out.println("Atualização completada!");

        System.out.println("\n====  Teste 6: Testando a função delete ====");
        System.out.println("Informe um id para ser deletado: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Seller deltado com sucesso!");


    }
}
