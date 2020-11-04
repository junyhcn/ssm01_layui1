package com.kgc.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.entity.Emp;
import com.kgc.entity.TreeNode;
import com.kgc.entity.TreeResult;
import com.kgc.service.DeptService;
import com.kgc.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @Autowired
    private DeptService deptService;

/*    {
        "code": 0,
            "msg": "",
            "count": 1000,
            "data": [{}, {}]
    }*/
    @RequestMapping("list")
    @ResponseBody//将方法的返回值转换成json对象返回
    public Map list(@RequestParam(value = "page",required = false,defaultValue = "1") int page,
                    @RequestParam(value = "limit",required = false,defaultValue = "10")int limit,Emp emp){//emp  ename  deptid
        Map map=new HashMap();
        PageInfo<Emp> pageInfo=empService.findAll(page,limit,emp);
        map.put("code",0);
        map.put("msg","OK");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
       return  map;
    }
    @RequestMapping("save")
    @ResponseBody//将方法的返回值转换成json对象返回
    public Map saveEmp(Emp emp){
        empService.saveEmp(emp);
        Map map=new HashMap();
        map.put("msg","增加成功");
        return map;
    }

    @RequestMapping("del/{id}")
    @ResponseBody//将方法的返回值转换成json对象返回
    public Map delEmp(@PathVariable("id")int id){
        empService.deleteEmp(id);
        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","删除成功");
        return map;
    }

    @RequestMapping("find/{id}")
    @ResponseBody//将方法的返回值转换成json对象返回
    public Emp findEmp(@PathVariable("id")int id){
        Emp emp=empService.findById(id);
        return emp;
    }


    @RequestMapping("update")
    @ResponseBody//将方法的返回值转换成json对象返回
    public Map updateEmp(Emp emp){
        empService.updateEmp(emp);
        Map map=new HashMap();
        map.put("msg","修改成功");
        return map;
    }


    @RequestMapping("dels")
    @ResponseBody//将方法的返回值转换成json对象返回
    public Map delsEmp(int[] ids){
        empService.deletesEmp(ids);
        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","删除成功");
        return map;
    }

    //生成多组树
    @RequestMapping("depts")
    @ResponseBody//将方法的返回值转换成json对象返回
    public List<TreeNode> detps(){
        return deptService.findDetps();
    }

    //生成二级
    @RequestMapping("depts1")
    @ResponseBody
    public List<TreeResult> depts1(){
        return deptService.findTreeResult();
    }

}
