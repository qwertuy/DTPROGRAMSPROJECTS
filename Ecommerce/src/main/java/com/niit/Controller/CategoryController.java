package com.niit.Controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Ecommerce_backend.DAO.CategoryDAO;
import com.niit.Ecommerce_backend.DAO.ProductDAO;
import com.niit.Ecommerce_backend.DAO.ShipDAO;
import com.niit.Ecommerce_backend.Model.CategoryModel;
import com.niit.Ecommerce_backend.Model.ProductModel;
import com.niit.Ecommerce_backend.Model.ShipModel;

@Controller

public class CategoryController {

	  @Autowired
	     CategoryDAO categorys;
	    
	     @Autowired
	     ProductDAO  product2;
	     

	 	
	       
		 //        /admin/add
		@RequestMapping(value ="admin/add")
		    public ModelAndView add() 
		{
			List<CategoryModel> list=categorys.getAll();
		
			ModelAndView mv = new ModelAndView("Adding");
			
			//ModelAndView mv1=new ModelAndView("AddingCategory");
			
			
			mv.addObject("clist", list);
						return mv;
						
						
				
		    }
		
		@RequestMapping(value ="admin/add1")
	    public ModelAndView add1() 
	{
		List<CategoryModel> list=categorys.getAll();
	
		
		
		ModelAndView mv1=new ModelAndView("AddingCategory");
		
		
		mv1.addObject("clist", list);
					return mv1;
					
					
			
	    }
	
		@RequestMapping("/admin/addProduct")
		public ModelAndView addProducts(@RequestParam("file") MultipartFile file,HttpServletRequest request) 
		{ 
			
			int id=Integer.valueOf(request.getParameter("id"));
			String pname=request.getParameter("pname");
			int price=Integer.valueOf(request.getParameter("price"));
			int cid=Integer.valueOf(request.getParameter("cid"));
			//int sid=Integer.valueOf(request.getParameter("sid"));
			//System.out.println(id+"-"+pname+"-"+price+"-"+cid+"-"+sid);
			CategoryModel c=categorys.findById(cid);
			//SupplierModel s=suppliers.findById(sid);
			//product2.addProduct(new ProductModel(id,pname,price,c,s));
			
	        ProductModel p=new ProductModel();
	        p.setCategoryid(c);
	        p.setProductname(pname);
	        p.setProductprice(price);
	        p.setProductid(id);
	        String originalfile = file.getOriginalFilename();
	        p.setP_image(originalfile);
	       // p.setSuplierid(s);
	        product2.addProduct(p);
	        String filepath = request.getSession().getServletContext().getRealPath("/");
	        
	        System.out.println(filepath+originalfile);
	        try {
	        	byte imagebyte[] = file.getBytes();
	        	BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath+"/resources/images/"+originalfile));
	        	fos.write(imagebyte);
	        	fos.close();
	        	} catch (IOException e) {
	        	e.printStackTrace();
	        	} catch (Exception e) {
	        	// TODO Auto-generated catch block
	        	e.printStackTrace();
	        	}

			ModelAndView mv = new ModelAndView("Adding");
			
			return mv;
		   
			
			
			}
		
		
		 @RequestMapping(value ="/admin/category")
		    public ModelAndView addcategorys(HttpServletRequest request)
		    {
		        
			 int c_id=Integer.valueOf(request.getParameter("c_id"));
				String c_name=request.getParameter("c_name");
				System.out.println(c_id);
				categorys.addCategory(new CategoryModel(c_id, c_name));
				ModelAndView mv = new ModelAndView("Adding");
				return mv;
		    }
	 
	   
}
