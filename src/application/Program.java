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

        System.out.println("====  Teste 2: Testando a função findByDepartment ====");

        Department dp = new Department(2,null);

        List<Seller> list = sellerDao.findByDepartment(dp);

        for (Seller sl : list) {

            System.out.println(sl);

        }


    }
}
