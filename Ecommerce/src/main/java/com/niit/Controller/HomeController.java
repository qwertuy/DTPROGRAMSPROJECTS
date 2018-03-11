package com.niit.Controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Ecommerce_backend.DAO.CartDAO;
import com.niit.Ecommerce_backend.DAO.CategoryDAO;
import com.niit.Ecommerce_backend.DAO.ProductDAO;
import com.niit.Ecommerce_backend.DAO.ShipDAO;
import com.niit.Ecommerce_backend.DAO.UserDAO;
import com.niit.Ecommerce_backend.Model.CartModel;
import com.niit.Ecommerce_backend.Model.CategoryModel;
import com.niit.Ecommerce_backend.Model.ProductModel;

import com.niit.Ecommerce_backend.Model.ShipModel;
import com.niit.Ecommerce_backend.Model.UserModel;

@Controller
public class HomeController 
{
	
	
	
	@Autowired
	private CategoryDAO categoryDAO;
	@Autowired
    CategoryDAO categorys;
	
	@Autowired
    private UserDAO user1;
	@Autowired
	 private ProductDAO productDAO;
	@Autowired
	private CartDAO cart1;
	
	
	@Autowired
 	private ShipDAO ship1;
	
	
	public void ProductDAO(ProductDAO productDAO)
	{
		this.productDAO=productDAO;
	}
   @RequestMapping(value="/")
   		public ModelAndView indePage()
   		{
	   List<CategoryModel> list=categoryDAO.getAll();
	       ModelAndView mt=new ModelAndView("index");
	   	mt.addObject("clist",list);
			return mt;
	    
   		}
   @ModelAttribute
   public void addAttributes(Model model)
   {
 	  model.addAttribute("clist",categoryDAO.getAll());
   }
 
   @RequestMapping(value="/login")
   
    public ModelAndView LoginPage()
    {
	   ModelAndView mt1=new ModelAndView("login");
	   return mt1;
    }
   @RequestMapping(value="/reg")
	public ModelAndView regpage()
	{
		ModelAndView m2=new ModelAndView("registerpage");
		return m2;
		
	}	
  @RequestMapping(value ="/registerpage")
  public ModelAndView addUser(HttpServletRequest request)
  {
      
		
	   int u_id=Integer.valueOf(request.getParameter("userid"));
		
	  // int u_id=Integer.parseInt(request.getParameter("userid"));
	   
	   String u_name=request.getParameter("username");
	   
	   String u_pass=request.getParameter("userpass");
	   
	   String u_addr=request.getParameter("useraddress");
	   
	   String u_mail=request.getParameter("usermail");
	   
	   int u_age=Integer.valueOf(request.getParameter("userage"));
	   
	   //int u_age=Integer.parseInt(request.getParameter("userage"));
	   
	   String u_city=request.getParameter("usercity");
	   String u_phone=request.getParameter("userphone");
	   
	   //int u_phone=Integer.valueOf(request.getParameter("userphone"));
	   
	  // int u_phone=Integer.parseInt(request.getParameter("userphone"));
	   
	   String u_gen=request.getParameter("usergen");
	   
	   
	   
	   UserModel u=new UserModel();
	   u.setUserid(u_id);
	   u.setName(u_name);
	   u.setPassword(u_pass);
	   u.setAddress(u_addr);
	   u.setEmail(u_mail);
	   u.setAge(u_age);
	   u.setCity(u_city);
	   u.setPhone(u_phone);
	   u.setGender(u_gen);
	   u.setRole("ROLE_USER");
	   user1.addUser(u);
		//System.out.println(u.getUserid());
		
		ModelAndView mv = new ModelAndView("index");
		return mv;
  }
	
	
   
   @RequestMapping(value="/admin/product_edit")
 
