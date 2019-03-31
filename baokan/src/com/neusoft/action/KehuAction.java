package com.neusoft.action;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.neusoft.pojo.Kehu;
import com.neusoft.pojo.KehuDAO;

public class KehuAction {

	
	private Kehu kehu;
	public Kehu getKehu() {
		return kehu;
	}
	public void setKehu(Kehu kehu) {
		this.kehu = kehu;
	}
	
	@Resource(name="kehuDAO")
	private KehuDAO kehuDAO;
	

	@Action(value="del",results={@Result(name="queryAll",location="/zjwqueryMange.jsp")})
	public String del()
	{
		kehuDAO.delete(kehu);
		kehuList = (ArrayList) kehuDAO.findAll();
		return "queryAll";
	}
	//=======================================================================================================
	
	Kehu toshow;
	public Kehu getToshow() {
		return toshow;
	}
	public void setToshow(Kehu toshow) {
		this.toshow = toshow;
	}
	@Action(value="toShow",results={@Result(name="toShow",location="/zjwshow.jsp")})
	public String toShow()
	{
		// kehu 3 null 0 0 
		//查询 id  kehu
		showKehu = kehuDAO.findById(kehu.getKid());
		return "toShow";
	}
	
	
	@Action(value="toshow",results={@Result(name="findById",location="/zjwqueryMange.jsp")})
	public String toshow()
	{

		return "findById";
	}
	
	
	
	
	//=========================================================================================================
	Kehu saveKehu;
	public Kehu getSaveKehu() {
		return saveKehu;
	}
	public void setSaveKehu(Kehu saveKehu) {
		this.saveKehu = saveKehu;
	}
	@Action(value="toSavePage",results={@Result(name="toSavePage",location="/zjwsave.jsp")})
	public String toSavePage()
	{
		// kehu 3 null 0 0 
		//新增 id  kehu
		
		return "toSavePage";
	}
	
	@Action(value="save",results={@Result(name="save",location="/zjwqueryMange.jsp")})
	public String save()
	{
		// kehu 3 null 0 0 
		kehuDAO.save(kehu);
		//保存   kehu
		kehuList = (ArrayList) kehuDAO.findAll();
		return "save";
	}
	
	Kehu showKehu;
	public Kehu getShowKehu() {
		return showKehu;
	}
	public void setShowKehu(Kehu showKehu) {
		this.showKehu = showKehu;
	}
	
	@Action(value="toUpdatePage",results={@Result(name="toUpdatePage",location="/zjwupdate.jsp")})
	public String toUpdatePage()
	{
		// kehu 3 null 0 0 
		//查询 id  kehu
		showKehu = kehuDAO.findById(kehu.getKid());
		return "toUpdatePage";
	}
	
	
	@Action(value="update",results={@Result(name="queryAll",location="/zjwqueryMange.jsp")})
	public String update()
	{
		// kehu 3 null 0 0 
		kehuDAO.update(kehu);
		//查询 id  kehu
		kehuList = (ArrayList) kehuDAO.findAll();
		return "queryAll";
	}
	
	
	ArrayList kehuList;
	
	
	@Action(value="queryAll",results={@Result(name="ok",location="/zjwqueryMange.jsp")})
	public String queryAll()
	{
	    kehuList = (ArrayList) kehuDAO.findAll();
	    
	    return "ok";
	}
	public ArrayList getKehuList() {
		return kehuList;
	}
	public void setKehuList(ArrayList kehuList) {
		this.kehuList = kehuList;
	}
	
}
