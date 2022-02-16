package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {


        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("====  Teste 1: Testando a função findById ====");

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println();
        System.out.println("====  Teste 2: Testando a função findByDepartment ====");

        Department dp = new Department(2,null);

        List<Seller> list = sellerDao.findByDepartment(dp);

        for (Seller sl : list) {

            System.out.println(sl);

        }

        System.out.println();
        System.out.println("====  Teste 3: Testando a função findAll ====");

        list = sellerDao.findAll();

        for (Seller sl : list) {

            System.out.println(sl);

        }

        System.out.println("====  Teste 4: Testando a função insert ====");
        Seller newSeller = new Seller(null, "Paulo", "paulrodrigo@gmail.com", new Date(), 4000.0, dp);
        sellerDao.insert(newSeller);
        System.out.println("Inserção com sucesso, Id: " + newSeller.getId());

    }
}