 public ModelAndView editProducts(HttpServletRequest request){	
 int id=Integer.parseInt(request.getParameter("id"));
 
 List<CategoryModel> list=categoryDAO.getAll();
 ModelAndView mv=new ModelAndView("productEdit");
 mv.addObject("product",productDAO.findById(id) );	
 mv.addObject("slist", list);

 return mv;
 }
   @RequestMapping(value = "/admin/product_update", method = RequestMethod.POST)
   public  ModelAndView updateProduct(@RequestParam("file") MultipartFile file ,HttpServletRequest request) 
   { 

   	int id=Integer.valueOf(request.getParameter("id"));
   	String pname=request.getParameter("pname");
   	int price=Integer.valueOf(request.getParameter("price"));
   	int cid=Integer.valueOf(request.getParameter("cid"));
  // 	int sid=Integer.valueOf(request.getParameter("sid"));
   //	System.out.println(id+"-"+pname+"-"+price+"-"+cid+"-"+sid);
   	CategoryModel c=categoryDAO.findById(cid);
   	//SupplierModel s=supplierDAO.findById(sid);
   	//product2.addProduct(new ProductModel(id,pname,price,c,s));
   	
       ProductModel p=new ProductModel();
       p.setCategoryid(c);
       p.setProductname(pname);
       p.setProductprice(price);
       p.setProductid(id);
       String originalfile = file.getOriginalFilename();
       p.setP_image(originalfile);
       //p.setSuplierid(s);
       productDAO.update(p);
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
		
   
	@RequestMapping(value="/admin/product_delete")
	public ModelAndView deleteProduct(HttpServletRequest request){
		
		ProductModel p=productDAO.findById(Integer.valueOf(request.getParameter("id")));
		System.out.print(p);
	    productDAO.delete(p);
	    List<ProductModel> list=productDAO.getAll();
	    ModelAndView mv = new ModelAndView("productlistview");	
	    mv.addObject("slist",list);
	   return mv;
	}
	//Testing
	@RequestMapping(value ="/user/cart")
    public ModelAndView add() 
   {
	List<CategoryModel> list=categorys.getAll();

	ModelAndView mv = new ModelAndView("productdetails");
	
	mv.addObject("clist", list);
				return mv;
		
    }
	
	//view categorylist in header page
	@RequestMapping("/categoryproductlist")
	public ModelAndView productListFilter(HttpServletRequest request)
	{ 
		List<ProductModel> clist=productDAO.getFilterProducts(Integer.valueOf(request.getParameter("id")));
		//List<Product> list=productDao.getProducts();
		ModelAndView mv = new ModelAndView("categoryproductlist");	
		mv.addObject("list",clist);
		return mv;
	}
	@RequestMapping("/user/product")
	public ModelAndView product(HttpServletRequest request) 
	{
		
	    int id=Integer.valueOf(request.getParameter("id"));
	    ProductModel p=productDAO.findById(id);
		ModelAndView mv = new ModelAndView("productdetails");
		List<CategoryModel> c=categoryDAO.getAll();
		mv.addObject("list",c);
		mv.addObject("product", p);
		
		return mv;
	}
	//AddCartTable data
	@RequestMapping(value="/user/productdetails", method=RequestMethod.POST)
	public ModelAndView addCarttable(HttpServletRequest request) 
	{
		
		int id=Integer.valueOf(request.getParameter("prodid"));
		
		int quan=Integer.valueOf(request.getParameter("prodquantity"));
		
		int price=Integer.valueOf(request.getParameter("prodprice"));
		
		System.out.println(""+id+""+quan+""+price);
		ProductModel p=productDAO.findById(id);
		CartModel g=new CartModel();
		g.setPrices(price);
		g.setQuantity(quan);
		g.setProductid(p);
		
		List<CartModel> list=cart1.check(id);
		//cart1.save(g);
		int count=list.size();
		System.out.println("No of times: "+count);
		if(count==0)
		{
			cart1.save(g);
		}
		else
		{
			CartModel cart=cart1.findById(list.get(0).getCartid());
			int e=cart.getQuantity();
			
			int tot=e+quan;
			cart.setQuantity(tot);
			cart1.update(cart);
		}
		
		ModelAndView mv = new ModelAndView("viewcartdetail");
		
		List<CartModel> cartList=cart1.getAll();
		
		mv.addObject("cartlist", cartList);
		return mv;
		
	}
	@RequestMapping("/user/cart_delete")
	public ModelAndView editCart(HttpServletRequest request)
	{
		int cid=Integer.valueOf(request.getParameter("id"));
		CartModel c=cart1.findById(cid);
		cart1.delete(c);
		
		ModelAndView mv=new ModelAndView("viewcartdetail");
		List<CartModel> cartList=cart1.getAll();
		
		mv.addObject("cartlist", cartList);
		return mv;
	}
	
	//code for shipdetails
	@RequestMapping(value="/user/customerdetails")
	
	public ModelAndView customer()
	{
		ModelAndView m18=new ModelAndView("customerdetails");
	    return m18;
	}
	@RequestMapping(value="/user/customer")
	public ModelAndView customerpage(HttpServletRequest request)
	{
	    
		System.out.println("OUT");
	
	     //	int c_id=Integer.valueOf(request.getParameter("cusid"));
	        
		int c_id = Integer.parseInt(request.getParameter("cusid"));
	        
	        String c_name=request.getParameter("cname");
	 	   
	 	   String c_email=request.getParameter("cemail");
	 	   
	 	   String c_addr=request.getParameter("caddress");
	 	   
	 	   String c_phone=request.getParameter("cphone");
	 	   
	 	  String c_pay=request.getParameter("cpay");
	 	  
	 	  
	 	  ShipModel s1=new ShipModel();
	 	  
	 	  s1.setCusid(c_id);
	 	  s1.setCusname(c_name);
	 	  s1.setEmail(c_email);
	 	  s1.setAddress(c_addr);
	 	  s1.setPhone(c_phone);
	 	  s1.setPay(c_pay);
          	
	 	  ship1.addCus(s1);
	 	  System.out.println("><><><><>"+s1.getCusname());
	 	 ModelAndView m18=new ModelAndView("customerdetails");
		    return m18;
		  
	}
	//testing
	
@RequestMapping(value="/admin/viewshipdetails")
	
	public ModelAndView views()
	{
	System.out.println("IN");
	List<ShipModel> list=ship1.getAll();
	
		ModelAndView m18=new ModelAndView("viewshipdetails");
		m18.addObject("list",list);
	    return m18;
	}

	@RequestMapping("/user/thankyoupage")
	public ModelAndView thankyou(HttpServletRequest request)
	{
		
		System.out.println("****");
		
		ModelAndView k=new ModelAndView("thankyoupage");
		
		return k;
		
		
	}
	@RequestMapping("/user/check")
	public ModelAndView check(HttpServletRequest request)
	{
		System.out.println("hai");
		int id=Integer.parseInt(request.getParameter("cusid"));
		//String cemail=request.getParameter("cemail");
		 List<ShipModel> list=ship1.getAll();
		ModelAndView ck=new ModelAndView("thankyoupage");
		ck.addObject("sdetail",ship1.findById(id) );	
		// ck.addObject("slist", list);
		return ck;
	}
	
	@RequestMapping("/userlogged")
	public String userLogged() { 
		return "redirect:/";	
	}
	@RequestMapping("/noAccessPage")
	public ModelAndView notacess() 
	{
		ModelAndView m9=new ModelAndView("noAccessPage");
		//return "redirect:noAccessPage";
		return m9;
	}
	@RequestMapping(value="/sucess")
	public ModelAndView sucesspage()
	{
		ModelAndView m8=new ModelAndView("sucess");
		return m8;
		
	}
}
